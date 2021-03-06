//TODO Setup padding and cropping to size methods in string utilities

package Factories;

import DataStore.Genres;
import Exceptions.EmptyFieldException;
import Exceptions.GenreOutOfBoundsException;
import FileTypes.MP3;
import TagTypes.ID3v1;
import Utilities.ByteUtilities;
import Utilities.StringUtilities;

import java.io.UnsupportedEncodingException;

/**
 * Factory class used for creating, deleting and manipulating the ID3v1 tag.
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

    private static final String EMPTY_FIELD_STRING = "";
    private static final int EMPTY_FIELD_INT = -1;
    private static final boolean EMPTY_FIELD_BOOLEAN = false;

    /**
     * Creates a new ID3v1 tag and starts the field reading process.
     *
     * @param mp3 The mp3 file containing the tag data.
     * @return The ID3v1 tag with all fields populated.
     */
    public static ID3v1 extractTag(MP3 mp3) {
        ID3v1 id3v1 = new ID3v1();
        id3v1.setRaw(ByteUtilities.getID3v1Bytes(mp3));
        return populateFields(id3v1);
    }

    /**
     * Reads all tag fields.
     *
     * @param tag The empty ID3v1 tag containing the raw tag bytes.
     * @return The ID3v1 tag with all attributes populated.
     */
    private static ID3v1 populateFields(ID3v1 tag) {

        String title;
        try {
            title = readRawTitle(tag);
        } catch (EmptyFieldException efe) {
            title = EMPTY_FIELD_STRING;
        }

        String artist;
        try {
            artist = readRawArtist(tag);
        } catch (EmptyFieldException efe) {
            artist = EMPTY_FIELD_STRING;
        }

        String album;
        try {
            album = readRawAlbum(tag);
        } catch (EmptyFieldException efe) {
            album = EMPTY_FIELD_STRING;
        }

        String year;
        try {
            year = readRawYear(tag);
        } catch (EmptyFieldException efe) {
            year = EMPTY_FIELD_STRING;
        }

        String comment;
        try {
            comment = readRawComment(tag);
        } catch (EmptyFieldException efe) {
            comment = EMPTY_FIELD_STRING;
        }

        boolean zeroByte = readRawZeroByte(tag);
        int trackNumber = readRawTrackNumber(tag);
        int genreIndex = readRawGenreIndex(tag);

        String genre;
        try {
            genre = Genres.getGenreFromIndexID3v1Tag(genreIndex);
        } catch (GenreOutOfBoundsException goobe) {
            genre = EMPTY_FIELD_STRING;
        }

        tag.populateFields(title, artist, album, year, comment, zeroByte, trackNumber, genreIndex, genre);
        return tag;
    }

    /**
     * Reads the title field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The title of the mp3 track.
     * @throws EmptyFieldException Thrown if the title field does not contain a value.
     */
    private static String readRawTitle(ID3v1 tag) throws EmptyFieldException {
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
     * Updates the title field in the raw tag bytes.
     *
     * @param tag The ID3v1 tag being modified.
     */
    public static byte[] updateRawTitle(ID3v1 tag) {
        return ByteUtilities.updateSection(tag.getRaw(), tag.getTitle(), TITLE_FIELD_START, TITLE_FIELD_LENGTH);
    }

    /**
     * Reads the artist field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The artist of the mp3 track.
     * @throws EmptyFieldException Thrown if the artist field does not contain a value.
     */
    private static String readRawArtist(ID3v1 tag) throws EmptyFieldException {
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
     * Updates the artist field in the raw tag bytes.
     *
     * @param tag The ID3v1 tag being modified.
     */
    public static byte[] updateRawArtist(ID3v1 tag) {
        return ByteUtilities.updateSection(tag.getRaw(), tag.getArtist(), ARTIST_FIELD_START, ARTIST_FIELD_LENGTH);
    }

    /**
     * Reads the album field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The album that the mp3 track is part of.
     * @throws EmptyFieldException Thrown if the album field does not contain a value.
     */
    private static String readRawAlbum(ID3v1 tag) throws EmptyFieldException {
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
     * Updates the album field in the raw tag bytes.
     *
     * @param tag The ID3v1 tag being modified.
     */
    public static byte[] updateRawAlbum(ID3v1 tag) {
        return ByteUtilities.updateSection(tag.getRaw(), tag.getAlbum(), ALBUM_FIELD_START, ALBUM_FIELD_LENGTH);
    }

    /**
     * Reads the year field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The year which the song was made.
     * @throws EmptyFieldException Thrown if the year field does not contain a value.
     */
    private static String readRawYear(ID3v1 tag) throws EmptyFieldException {
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
     * Updates the year field in the raw tag bytes.
     *
     * @param tag The ID3v1 tag being modified.
     */
    public static byte[] updateRawYear(ID3v1 tag) {
        return ByteUtilities.updateSection(tag.getRaw(), tag.getYear(), YEAR_FIELD_START, YEAR_FIELD_LENGTH);
    }

    /**
     * Reads the comment field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The written comments on the track.
     * @throws EmptyFieldException Thrown if the comment field does not contain a value.
     */
    private static String readRawComment(ID3v1 tag) throws EmptyFieldException {
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
     * Updates the comment field in the raw tag bytes.
     *
     * @param tag The ID3v1 tag being modified.
     */
    public static byte[] updateRawComment(ID3v1 tag) {
        return ByteUtilities.updateSection(tag.getRaw(), tag.getComment(), COMMENT_FIELD_START, COMMENT_FIELD_LENGTH_V1);
    }

    /**
     * Reads the zero byte field from the tag bytes in the mp3 file.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return A boolean indicating whether the mp3 file contains a value for the track number field.
     */
    private static boolean readRawZeroByte(ID3v1 tag) {
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
     * Updates the zero byte field in the raw tag bytes.
     *
     * @param tag The ID3v1 tag being modified.
     */
    public static byte[] updateRawZeroByte(ID3v1 tag) {
        String zeroByteValue = "0";
        if (tag.hasZeroByte()) zeroByteValue = "1";
        return ByteUtilities.updateSection(tag.getRaw(), zeroByteValue, ZERO_BYTE_FIELD_START, ZERO_BYTE_FIELD_LENGTH);
    }

    /**
     * Reads the track number field from the tag bytes in the mp3 file if the zero byte field indicates that a value is present
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The track number of the song in the album / set.
     */
    private static int readRawTrackNumber(ID3v1 tag) {
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
     * Updates the track number field in the raw tag bytes.
     *
     * @param tag The ID3v1 tag being modified.
     */
    public static byte[] updateRawTrackNumber(ID3v1 tag) {
        return ByteUtilities.updateSection(tag.getRaw(), String.valueOf(tag.getTrackNumber()), TRACK_NUMBER_FIELD_START, TRACK_NUMBER_FIELD_LENGTH);
    }

    /**
     * Reads the genre index field from the tag bytes in the mp3 file.
     * ID3v1 contains 80 possible genres.
     *
     * @param tag The ID3v1 tag containing the raw tag bytes.
     * @return The index indicating the genre of the track.
     */
    private static int readRawGenreIndex(ID3v1 tag) {
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

    /**
     * Updates the genre index field in the raw tag bytes.
     *
     * @param tag The ID3v1 tag being modified.
     */
    public static byte[] updateRawGenreIndex(ID3v1 tag) {
        return ByteUtilities.updateSection(tag.getRaw(), String.valueOf(tag.getGenreIndex()), GENRE_FIELD_START, GENRE_FIELD_LENGTH);
    }
}