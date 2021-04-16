package Factories;

import DataStore.Genres;
import Exceptions.EmptyFieldException;
import Exceptions.GenreOutOfBoundsException;
import FileTypes.MP3;
import TagTypes.ID3v1Enhanced;
import Utilities.BufferUtilities;
import Utilities.StringUtilities;

import java.io.UnsupportedEncodingException;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v1EnhancedFactory {

    private static final String DEFAULT_CHARSET_NAME = "ISO-8859-1";

    private static final int TAG_LENGTH = 227;

    private static final int HEADER_START = 0;
    private static final int TITLE_FIELD_START = 4;
    private static final int ARTIST_FIELD_START = 64;
    private static final int ALBUM_FIELD_START = 124;
    private static final int SPEED_INDEX_FIELD_START = 184;
    private static final int GENRE_FIELD_START = 185;
    private static final int START_TIME_FIELD_START = 215;
    private static final int END_TIME_FIELD_START = 221;

    private static final int HEADER_FIELD_LENGTH = 4;
    private static final int TITLE_FIELD_LENGTH = 60;
    private static final int ARTIST_FIELD_LENGTH = 60;
    private static final int ALBUM_FIELD_LENGTH = 60;
    private static final int SPEED_INDEX_FIELD_LENGTH = 1;
    private static final int GENRE_FIELD_LENGTH = 30;
    private static final int START_TIME_FIELD_LENGTH = 6;
    private static final int END_TIME_FIELD_LENGTH = 6;

    private static final String EMPTY_STRING = "";
    private static final int ERROR_INT = -1;

    public static ID3v1Enhanced createTag(MP3 mp3) {
        return readFields(new ID3v1Enhanced(mp3));
    }

    public static ID3v1Enhanced readFields(ID3v1Enhanced tag) {

        //TODO Possibly implement catch for when an invalid data is stored in the tag, handles and puts an error in the tag
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

        tag.setGenreIndex(readGenreIndex(tag));

        try {
            tag.setGenre(Genres.getGenreFromIndexID3v1Tag(tag.getGenreIndex()));
        } catch (GenreOutOfBoundsException goobe) {
            tag.setGenre(EMPTY_STRING);
        }

        try {
            tag.setStartTime(readStartTime(tag));
        } catch (EmptyFieldException efe) {
            tag.setStartTime(EMPTY_STRING);
        }

        try {
            tag.setEndTime(readEndTime(tag));
        } catch (EmptyFieldException efe) {
            tag.setEndTime(EMPTY_STRING);
        }

        return tag;
    }

    /**
     * Reads the title field from the tag bytes in the mp3 file.
     *
     * @param tag The FileTypes.MP3.ID3.ID3v1 Enhanced tag containing the raw tag bytes.
     * @return The title of the mp3 track.
     * @throws EmptyFieldException Thrown if the title field does not contain a value.
     */
    public static String readTitle(ID3v1Enhanced tag) throws EmptyFieldException {
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
     * @param tag The FileTypes.MP3.ID3.ID3v1 tag containing the raw tag bytes.
     * @return The artist of the mp3 track.
     * @throws EmptyFieldException Thrown if the artist field does not contain a value.
     */
    public static String readArtist(ID3v1Enhanced tag) throws EmptyFieldException {
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
     * @param tag The FileTypes.MP3.ID3.ID3v1 Enhanced tag containing the raw tag bytes.
     * @return The album that the mp3 track is part of.
     * @throws EmptyFieldException Thrown if the album field does not contain a value.
     */
    public static String readAlbum(ID3v1Enhanced tag) throws EmptyFieldException {
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
     * Reads the speed index field from the tag bytes in the mp3 file.
     *
     * @param tag The FileTypes.MP3.ID3.ID3v1 Enhanced tag containing the raw tag bytes.
     * @return An index corresponding to the speed of the track.
     * @throws EmptyFieldException Thrown if the speed index field does not contain a value.
     */
    public static int readSpeedIndex(ID3v1Enhanced tag) {
        String speedString = String.valueOf(ERROR_INT);
        int speedIndex = ERROR_INT;
        try {
            speedString = BufferUtilities.convertBytesToString(tag.getRaw(), SPEED_INDEX_FIELD_START, SPEED_INDEX_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            speedIndex = speedString.hashCode();
        } catch (UnsupportedEncodingException uee) {
            return ERROR_INT;
        }
        return speedIndex;
    }

    /**
     * Reads the genre index field from the tag bytes in the mp3 file.
     * FileTypes.MP3.ID3.ID3v1 Enhanced can contain 191 possible genres.
     *
     * @param tag The FileTypes.MP3.ID3.ID3v1 tag containing the raw tag bytes.
     * @return The index indicating the genre of the track.
     */
    public static int readGenreIndex(ID3v1Enhanced tag) {
        String genreIndexString = EMPTY_STRING;
        int genreIndex = ERROR_INT;
        try {
            genreIndexString = BufferUtilities.convertBytesToString(tag.getRaw(), GENRE_FIELD_START, GENRE_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
            genreIndex = genreIndexString.hashCode();
        } catch (UnsupportedEncodingException uee) {
            return ERROR_INT;
        }
        return genreIndex;
    }

    //TODO Find out if its overall start time out of the whole album time or just 000000:00
    /**
     * Reads the start time field from the tag bytes in the mp3 file.
     *
     * @param tag The FileTypes.MP3.ID3.ID3v1 Enhanced tag containing the raw tag bytes.
     * @return The start time of the track.
     * @throws EmptyFieldException Thrown if the start time field does not contain a value.
     */
    public static String readStartTime(ID3v1Enhanced tag) throws EmptyFieldException {
        String startTime = EMPTY_STRING;
        try {
            startTime = BufferUtilities.convertBytesToString(tag.getRaw(), START_TIME_FIELD_START, START_TIME_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (startTime.equalsIgnoreCase(EMPTY_STRING)) throw new EmptyFieldException("[EMPTY FIELD EXCEPTION] Start time field does not contain a value");
        return startTime;
    }

    /**
     * Reads the end time field from the tag bytes in the mp3 file.
     *
     * @param tag The FileTypes.MP3.ID3.ID3v1 Enhanced tag containing the raw tag bytes.
     * @return The end time of the track.
     * @throws EmptyFieldException Thrown if the end time field does not contain a value.
     */
    public static String readEndTime(ID3v1Enhanced tag) throws EmptyFieldException {
        String endTime = EMPTY_STRING;
        try {
            endTime = BufferUtilities.convertBytesToString(tag.getRaw(), END_TIME_FIELD_START, END_TIME_FIELD_LENGTH, DEFAULT_CHARSET_NAME);
        } catch (UnsupportedEncodingException uee) {
            return EMPTY_STRING;
        }
        if (endTime.equalsIgnoreCase(EMPTY_STRING)) throw new EmptyFieldException("[EMPTY FIELD EXCEPTION] Start time field does not contain a value");
        return endTime;
    }
}