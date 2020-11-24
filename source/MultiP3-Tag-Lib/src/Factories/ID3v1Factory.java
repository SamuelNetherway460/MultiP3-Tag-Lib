//TODO Setup padding and cropping to size methods in string utilities

package Factories;

import DataStore.Genres;
import Exceptions.EmptyFieldException;
import Exceptions.GenreOutOfBoundsException;
import FileTypes.MP3;
import TagTypes.ID3v1;
import Utilities.BufferUtilities;
import Utilities.StringUtilities;

import java.io.UnsupportedEncodingException;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v1Factory {

    private static final String DEFAULT_CHARSET_NAME = "ISO-8859-1";

    private static final int HEADER_START = 0;
    private static final int TITLE_FIELD_START = 3;
    private static final int ARTIST_FIELD_START = 33;
    private static final int ALBUM_FIELD_START = 63;
    private static final int YEAR_FIELD_START = 93;
    private static final int COMMENT_FIELD_START = 97;
    private static final int ZERO_BYTE_FIELD_START = 125;
    private static final int TRACK_NUMBER_FIELD_START = 126;
    private static final int GENRE_FIELD_START = 127;

    private static final int HEADER_FIELD_LENGTH = 3;
    private static final int TITLE_FIELD_LENGTH = 30;
    private static final int ARTIST_FIELD_LENGTH = 30;
    private static final int ALBUM_FIELD_LENGTH = 30;
    private static final int YEAR_FIELD_LENGTH = 4;
    private static final int COMMENT_FIELD_LENGTH_V1 = 28;
    private static final int COMMENT_FIELD_LENGTH_V2 = 30;
    private static final int ZERO_BYTE_FIELD_LENGTH = 1; // Binary 0 if a track number is stored
    private static final int TRACK_NUMBER_FIELD_LENGTH = 1;
    private static final int GENRE_FIELD_LENGTH = 1; // Index in a list of genres, or 255

    private static final String EMPTY_STRING = "";
    private static final String ERROR_STRING = "ERROR";
    private static final int ERROR_INT = -1;

    /**
     * Creates a new ID3v1 tag and starts the field reading process.
     *
     * @param mp3 The mp3 file containing the tag data.
     * @return The ID3v1 tag with all fields populated.
     */
    public static ID3v1 createTag(MP3 mp3) {
        return readFields(new ID3v1(mp3));
    }

    /**
     * Reads all tag fields.
     *
     * @param tag The empty ID3v1 tag containing the raw tag bytes.
     * @return The ID3v1 tag with all attributes populated.
     */
    private static ID3v1 readFields(ID3v1 tag) {

        try {
            tag.setTitle(readTitle(tag));
        } catch (EmptyFieldException efe) {
            tag.setTitle(EMPTY_STRING);
        }

        try {
            tag.setArtist(readArtist(tag));
        } catch (EmptyFieldException efe) {
            tag.setArtist(EMPTY_STRING);
        }

        try {
            tag.setAlbum(readAlbum(tag));
        } catch (EmptyFieldException efe) {
            tag.setAlbum(EMPTY_STRING);
        }

        try {
            tag.setYear(readYear(tag));
        } catch (EmptyFieldException efe) {
            tag.setYear(EMPTY_STRING);
        }

        try {
            tag.setComment(readComment(tag));
        } catch (EmptyFieldException efe) {
            tag.setComment(EMPTY_STRING);
        }

        tag.setZeroByte(readZeroByte(tag));
        tag.setTrackNumber(readTrackNumber(tag));
        tag.setGenreIndex(readGenreIndex(tag));

        try {
            tag.setGenre(Genres.getGenreFromIndexID3v1EnhancedTag(tag.getGenreIndex()));
        } catch (GenreOutOfBoundsException goobe) {
            tag.setGenre(EMPTY_STRING);
        }

        return tag;
    }

    /**
     * Reads the title field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The title of the mp3 track.
     * @throws EmptyFieldException Thrown if the title field does not contain a value.
     */
    public static String readTitle(ID3v1 tag) throws EmptyFieldException {
        String paddedTitle = EMPTY_STRING;
        String title = EMPTY_STRING;
        try {
            paddedTitle = BufferUtilities.convertBytesToString(tag.getRaw(), TITLE_FIELD_START, TITLE_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            title = StringUtilities.removePadding(paddedTitle);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (title.equalsIgnoreCase(EMPTY_STRING))  throw new EmptyFieldException("[EMPTY FIELD EXCEPTION] Title field does not contain a value");
        return title;
    }

    /**
     * Reads the artist field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The artist of the mp3 track.
     * @throws EmptyFieldException Thrown if the artist field does not contain a value.
     */
    public static String readArtist(ID3v1 tag) throws EmptyFieldException {
        String paddedArtist = EMPTY_STRING;
        String artist = EMPTY_STRING;
        try {
            paddedArtist = BufferUtilities.convertBytesToString(tag.getRaw(), ARTIST_FIELD_START, ARTIST_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            artist = StringUtilities.removePadding(paddedArtist);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (artist.equalsIgnoreCase(EMPTY_STRING))  throw new EmptyFieldException("[EMPTY FIELD EXCEPTION] Artist field does not contain a value");
        return artist;
    }

    /**
     * Reads the album field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The album that the mp3 track is part of.
     * @throws EmptyFieldException Thrown if the album field does not contain a value.
     */
    public static String readAlbum(ID3v1 tag) throws EmptyFieldException {
        String paddedAlbum = EMPTY_STRING;
        String album = EMPTY_STRING;
        try {
            paddedAlbum = BufferUtilities.convertBytesToString(tag.getRaw(), ALBUM_FIELD_START, ALBUM_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            album = StringUtilities.removePadding(paddedAlbum);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (album.equalsIgnoreCase(EMPTY_STRING)) throw new EmptyFieldException("[EMPTY FIELD EXCEPTION] Album field does not contain a value");
        return album;
    }

    /**
     * Reads the year field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The year which the song was made.
     * @throws EmptyFieldException Thrown if the year field does not contain a value.
     */
    public static String readYear(ID3v1 tag) throws EmptyFieldException {
        String paddedYear = EMPTY_STRING;
        String year = EMPTY_STRING;
        try {
            paddedYear = BufferUtilities.convertBytesToString(tag.getRaw(), YEAR_FIELD_START, YEAR_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            year = StringUtilities.removePadding(paddedYear);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (year.equalsIgnoreCase(EMPTY_STRING)) throw new EmptyFieldException("[EMPTY FIELD EXCEPTION] Year field does not contain a value");
        return year;
    }

    /**
     * Reads the comment field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The written comments on the track.
     * @throws EmptyFieldException Thrown if the comment field does not contain a value.
     */
    public static String readComment(ID3v1 tag) throws EmptyFieldException {
        String paddedComment = EMPTY_STRING;
        String comment = EMPTY_STRING;
        try {
            paddedComment = BufferUtilities.convertBytesToString(tag.getRaw(), COMMENT_FIELD_START, COMMENT_FIELD_LENGTH_V1, DEFAULT_CHARSET_NAME);
            comment = StringUtilities.removePadding(paddedComment);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (comment.equalsIgnoreCase(EMPTY_STRING)) throw new EmptyFieldException("[EMPTY FIELD EXCEPTION] Comment field does not contain a value");
        return comment;
    }

    /**
     * Reads the zero byte field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return A boolean indicating whether the mp3 file contains a value for the track number field.
     */
    public static boolean readZeroByte(ID3v1 tag) {
        String paddedZeroByte = EMPTY_STRING;
        String stringZeroByte = EMPTY_STRING;
        boolean zeroByte = false;
        try {
            stringZeroByte = BufferUtilities.convertBytesToString(tag.getRaw(), ZERO_BYTE_FIELD_START, ZERO_BYTE_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            if (stringZeroByte.equalsIgnoreCase("0")) {
                zeroByte = true;
            } else {
                zeroByte = false;
            }
        } catch (UnsupportedEncodingException uee) {
            return false;
        }
        return zeroByte;
    }

    /**
     * Reads the track number field from the tag bytes in the mp3 file if the zero byte field indicates that a value is present
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The track number of the song in the album / set.
     */
    public static int readTrackNumber(ID3v1 tag) {
        int trackNumber = ERROR_INT; //Error Value
        if (tag.hasZeroByte()) {
            String paddedTrackNumber = EMPTY_STRING;
            String stringTrackNumbver = EMPTY_STRING;
            try {
                paddedTrackNumber = BufferUtilities.convertBytesToString(tag.getRaw(), TRACK_NUMBER_FIELD_START, TRACK_NUMBER_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
                stringTrackNumbver = StringUtilities.removePadding(paddedTrackNumber);
                trackNumber = Integer.parseInt(stringTrackNumbver);
            } catch (UnsupportedEncodingException uee) {
            }
        }
        return trackNumber;
    }

    /**
     * Reads the genre index field from the tag bytes in the mp3 file.
     * ID3v1 contains 80 possible genres.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The index indicating the genre of the track.
     * @throws InvalidFieldValue Thrown if the value contained in the field is invalid.
     *                           If the genre index is out of bounds then the InvalidFieldValue exception is thrown.
     */
    public static int readGenreIndex(ID3v1 tag) {
        String genreIndexString = EMPTY_STRING;
        int genreIndex = ERROR_INT; // Error Value
        try {
            genreIndexString = BufferUtilities.convertBytesToString(tag.getRaw(), GENRE_FIELD_START, GENRE_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            genreIndex = genreIndexString.hashCode();
        } catch (UnsupportedEncodingException uee) {
            return ERROR_INT;
        }
        return genreIndex;
    }
}