//TODO Setup padding and cropping to size methods in string utilities

package Factories;

import DataStore.Genres;
import Exceptions.EmptyFieldException;
import Exceptions.GenreOutOfBoundsException;
import FileTypes.MP3;
import TagTypes.ID3v1;
import Utilities.BufferUtilities;
import Utilities.ByteUtilities;
import Utilities.StringUtilities;

import java.io.UnsupportedEncodingException;

/**
 * Factory class used for creating, deleting and manipulating the FileTypes.MP3.ID3.ID3v1 tag.
 *
 * @author Samuel Netherway
 */
public class ID3v1Factory {

    public static final String DEFAULT_CHARSET_NAME = "ISO-8859-1";
    public static final int ID3V1_TAG_LENGTH = 128;

    public static final int HEADER_START = 0;
    public static final int TITLE_FIELD_START = 3;
    public static final int ARTIST_FIELD_START = 33;
    public static final int ALBUM_FIELD_START = 63;
    public static final int YEAR_FIELD_START = 93;
    public static final int COMMENT_FIELD_START = 97;
    public static final int GENRE_FIELD_START = 127;

    public static final int HEADER_FIELD_LENGTH = 3;
    public static final int TITLE_FIELD_LENGTH = 30;
    public static final int ARTIST_FIELD_LENGTH = 30;
    public static final int ALBUM_FIELD_LENGTH = 30;
    public static final int YEAR_FIELD_LENGTH = 4;
    public static final int COMMENT_FIELD_LENGTH = 30;
    public static final int GENRE_FIELD_LENGTH = 1;

    public static final int MAX_YEAR = 9999;
    public static final int MIN_YEAR = 0;

    protected static final String EMPTY_STRING = "";
    protected static final String ERROR_STRING = "ERROR";
    protected static final int ERROR_INT = -1;

    protected static final String EMPTY_FIELD_STRING = "";
    protected static final int EMPTY_FIELD_INT = 0;
    protected static final boolean EMPTY_FIELD_BOOLEAN = false;

    /**
     * Creates a new ID3v1 tag and starts the field reading process.
     *
     * @param mp3 The mp3 file containing the tag data.
     * @return The ID3v1 tag with all fields populated.
     */
    public static ID3v1 extractTag(MP3 mp3) {
        ID3v1 id3V1 = new ID3v1();
        id3V1.setRaw(ByteUtilities.getID3v1Bytes(mp3));
        return populateFields(id3V1);
    }

    /**
     * Reads all tag fields.
     *
     * @param tag The empty ID3v1 tag containing the raw tag bytes.
     * @return The ID3v1 tag with all attributes populated.
     */
    protected static ID3v1 populateFields(ID3v1 tag) {

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

        int genreIndex = readRawGenreIndex(tag.getRaw());

        String genre;
        try {
            genre = Genres.getGenreFromIndexID3v1Tag(genreIndex);
        } catch (GenreOutOfBoundsException goobe) {
            genre = EMPTY_FIELD_STRING;
        }

        tag.populateFields(title, artist, album, year, comment, genreIndex, genre, tag.getRaw());
        return tag;
    }

