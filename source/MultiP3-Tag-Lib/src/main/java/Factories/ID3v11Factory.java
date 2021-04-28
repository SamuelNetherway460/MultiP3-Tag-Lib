package Factories;

import DataStore.Genres;
import Exceptions.EmptyFieldException;
import Exceptions.GenreOutOfBoundsException;
import FileTypes.MP3;
import TagTypes.ID3v11;
import Utilities.BufferUtilities;
import Utilities.ByteUtilities;
import Utilities.StringUtilities;

import java.io.UnsupportedEncodingException;

import static Utilities.BufferUtilities.convertByteToInt;

public class ID3v11Factory extends ID3v1Factory {

    public static final int TRACK_NUMBER_MAX = 255;
    public static final int TRACK_NUMBER_MIN = 0;
    public static final int ZERO_BYTE_FIELD_START = 125;
    public static final int TRACK_NUMBER_FIELD_START = 126;

    public static final int COMMENT_FIELD_LENGTH = 28;
    public static final int ZERO_BYTE_FIELD_LENGTH = 1;
    public static final int TRACK_NUMBER_FIELD_LENGTH = 1;

    public ID3v11Factory() {
        super();
    }

    /**
     * Creates a new ID3v1 tag and starts the field reading process.
     *
     * @param mp3 The mp3 file containing the tag data.
     * @return The FileTypes.MP3.ID3.ID3v1 tag with all fields populated.
     */
    public static ID3v11 extractTag(MP3 mp3) {
        ID3v11 id3v11 = new ID3v11();
        id3v11.setRaw(ByteUtilities.getID3v1Bytes(mp3));
        return populateFields(id3v11);
    }

    /**
     * Reads all tag fields.
     *
     * @param tag The empty FileTypes.MP3.ID3.ID3v1 tag containing the raw tag bytes.
     * @return The FileTypes.MP3.ID3.ID3v1 tag with all attributes populated.
     */
    private static ID3v11 populateFields(ID3v11 tag) {

        String title;
        try {
            title = readRawTitle(tag.getRaw());
        } catch (EmptyFieldException efe) {
            title = EMPTY_FIELD_STRING;
        }

        String artist;
        try {
            artist = readRawArtist(tag.getRaw());
        } catch (EmptyFieldException efe) {
            artist = EMPTY_FIELD_STRING;
        }

        String album;
        try {
            album = readRawAlbum(tag.getRaw());
        } catch (EmptyFieldException efe) {
            album = EMPTY_FIELD_STRING;
        }

        int year;
        try {
            year = readRawYear(tag.getRaw());
        } catch (EmptyFieldException efe) {
            year = EMPTY_FIELD_INT;
        }

        String comment;
        try {
            comment = readRawComment(tag.getRaw());
        } catch (EmptyFieldException efe) {
            comment = EMPTY_FIELD_STRING;
        }

        boolean hasZeroByte = readRawZeroByte(tag.getRaw());
        int trackNumber = readRawTrackNumber(tag.getRaw());
        int genreIndex = readRawGenreIndex(tag.getRaw());

        String genre;
        try {
            genre = Genres.getGenreFromIndexID3v1Tag(genreIndex);
        } catch (GenreOutOfBoundsException goobe) {
            genre = EMPTY_FIELD_STRING;
        }

        tag.populateFields(title, artist, album, year, comment, hasZeroByte, trackNumber, genreIndex, genre, tag.getRaw());
        return tag;
    }

    /**
     * Reads the comment field from the tag bytes in the mp3 file.
     *
     * @param raw The ID3v1.1 tag as an array of bytes.
     * @return The written comments on the track.
     * @throws EmptyFieldException Thrown if the comment field does not contain a value.
     */
    protected static String readRawComment(byte[] raw) throws EmptyFieldException {
        String paddedComment = EMPTY_STRING;
        String comment = EMPTY_STRING;
        try {
            paddedComment = BufferUtilities.convertBytesToString(raw, COMMENT_FIELD_START, COMMENT_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            comment = StringUtilities.removePadding(paddedComment);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (comment.equalsIgnoreCase(EMPTY_STRING)) throw new EmptyFieldException("[ERROR] Comment field does not contain a value");
        return comment;
    }

    /**
     * Updates the comment field in the raw tag bytes.
     *
     * @param raw The ID3v1.1 tag as an array of bytes.
     * @param comment The replacement value for the comment field.
     * @throws IllegalArgumentException If the number of characters used for the comment is greater than the maximum.
     */
    public static byte[] updateRawComment(byte[] raw, String comment) throws IllegalArgumentException {
        if (comment.length() > COMMENT_FIELD_LENGTH) {
            throw new IllegalArgumentException("[ERROR] Comment has length " + comment.length()
                + " which is greater than the maximum permitted length of " + COMMENT_FIELD_LENGTH);
        } else {
            return ByteUtilities.updateSection(raw, comment, COMMENT_FIELD_START, COMMENT_FIELD_LENGTH);
        }
    }

    /**
     * Reads the zero byte field from the tag bytes in the mp3 file.
     *
     * @param raw The ID3v1.1 tag as an array of bytes.
     * @return A boolean indicating whether the mp3 file contains a value for the track number field.
     */
    public static boolean readRawZeroByte(byte[] raw) {
        return raw[ZERO_BYTE_FIELD_START] == '\00';
    }

    /**
     * Updates the zero byte field in the raw tag bytes.
     *
     * @param raw The ID3v1.1 tag as an array of bytes.
     * @return The byte array with the updated zero byte field.
     */
    public static byte[] updateRawZeroByte(byte[] raw) {
        raw[ZERO_BYTE_FIELD_START] = '\00';
        return raw;
    }

    /**
     * Reads the track number field from the tag bytes in the mp3 file if the zero byte field indicates that a value is present
     *
     * @param raw The ID3v1.1 tag as an array of bytes.
     * @return The track number of the song in the album / set.
     */
    public static int readRawTrackNumber(byte[] raw) {
        int trackNumber = ERROR_INT;
        if (readRawZeroByte(raw)) {
            try {
                int temp = convertByteToInt(raw[TRACK_NUMBER_FIELD_START]);
                trackNumber = (temp < 0) ? temp + 256 : temp;
            } catch (Exception e) {
                return ERROR_INT;
            }
        }
        return trackNumber;
    }

    /**
     * Updates the track number field in the raw tag bytes.
     *
     * @param raw The ID3v1.1 tag as an array of bytes.
     * @param trackNumber The replacement value for the track number field.
     * @throws IllegalArgumentException If the track number is out of the permitted bounds.
     */
    public static byte[] updateRawTrackNumber(byte[] raw, int trackNumber) throws IllegalArgumentException {
        if (trackNumber < TRACK_NUMBER_MIN || trackNumber > TRACK_NUMBER_MAX) {
            throw new IllegalArgumentException("[ERROR] The track number " + trackNumber
                + " is not within the range of " + TRACK_NUMBER_MIN + " and " + TRACK_NUMBER_MAX);
        } else {
            return ByteUtilities.updateSection(raw, trackNumber, TRACK_NUMBER_FIELD_START);
        }
    }
}
