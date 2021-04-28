package FileTypes;

import Exceptions.HeaderNotFoundException;
import Factories.*;
import TagStructures.ID3v2Header;
import TagTypes.ID3v22;
import TagTypes.ID3v23;
import TagTypes.ID3v24;
import Utilities.ByteUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static Utilities.ByteUtilities.getFileBytes;

/**
 * Class for encapsulating all attributes and required functions needed for a WAV file.
 *
 * @author Samuel Netherway
 */
public class WAV {

    private final boolean TAG_PRESENT = true;
    private final boolean TAG_ABSENT = false;
    private final Charset DEFAULT_CHARSET = StandardCharsets.ISO_8859_1;

    private Path path;
    private long size;
    private byte[] bytes;
    private ID3v22 id3v22 = null;
    private ID3v23 id3v23 = null;
    private ID3v24 id3v24 = null;

    /**
     * Constructs an new wav file.
     *
     * @param stringPath The path to the wav file.
     * @param populateTags Boolean indicating whether tags are to be populated on initialisation of the wav file
     */
    public WAV (String stringPath, boolean populateTags) throws FileNotFoundException {
        this.path = Paths.get(stringPath);
        File file = new File(stringPath);
        if(!file.exists()) throw new FileNotFoundException();
        initWAV();
        if (populateTags) initTags();
    }

    /**
     * Initializes the mp3 file.
     */
    public void initWAV() {
        try {
            this.size = Files.size(this.path);
        } catch (IOException io) {
            this.size = 0;
        }
        this.bytes = getFileBytes(this);//TODO Change method to accept file instead of mp3
    }

    /**
     * Creates all tags for the wav file.
     */
    public void initTags() {
        //TODO Implement try catch for NonExistentTagException
        //if (hasID3v22()) id3v22 = ID3v22Factory.extractTag(this);
        if (hasID3v23()) id3v23 = ID3v23Factory.extractTag(this);
        if (hasID3v24()) id3v24 = ID3v24Factory.extractTag(this);
    }

    /**
     * @return The path to the wav file.
     */
    public Path getPath() {
        return path;
    }

    /**
     * @return The size of the wav file.
     */
    public long getSize() {
        return size;
    }

    /**
     * @return wav file as an array of bytes.
     */
    public byte[] getBytes() {
        return bytes;
    }

    /**
     * Determines whether the wav file contains a ID3v22 tag.
     *
     * @return A boolean indicating the presence of an ID3v22 tag.
     */
    public boolean hasID3v22() {
        try {
            if (ID3v2HeaderFactory.extractHeader(this).getMajorVersion() == 2) return TAG_PRESENT;
            return TAG_ABSENT;
        } catch (HeaderNotFoundException hnfe) {
            return TAG_ABSENT;
        }
    }

    /**
     * @return The ID3v22 tag.
     */
    public ID3v22 getId3v22() {
        return id3v22;
    }

    /**
     * Replaces the WAV ID3v22 tag.
     *
     * @param id3v22 The new ID3v22 tag.
     */
    public void setId3v22(ID3v22 id3v22) {
        this.id3v22 = id3v22;
    }

    /**
     * Determines whether the wav file contains a ID3v23 tag.
     *
     * @return A boolean indicating the presence of an ID3v23 tag.
     */
    public boolean hasID3v23() {
        try {
            if (ID3v2HeaderFactory.extractHeader(this).getMajorVersion() == 3) return TAG_PRESENT;
            return TAG_ABSENT;
        } catch (HeaderNotFoundException hnfe) {
            return TAG_ABSENT;
        }
    }

    /**
     * @return The ID3v23 tag.
     */
    public ID3v23 getId3v23() {
        return id3v23;
    }

    /**
     * Replaces the WAV ID3v23 tag.
     *
     * @param id3v23 The new ID3v23 tag.
     */
    public void setId3v23(ID3v23 id3v23) {
        this.id3v23 = id3v23;
    }

    /**
     * Determines whether the wav file contains a ID3v24 tag.
     *
     * @return A boolean indicating the presence of an ID3v24 tag.
     */
    public boolean hasID3v24() {
        try {
            if (ID3v2HeaderFactory.extractHeader(this).getMajorVersion() == 4) return TAG_PRESENT;
            return TAG_ABSENT;
        } catch (HeaderNotFoundException hnfe) {
            return TAG_ABSENT;
        }
    }

    /**
     * @return The ID3v24 tag.
     */
    public ID3v24 getId3v24() {
        return id3v24;
    }

    /**
     * Replaces the WAV ID3v24 tag.
     *
     * @param id3v24 The new ID3v24 tag.
     */
    public void setId3v24(ID3v24 id3v24) {
        this.id3v24 = id3v24;
    }

    public void saveID3v23() {
        if (id3v23 != null) ByteUtilities.updateID3v23Bytes(this);
    }

    public void saveID3v24() {
        if (id3v24 != null) ByteUtilities.updateID3v24Bytes(this);
    }
}
