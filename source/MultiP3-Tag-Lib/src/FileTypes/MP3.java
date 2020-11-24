package FileTypes;

import Factories.*;
import TagTypes.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class MP3 {

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

    //TODO Implement method of detecting if an mp3 file has certain tags or not
    /**
     * Creates all tags for the mp3 file.
     */
    public void initTags() {
        //TODO Implement try catch for NonExistentTagException
        id3v1 = ID3v1Factory.createTag(this);
        //TODO Implement try catch for NonExistentTagException
        //ID3v1Enhanced = ID3v1EnhancedFactory.createTag(this);
        //TODO Implement try catch for NonExistentTagException
        //ID3v22 = ID3v22Factory.createTag(this);
        //TODO Implement try catch for NonExistentTagException
        //ID3v23 = ID3v23Factory.createTag(this);
        //TODO Implement try catch for NonExistentTagException
        //ID3v24 = ID3v24Factory.createTag(this);
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
     * Gets the ID3v1 tag.
     * Creates a new ID3v1 tag with embedded metadata if tag is null.
     *
     * @return The ID3v1 tag.
     */
    public ID3v1 getId3v1() {
        if (id3v1 == null) id3v1 = ID3v1Factory.createTag(this);
        return id3v1;
    }

    //TODO - JavaDoc
    public void updateID3v1(ID3v1 id3v1) {
        this.id3v1 = id3v1;
    }

    /**
     * @return The ID3v1 Enhanced tag.
     */
    public ID3v1Enhanced getId3v1Enhanced() {
        return id3v1Enhanced;
    }

    /**
     * @return The ID3v22 tag.
     */
    public ID3v22 getId3v22() {
        return id3v22;
    }

    /**
     * @return The ID3v23 tag.
     */
    public ID3v23 getId3v23() {
        return id3v23;
    }

    /**
     * @return The ID3v24 tag.
     */
    public ID3v24 getId3v24() {
        return id3v24;
    }
}