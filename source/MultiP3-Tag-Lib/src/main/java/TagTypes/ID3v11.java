package TagTypes;

import Exceptions.TrackNumberOutOfBoundsException;
import Factories.ID3v11Factory;

/**
 * Class for encapsulating all attributes and required functions needed for an ID3v1.1 tag.
 *
 * @author Samuel Netherway
 */
public class ID3v11 extends ID3v1 {

    private boolean hasZeroByte = EMPTY_FIELD_BOOLEAN;
    private int trackNumber = EMPTY_FIELD_INT;

    /**
     * Constructs a new ID3v1 tag for the mp3 file.
     */
    public ID3v11() {
        super();
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
     * @param hasZeroByte Zero byte indicating whether or not their is a track number.
     * @param trackNumber The number of the track in the album.
     * @param genreIndex An integer representing a particular genre.
     * @param genre The genre of the track.
     */
    public void populateFields(String title, String artist, String album, int year, String comment, boolean hasZeroByte,
                               int trackNumber, int genreIndex, String genre, byte[] raw) {
        if(title != null) this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.comment = comment;
        this.hasZeroByte = hasZeroByte;
        this.trackNumber = trackNumber;
        this.genreIndex = genreIndex;
        this.genre = genre;
        this.raw = raw;
    }

    @Override
    /**
     * @return The comment on the track.
     */
    public String getComment() {
        return comment;
    }

    @Override
    /**
     * Updates the comment on the track and syncs raw.
     *
     * @param comment The new value for the comment field.
     * @throws IllegalArgumentException If the comment length is greater than the max comment length.
     */
    public void setComment(String comment) throws IllegalArgumentException {
        if (comment.length() <= ID3v11Factory.COMMENT_FIELD_LENGTH) {
            this.comment = comment;
            this.raw = ID3v11Factory.updateRawComment(this.getRaw(), comment);
        } else {
            throw new IllegalArgumentException("[ILLEGAL ARGUMENT EXCEPTION] Comment cannot have length greater than "
                + ID3v11Factory.COMMENT_FIELD_LENGTH);
        }
    }

    /**
     * @return A boolean indicating whether the track number field contains a value.
     */
    public boolean hasZeroByte() {
        return hasZeroByte;
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
     * @param trackNumber The replacement value for the track number field.
     * @throws IllegalArgumentException If the track number is out of the permitted bounds.
     */
    public void setTrackNumber(int trackNumber) throws TrackNumberOutOfBoundsException {
        this.raw = ID3v11Factory.updateRawTrackNumber(this.getRaw(), trackNumber);
        this.trackNumber = trackNumber;
    }

    @Override
    /**
     * Generates a formatted string containing all FileTypes.MP3.ID3.ID3v1 tag data.
     *
     * @return A formatted string containing all FileTypes.MP3.ID3.ID3v1 tag data.
     */
    public String toString() {
        String toString = "Tag Type: ID3v1.1\n"
            + "Title: " + title + "\n"
            + "Artist: " + artist + "\n"
            + "Album: " + album + "\n"
            + "Year: " + year + "\n"
            + "Comment: " + comment + "\n"
            + "Track Number: " + trackNumber + "\n"
            + "Genre Index: " + genreIndex + "\n"
            + "Genre: " + genre;
        return toString;
    }
}