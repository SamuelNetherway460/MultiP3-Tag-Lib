package Factories;

import Exceptions.HeaderNotFoundException;
import FileTypes.MP3;
import TagStructures.ID3v2Header;

public class ID3v2Factory {
    public static void extractTag(MP3 mp3) {
        try {
            ID3v2Header header = ID3v2HeaderFactory.extractHeader(mp3);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace(); // TODO Handle correctly
        }
    }
}
