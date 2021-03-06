package FileTypes;

import Factories.*;
import TagTypes.*;
import Utilities.ByteUtilities;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Class for encapsulating all attribute and required functions needed for an MP3 file.
 *
 * @author Samuel Netherway
 */
public class MP3 {

    private final boolean TAG_PRESENT = true;
    private final boolean TAG_ABSENT = false;

    private Path path;
    private long size;
    private ID3v1 id3v1 = null;
    private ID3v1Enhanced id3v1Enhanced = null;
    private ID3v22 id3v22 = null;
    private ID3v23 id3v23 = null;
    private ID3v24 id3v24 = null;

    /**
     * Constructs an new mp3 file.
     *
     * @param stringPath The path to the mp3 file.
     * @param populateTags Boolean indicating whether tags are to be populated on initialisation of the mp3 file
     */
    public MP3 (String stringPath, boolean populateTags) {
        this.path = Paths.get(stringPath);
        initMP3();
        if (populateTags) initTags();
    }

    /**
     * Initializes the mp3 file.
     */
    public void initMP3() {
        try {
            this.size = Files.size(this.path);
        } catch (IOException io) {
            this.size = 0;
        }
    }

    /**
     * Creates all tags for the mp3 file.
     */
    public void initTags() {
        //TODO Implement try catch for NonExistentTagException
        if (hasID3v1()) id3v1 = ID3v1Factory.extractTag(this);
        //TODO Implement try catch for NonExistentTagException
        //if (hasID3v1Enhanced()) ID3v1Enhanced = ID3v1EnhancedFactory.extractTag(this);
        //TODO Implement try catch for NonExistentTagException
        //if (hasID3v22()) ID3v22 = ID3v22Factory.extractTag(this);
        //TODO Implement try catch for NonExistentTagException
        //if (hasID3v23()) ID3v23 = ID3v23Factory.extractTag(this);
        //TODO Implement try catch for NonExistentTagException
        //if (hasID3v24()) ID3v24 = ID3v24Factory.extractTag(this);
    }

    /**
     * @return The path to the mp3 file.
     */
    public Path getPath() {
        return path;
    }

    /**
     * @return The size of the mp3 file.
     */
    public long getSize() {
        return size;
    }

    /**
     * Determines whether the mp3 file contains a ID3v1 tag.
     *
     * @return A boolean indicating the presence of an ID3v1 tag.
     */
    public boolean hasID3v1() {
        // Scan for tag header in last 128 bytes
        byte[] id3v1Bytes = ByteUtilities.getID3v1Bytes(this);
        if (id3v1Bytes[0] == "T".getBytes(StandardCharsets.ISO_8859_1)[0]
            && id3v1Bytes[1] == "A".getBytes(StandardCharsets.ISO_8859_1)[0]
            && id3v1Bytes[2] == "G".getBytes(StandardCharsets.ISO_8859_1)[0]
            && id3v1Bytes[3] != "+".getBytes(StandardCharsets.ISO_8859_1)[0]) {
            return TAG_PRESENT;
        }
        return TAG_ABSENT;
    }

    /**
     * Gets the ID3v1 tag.
     *
     * @return The ID3v1 tag.
     */
    public ID3v1 getId3v1() {
        if (id3v1 != null) return id3v1;
        if (hasID3v1()) id3v1 = ID3v1Factory.extractTag(this);
        return id3v1;
    }

    /**
     * Replaces the MP3 ID3v1 tag.
     *
     * @param id3v1 The new ID3v1 tag.
     */
    public void setID3v1(ID3v1 id3v1) {
        this.id3v1 = id3v1;
    }

    /**
     * Determines whether the mp3 file contains a ID3v1 Enhanced tag.
     *
     * @return A boolean indicating the presence of an ID3v1 Enhanced tag.
     */
    public boolean hasID3v1Enhanced() {
        // Scan for tag header in last 227 bytes
        byte[] id3v1Bytes = ByteUtilities.getID3v1EnhancedBytes(this);
        if (id3v1Bytes[0] == "T".getBytes(StandardCharsets.ISO_8859_1)[0]
            && id3v1Bytes[1] == "A".getBytes(StandardCharsets.ISO_8859_1)[0]
            && id3v1Bytes[2] == "G".getBytes(StandardCharsets.ISO_8859_1)[0]
            && id3v1Bytes[3] == "+".getBytes(StandardCharsets.ISO_8859_1)[0]) {
            return TAG_PRESENT;
        }
        return TAG_ABSENT;
    }

    /**
     * @return The ID3v1 Enhanced tag.
     */
    public ID3v1Enhanced getId3v1Enhanced() {
        return id3v1Enhanced;
    }

    /**
     * Replaces the MP3 ID3v1Enhanced tag.
     *
     * @param id3v1Enhanced The new ID3v1Enhanced tag.
     */
    public void setId3v1Enhanced(ID3v1Enhanced id3v1Enhanced) {
        this.id3v1Enhanced = id3v1Enhanced;
    }

    //TODO - Implement check for track presence.
    /**
     * Determines whether the mp3 file contains a ID3v22 tag.
     *
     * @return A boolean indicating the presence of an ID3v22 tag.
     */
    public boolean hasID3v22() {
        return TAG_ABSENT;
    }

    /**
     * @return The ID3v22 tag.
     */
    public ID3v22 getId3v22() {
        return id3v22;
    }

    /**
     * Replaces the MP3 ID3v22 tag.
     *
     * @param id3v22 The new ID3v22 tag.
     */
    public void setId3v22(ID3v22 id3v22) {
        this.id3v22 = id3v22;
    }

    //TODO - Implement check for track presence.
    /**
     * Determines whether the mp3 file contains a ID3v23 tag.
     *
     * @return A boolean indicating the presence of an ID3v23 tag.
     */
    public boolean hasID3v23() {
        return TAG_ABSENT;
    }

    /**
     * @return The ID3v23 tag.
     */
    public ID3v23 getId3v23() {
        return id3v23;
    }

    /**
     * Replaces the MP3 ID3v23 tag.
     *
     * @param id3v23 The new ID3v23 tag.
     */
    public void setId3v23(ID3v23 id3v23) {
        this.id3v23 = id3v23;
    }

    //TODO - Implement check for track presence.
    /**
     * Determines whether the mp3 file contains a ID3v24 tag.
     *
     * @return A boolean indicating the presence of an ID3v24 tag.
     */
    public boolean hasID3v24() {
        return TAG_ABSENT;
    }

    /**
     * @return The ID3v24 tag.
     */
    public ID3v24 getId3v24() {
        return id3v24;
    }

    /**
     * Replaces the MP3 ID3v24 tag.
     *
     * @param id3v24 The new ID3v24 tag.
     */
    public void setId3v24(ID3v24 id3v24) {
        this.id3v24 = id3v24;
    }

    /**
     * Saves the changes made to the ID3v1 tag and writes the data to the MP3 file.
     */
    public void saveID3v1() {
        ByteUtilities.writeID3v1Bytes(this);
    }
}