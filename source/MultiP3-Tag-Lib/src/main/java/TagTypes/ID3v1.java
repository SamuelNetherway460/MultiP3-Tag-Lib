package TagTypes;

import DataStore.Genres;
import Exceptions.GenreOutOfBoundsException;
import Exceptions.InvalidGenreException;
import Factories.ID3v1Factory;
import Utilities.StringUtilities;

import java.nio.charset.StandardCharsets;

/**
 * Class for encapsulating all attributes and required functions needed for an ID3v1 tag.
 *
 * @author Samuel Netherway
 */
public class ID3v1 {

    protected static final String HEADER = "TAG";
    protected static final String EMPTY_FIELD_STRING = "";
    protected static final int EMPTY_FIELD_INT = -1;
    protected static final boolean EMPTY_FIELD_BOOLEAN = false;

    protected byte[] raw;
    protected String title = EMPTY_FIELD_STRING;
    protected String artist = EMPTY_FIELD_STRING;
    protected String album = EMPTY_FIELD_STRING;
    protected int year = EMPTY_FIELD_INT;
    protected String comment = EMPTY_FIELD_STRING;
    protected int genreIndex = EMPTY_FIELD_INT;
    protected String genre = EMPTY_FIELD_STRING;

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
        raw = StringUtilities.addPadding(HEADER, ID3v1Factory.ID3V1_TAG_LENGTH).getBytes(StandardCharsets.ISO_8859_1);
    }

    //TODO: Possibly remove and replace with boolean sync raw value in set methods
    /**
     * Populates all the ID3v1 tag fields.
     *
     * @param title The title of the track.
     * @param artist The artist of the track.
     * @param album The album that the track belongs to.
     * @param year The year the track was released.
     * @param comment The comment on the track.
     * @param genreIndex An integer representing a particular genre.
     * @param genre The genre of the track.
     */
    public void populateFields(String title, String artist, String album, int year, String comment, int genreIndex, String genre, byte[] raw) {
        if(title != null) this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.comment = comment;
        this.genreIndex = genreIndex;
        this.genre = genre;
        this.raw = raw;
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
     * @throws IllegalArgumentException If the length of the tag bytes is incorrect.
     */
    public void setRaw(byte[] raw) throws IllegalArgumentException {
        if (raw.length == ID3v1Factory.ID3V1_TAG_LENGTH) {
            this.raw = raw;
        } else {
            throw new IllegalArgumentException("[ILLEGAL ARGUMENT EXCEPTION] Raw length of " + raw.length
                + " does not equal correct length of " + ID3v1Factory.ID3V1_TAG_LENGTH);
        }
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
     * @param title The replacement value for the title field.
     * @throws IllegalArgumentException If the number of characters used for the title is greater than the maximum.
     */
    public void setTitle(String title) throws IllegalArgumentException {
        this.raw = ID3v1Factory.updateRawTitle(this.getRaw(), title);
        this.title = title;
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
     * @throws IllegalArgumentException If the number of characters used for the artist is greater than the maximum.
     */
    public void setArtist(String artist) throws IllegalArgumentException {
        this.raw = ID3v1Factory.updateRawArtist(this.getRaw(), artist);
        this.artist = artist;
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
     * @param album The replacement value for the album field.
     * @throws IllegalArgumentException If the number of characters used for the album is greater than the maximum.
     */
    public void setAlbum(String album) throws IllegalArgumentException {
        this.raw = ID3v1Factory.updateRawAlbum(this.getRaw(), album);
        this.album = album;
    }

    /**
     * @return The year that the track was released.
     */
    public int getYear() {
        return year;
    }

    /**
     * Updates the year field and syncs raw.
     *
     * @param year The replacement value for the year field.
     * @throws IllegalArgumentException If the year value is less than or greater than the minimum and maximum values respectively.
     */
    public void setYear(int year) throws IllegalArgumentException {
        this.raw = ID3v1Factory.updateRawYear(this.getRaw(), year);
        this.year = year;
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
     * @throws IllegalArgumentException If the number of characters used for the comment is greater than the maximum.
     */
    public void setComment(String comment) throws IllegalArgumentException {
        this.raw = ID3v1Factory.updateRawComment(this.getRaw(), comment);
        this.comment = comment;
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
     * @param index The replacement index for the genre field.
     * @throws GenreOutOfBoundsException If the genre index is not within bounds and hence doesn't correspond to a valid genre.
     */
    public void setGenreIndex(int index) throws GenreOutOfBoundsException {
        this.raw = ID3v1Factory.updateRawGenreIndex(this.getRaw(), index);
        this.genre = Genres.getGenreFromIndexID3v1Tag(index);
        this.genreIndex = index;
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
     * @param genre The replacement value for the genre of the track.
     * @throws InvalidGenreException If the string genre does not correspond to a valid genre index.
     * @throws GenreOutOfBoundsException If the genre index is not within bounds and hence doesn't correspond to a valid genre.
     */
    public void setGenre(String genre) throws InvalidGenreException, GenreOutOfBoundsException {
        genreIndex = Genres.convertStringGenreToIndexID3v1(genre);
        this.raw = ID3v1Factory.updateRawGenreIndex(this.getRaw(), genreIndex);
        this.genre = genre;
    }

    /**
     * Generates a formatted string containing all FileTypes.MP3.ID3.ID3v1 tag data.
     *
     * @return A formatted string containing all FileTypes.MP3.ID3.ID3v1 tag data.
     */
    public String toString() {
        String toString = "Tag Type: ID3v1\n"
            + "Title: " + title + "\n"
            + "Artist: " + artist + "\n"
            + "Album: " + album + "\n"
            + "Year: " + year + "\n"
            + "Comment: " + comment + "\n"
            + "Genre Index: " + genreIndex + "\n"
            + "Genre: " + genre;
        return toString;
    }
}
