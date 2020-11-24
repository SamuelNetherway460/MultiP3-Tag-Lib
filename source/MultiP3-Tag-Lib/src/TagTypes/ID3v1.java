package TagTypes;

import FileTypes.MP3;
import Utilities.ByteUtilities;

//TODO - JavaDoc
/**
 *
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

    //TODO Check if the mp3 file has a ID3v1 tag first
    /**
     * Constructs a new ID3v1 tag for the mp3 file.
     *
     * @param mp3 The mp3 file which the ID3v1 tag will be created for.
     */
    public ID3v1(MP3 mp3) {
        initTag(mp3);
    }

    /**
     * Initializes the new ID3v1 tag and reads the portion of the mp3 track which contains the ID3v1 tags.
     *
     * @param mp3 The mp3 file which the ID3v1 tag will be initialized from.
     */
    private void initTag(MP3 mp3) {
        raw = ByteUtilities.getID3v1Bytes(mp3);
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
     * Updates the title field.
     *
     * @param title The new value for the title field.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The artist of the track.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Updates the artist field.
     *
     * @param artist The new value for the artist field.
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return The album that the track is part of.
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Updates the album field.
     *
     * @param album The new value for the album field.
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * @return The year that the track was released.
     */
    public String getYear() {
        return year;
    }

    /**
     * Updates the year field.
     *
     * @param year The new value for the year field.
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return The comment on the track.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Updates the comment on the track.
     *
     * @param comment The new value for the comment field.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return A boolean indicating whether the track number field contains a value.
     */
    public boolean hasZeroByte() {
        return zeroByte;
    }

    /**
     * Updates the field indicating whether the track number field contains a value.
     *
     * @param zeroByte The new value indicating whether the track number field contains a value.
     */
    public void setZeroByte(boolean zeroByte) {
        this.zeroByte = zeroByte;
    }

    /**
     * @return The number of the track in the album / set.
     */
    public int getTrackNumber() {
        return trackNumber;
    }

    /**
     * Updates the track number field.
     *
     * @param trackNumber The new value for the track number field.
     */
    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     * @return An integer index representing one of the 80 genres.
     */
    public int getGenreIndex() {
        return genreIndex;
    }

    //TODO Add validation to ensure that the genre index passed is between >= 0 and <= 79
    /**
     * Updates the index representing one of the 80 genres.
     *
     * @param genreIndex The new value for the index representing a genre.
     */
    public void setGenreIndex(int genreIndex) {
        this.genreIndex = genreIndex;
    }

    /**
     * @return The genre of the track.
     */
    public String getGenre() {
        return genre;
    }

    //TODO Add validation to ensure that the genre passed is one of the 80
    /**
     * Updates the genre of the track.
     *
     * @param genre The new value for the genre of the track.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //TODO - JavaDoc
    public String toString() {
        String toString =
            "Tag Type: ID3v1\n" +
            "Title: " + title + "\n" +
            "Artist: " + artist + "\n" +
            "Album: " + album + "\n" +
            "Year: " + year + "\n" +
            "Comment: " + comment + "\n" +
            "Zero Byte: " + zeroByte + "\n" +
            "Track Number: " + trackNumber + "\n" +
            "Genre Index: " + genreIndex + "\n" +
            "Genre: " + genre;
        return toString;
    }
}