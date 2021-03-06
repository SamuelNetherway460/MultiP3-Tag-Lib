package TagTypes;

import DataStore.Genres;
import Exceptions.GenreOutOfBoundsException;
import Exceptions.InvalidGenreException;
import Factories.ID3v1Factory;
import Utilities.StringUtilities;

import java.nio.charset.StandardCharsets;

/**
 * Class for encapsulating all attribute and required functions needed for an ID3v1 tag.
 *
 * @author Samuel Netherway
 */
public class ID3v1 {

    private static final String HEADER = "TAG";
    private static final String EMPTY_FIELD_STRING = "";
    private static final int EMPTY_FIELD_INT = -1;
    private static final boolean EMPTY_FIELD_BOOLEAN = false;

    private byte[] raw;
    private String title = EMPTY_FIELD_STRING;
    private String artist = EMPTY_FIELD_STRING;
    private String album = EMPTY_FIELD_STRING;
    private String year = EMPTY_FIELD_STRING;
    private String comment = EMPTY_FIELD_STRING;
    private boolean zeroByte = EMPTY_FIELD_BOOLEAN;
    private int trackNumber = EMPTY_FIELD_INT;
    private int genreIndex = EMPTY_FIELD_INT;
    private String genre = EMPTY_FIELD_STRING;

    /**
     * Constructs a new ID3v1 tag for the mp3 file.
     */
    public ID3v1() {
        initEmptyTag();
    }

    /**
     * Creates a new empty ID3v1 tag.
     */
    private void initEmptyTag() {
        raw = StringUtilities.addPadding(HEADER, 128).getBytes(StandardCharsets.ISO_8859_1);
    }

    /**
     * Populates all the ID3v1 tag fields.
     *
     * @param title The title of the track.
     * @param artist The artist of the track.
     * @param album The album that the track belongs to.
     * @param year The year the track was released.
     * @param comment The comment on the track.
     * @param zeroByte Zero byte indicating whether or not their is a track number.
     * @param trackNumber The number of the track in the album.
     * @param genreIndex An integer representing a particular genre.
     * @param genre The genre of the track.
     */
    public void populateFields(String title, String artist, String album, String year, String comment, boolean zeroByte,
                               int trackNumber, int genreIndex, String genre) {
        if(title != null) this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.comment = comment;
        this.zeroByte = zeroByte;
        this.trackNumber = trackNumber;
        this.genreIndex = genreIndex;
        this.genre = genre;
    }

    /**
     * @return The header indicating the start of the tag and its version.
     */
    public String getHeader() {
        return HEADER;
    }

    /**
     * @return The byte array from which the tag data will be read.
     */
    public byte[] getRaw() {
        return raw;
    }

    /**
     * Updates the value of the raw tag bytes.
     *
     * @param raw The tag portion of the mp3 file in the format of a byte array.
     */
    public void setRaw(byte[] raw) {
        this.raw = raw;
    }

    /**
     * @return The title of the track.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Updates the title field and syncs raw.
     *
     * @param title The new value for the title field.
     */
    public void setTitle(String title) {
        this.title = title;
        this.raw = ID3v1Factory.updateRawTitle(this);
    }

    /**
     * @return The artist of the track.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Updates the artist field and syncs raw.
     *
     * @param artist The new value for the artist field.
     */
    public void setArtist(String artist) {
        this.artist = artist;
        this.raw = ID3v1Factory.updateRawArtist(this);
    }

    /**
     * @return The album that the track is part of.
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Updates the album field and syncs raw.
     *
     * @param album The new value for the album field.
     */
    public void setAlbum(String album) {
        this.album = album;
        this.raw = ID3v1Factory.updateRawAlbum(this);
    }

    /**
     * @return The year that the track was released.
     */
    public String getYear() {
        return year;
    }

    /**
     * Updates the year field and syncs raw.
     *
     * @param year The new value for the year field.
     */
    public void setYear(String year) {
        this.year = year;
        this.raw = ID3v1Factory.updateRawYear(this);
    }

    /**
     * @return The comment on the track.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Updates the comment on the track and syncs raw.
     *
     * @param comment The new value for the comment field.
     */
    public void setComment(String comment) {
        this.comment = comment;
        this.raw = ID3v1Factory.updateRawComment(this);
    }

    /**
     * @return A boolean indicating whether the track number field contains a value.
     */
    public boolean hasZeroByte() {
        return zeroByte;
    }

    /**
     * Updates the field indicating whether the track number field contains a value and syncs raw.
     *
     * @param zeroByte The new value indicating whether the track number field contains a value.
     */
    public void setZeroByte(boolean zeroByte) {
        this.zeroByte = zeroByte;
        this.raw = ID3v1Factory.updateRawZeroByte(this);
    }

    /**
     * @return The number of the track in the album / set.
     */
    public int getTrackNumber() {
        return trackNumber;
    }

    /**
     * Updates the track number field and syncs raw.
     *
     * @param trackNumber The new value for the track number field.
     */
    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
        this.raw = ID3v1Factory.updateRawTrackNumber(this);
    }

    /**
     * @return An integer index representing one of the 80 genres.
     */
    public int getGenreIndex() {
        return genreIndex;
    }

    /**
     * Updates the index representing one of the 80 genres and syncs raw.
     *
     * @param genreIndex The new value for the index representing a genre.
     */
    public void setGenreIndex(int genreIndex) {
        this.genreIndex = genreIndex;
        this.raw = ID3v1Factory.updateRawGenreIndex(this);
        try {
            this.genre = Genres.getGenreFromIndexID3v1Tag(genreIndex);
        } catch (GenreOutOfBoundsException goobe) {
            genre = "";
            this.genreIndex = EMPTY_FIELD_INT;
        }
    }

    /**
     * @return The genre of the track.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Updates the genre of the track.
     *
     * @param genre The new value for the genre of the track.
     */
    public void setGenre(String genre) {
        try {
            genreIndex = Genres.convertStringGenreToIndexID3v1(genre);
            this.genre = genre;
        } catch (InvalidGenreException ige) {
            this.genre = "";
            genreIndex = EMPTY_FIELD_INT;
        }
    }

    /**
     * Generates a formatted string containing all ID3v1 tag data.
     *
     * @return A formatted string containing all ID3v1 tag data.
     */
    public String toString() {
        String toString = "Tag Type: ID3v1\n"
            + "Title: " + title + "\n"
            + "Artist: " + artist + "\n"
            + "Album: " + album + "\n"
            + "Year: " + year + "\n"
            + "Comment: " + comment + "\n"
            + "Zero Byte: " + zeroByte + "\n"
            + "Track Number: " + trackNumber + "\n"
            + "Genre Index: " + genreIndex + "\n"
            + "Genre: " + genre;
        return toString;
    }
}