    /**
     * Reads the title field from the tag bytes in the mp3 file.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @return The title of the mp3 track.
     * @throws EmptyFieldException Thrown if the title field does not contain a value.
     */
    protected static String readRawTitle(byte[] raw) throws EmptyFieldException {
        String paddedTitle = EMPTY_STRING;
        String title = EMPTY_STRING;
        try {
            paddedTitle = BufferUtilities.convertBytesToString(raw, TITLE_FIELD_START, TITLE_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            title = StringUtilities.removePadding(paddedTitle);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (title.equalsIgnoreCase(EMPTY_STRING))  throw new EmptyFieldException("[ERROR] Title field does not contain a value");
        return title;
    }

    /**
     * Updates the title field in the raw tag bytes.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @param title The replacement value for the title field.
     * @throws IllegalArgumentException If the number of characters used for the title is greater than the maximum.
     */
    public static byte[] updateRawTitle(byte[] raw, String title) throws IllegalArgumentException {
        if (title.length() > ID3v1Factory.TITLE_FIELD_LENGTH) {
            throw new IllegalArgumentException("[ERROR] Title has length " + title.length()
                + " which is greater than the maximum length of " + ID3v1Factory.TITLE_FIELD_LENGTH);
        } else {
            return ByteUtilities.updateSection(raw, title, TITLE_FIELD_START, TITLE_FIELD_LENGTH);
        }
    }

    /**
     * Reads the artist field from the tag bytes in the mp3 file.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @return The artist of the mp3 track.
     * @throws EmptyFieldException Thrown if the artist field does not contain a value.
     */
    protected static String readRawArtist(byte[] raw) throws EmptyFieldException {
        String paddedArtist = EMPTY_STRING;
        String artist = EMPTY_STRING;
        try {
            paddedArtist = BufferUtilities.convertBytesToString(raw, ARTIST_FIELD_START, ARTIST_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            artist = StringUtilities.removePadding(paddedArtist);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (artist.equalsIgnoreCase(EMPTY_STRING))  throw new EmptyFieldException("[ERROR] Artist field does not contain a value");
        return artist;
    }

    /**
     * Updates the artist field in the raw tag bytes.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @param artist The replacement for the artist field.
     * @throws IllegalArgumentException If the number of characters used for the artist is greater than the maximum.
     */
    public static byte[] updateRawArtist(byte[] raw, String artist) {
        if (artist.length() > ARTIST_FIELD_LENGTH) {
            throw new IllegalArgumentException("[ERROR] Artist has length " + artist.length()
                + " which is greater than the maximum length of " + ARTIST_FIELD_LENGTH);
        } else {
            return ByteUtilities.updateSection(raw, artist, ARTIST_FIELD_START, ARTIST_FIELD_LENGTH);
        }
    }

    /**
     * Reads the album field from the tag bytes in the mp3 file.
     *
     * @param raw The ID3v1 rag as an array of bytes.
     * @return The album that the mp3 track is part of.
     * @throws EmptyFieldException Thrown if the album field does not contain a value.
     */
    protected static String readRawAlbum(byte[] raw) throws EmptyFieldException {
        String paddedAlbum = EMPTY_STRING;
        String album = EMPTY_STRING;
        try {
            paddedAlbum = BufferUtilities.convertBytesToString(raw, ALBUM_FIELD_START, ALBUM_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            album = StringUtilities.removePadding(paddedAlbum);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (album.equalsIgnoreCase(EMPTY_STRING)) throw new EmptyFieldException("[ERROR] Album field does not contain a value");
        return album;
    }

    /**
     * Updates the album field in the raw tag bytes.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @param album The replacement value for the album field.
     * @throws IllegalArgumentException If the number of characters used for the album is greater than the maximum.
     */
    public static byte[] updateRawAlbum(byte[] raw, String album) throws IllegalArgumentException {
        if (album.length() > ALBUM_FIELD_LENGTH) {
            throw new IllegalArgumentException("[ERROR] Album has length " + album.length()
            + " which is greater than the maximum permitted length of " + ALBUM_FIELD_LENGTH);
        } else {
            return ByteUtilities.updateSection(raw, album, ALBUM_FIELD_START, ALBUM_FIELD_LENGTH);
        }
    }

    /**
     * Reads the year field from the tag bytes in the mp3 file.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @return The year which the song was made.
     * @throws EmptyFieldException Thrown if the year field does not contain a value.
     */
    protected static int readRawYear(byte[] raw) throws EmptyFieldException {
        String paddedYear = EMPTY_STRING;
        String year = EMPTY_STRING;
        try {
            paddedYear = BufferUtilities.convertBytesToString(raw, YEAR_FIELD_START, YEAR_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            year = StringUtilities.removePadding(paddedYear);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_FIELD_INT;
        }
        if (year.equalsIgnoreCase(EMPTY_STRING)) throw new EmptyFieldException("[ERROR] Year field does not contain a value");
        return Integer.parseInt(year);
    }

    /**
     * Updates the year field in the raw tag bytes.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @param year The replacement value for the year field.
     * @throws IllegalArgumentException If the year value is less than or greater than the minimum and maximum values respectively.
     */
    public static byte[] updateRawYear(byte[] raw, int year) throws IllegalArgumentException {
        if (year > MAX_YEAR || year < MIN_YEAR) {
            throw new IllegalArgumentException("[ERROR] Year has value " + year
                + " which is not within the range of " + MIN_YEAR + " and " + MAX_YEAR);
        } else {
            return ByteUtilities.updateSection(raw, String.valueOf(year), YEAR_FIELD_START, YEAR_FIELD_LENGTH);
        }
    }

    /**
     * Reads the comment field from the tag bytes in the mp3 file.
     *
     * @param raw The ID3v1 tag as an array of bytes.
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
     * @param raw The ID3v1 tag as an array of bytes.
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
     * Reads the genre index field from the tag bytes in the mp3 file.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @return The index indicating the genre of the track.
     */
    protected static int readRawGenreIndex(byte[] raw) {
        int genreIndex = ERROR_INT; // Error Value
        try {
            int temp = BufferUtilities.convertByteToInt(raw[GENRE_FIELD_START]);
            genreIndex = (temp < 0) ? temp + 256 : temp;
        } catch (UnsupportedEncodingException uee) {
            return ERROR_INT;
        }
        return genreIndex;
    }

    /**
     * Updates the genre index field in the raw tag bytes.
     *
     * @param raw The ID3v1 tag as an array of bytes.
     * @param index The replacement index for the genre field.
     * @throws GenreOutOfBoundsException If the genre index is not within bounds and hence doesn't correspond to a valid genre.
     */
    public static byte[] updateRawGenreIndex(byte[] raw, int index) throws GenreOutOfBoundsException {
        if (index < Genres.ID3V1_GENRES_LOWER_BOUND || index > Genres.ID3V1_GENRES_UPPER_BOUND) {
            throw new GenreOutOfBoundsException("[ERROR] The genre index " + index
                + " not within the bounds of " + Genres.ID3V1_GENRES_LOWER_BOUND + " and " + Genres.ID3V1_GENRES_UPPER_BOUND);
        } else {
            return ByteUtilities.updateSection(raw, index, GENRE_FIELD_START);
        }
    }
}