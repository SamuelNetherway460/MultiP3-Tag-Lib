package Factories;

import Exceptions.HeaderNotFoundException;
import FileTypes.MP3;
import TagStructures.ID3v2Header;
import Utilities.ByteUtilities;

public class ID3v2HeaderFactory {



    public static ID3v2Header extractHeader(MP3 mp3) throws HeaderNotFoundException {
        ID3v2Header header = new ID3v2Header();
        byte[] headerBytes = ByteUtilities.scanForID3v2Header(mp3);
        if (headerBytes == null)
            throw new HeaderNotFoundException("[HEADER NOT FOUND EXCEPTION] TestFileTypes.WAV.ID3v2 header could not be extracted from file.");
        header.setBytes(headerBytes);
        return header;
    }
}
