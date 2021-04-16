package TagTypes;

import FileTypes.MP3;
import Utilities.ByteUtilities;

//TODO - JavaDoc
public class ID3v1Enhanced {

    private static final String HEADER = "TAG+";

    private byte[] raw;

    private String title;
    private String artist;
    private String album;
    private int speedIndex;
    private String speed;
    private int genreIndex;
    private String genre;
    private String startTime;
    private String endTime;

    //TODO Check if the mp3 file has a ID3v1Enhanced tag first
    /**
     * Constructs a new ID3v1Enhanced tag for the mp3 file.
     *
     * @param mp3 The mp3 file which the FileTypes.MP3.ID3.ID3v1 tag will be created for.
     */
    public ID3v1Enhanced(MP3 mp3) {
        initTag(mp3);
    }

    //TODO - JavaDoc
    public void initTag(MP3 mp3) {
        raw = ByteUtilities.getID3v1EnhancedBytes(mp3);
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

    //TODO - JavaDoc
    public String getTitle() {
        return title;
    }

    //TODO - JavaDoc
    public void setTitle(String title) {
        this.title = title;
    }

    //TODO - JavaDoc
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    //TODO - JavaDoc
    public String getAlbum() {
        return album;
    }

    //TODO - JavaDoc
    public void setAlbum(String album) {
        this.album = album;
    }

    //TODO - JavaDoc
    public int getSpeedIndex() {
        return speedIndex;
    }

    //TODO - JavaDoc
    public void setSpeedIndex(int speedIndex) {
        this.speedIndex = speedIndex;
    }

    //TODO - JavaDoc
    public String getSpeed() {
        return speed;
    }

    //TODO - JavaDoc
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    //TODO - JavaDoc
    public int getGenreIndex() {
        return genreIndex;
    }

    //TODO - JavaDoc
    public void setGenreIndex(int genreIndex) {
        this.genreIndex = genreIndex;
    }

    //TODO - JavaDoc
    public String getGenre() {
        return genre;
    }

    //TODO - JavaDoc
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //TODO - JavaDoc
    public String getStartTime() {
        return startTime;
    }

    //TODO - JavaDoc
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    //TODO - JavaDoc
    public String getEndTime() {
        return endTime;
    }

    //TODO - JavaDoc
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}