package Factories;

//TODO - JavaDoc

import Exceptions.HeaderNotFoundException;
import Exceptions.InvalidFrameException;
import Exceptions.UnsupportedFrameException;
import FileTypes.MP3;
import TagStructures.ID3v22Frame;
import TagStructures.ID3v2Header;
import TagTypes.ID3v22;

import java.util.ArrayList;
import java.util.Arrays;

import static Factories.ID3v2HeaderFactory.*;

/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v22Factory extends ID3v2Factory {

    public static ID3v22 extractTag(MP3 mp3) {
        ID3v2Header header = null;
        try {
            header = ID3v2HeaderFactory.extractHeader(mp3);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace(); // TODO Handle correctly
        }

        ID3v22 tag = new ID3v22();
        tag.setTagBytes(Arrays.copyOfRange(mp3.getBytes(), header.getPositionInFile(),
            header.getPositionInFile() + header.getTagSize()));

        if (header.hasExtendedHeader()) {

        } else {
            tag.setFrameBytes(Arrays.copyOfRange(tag.getTagBytes(), HEADER_LENGTH, header.getTagSize()));
        }
        tag.setHeader(header);

        ArrayList<ID3v22Frame> frames = extractFrames(header, tag.getFrameBytes());

        tag.setFrames(frames);

        return tag;
    }

    /**
     * Extracts all supported frames from the ID3v2 tag.
     *
     * @param header The ID3v2 tag header.
     * @param framesData The frames data as an array of bytes.
     * @return An arraylist of ID3v2 frames populated with data.
     */
    private static ArrayList<ID3v22Frame> extractFrames(ID3v2Header header, byte[] framesData) {
        ArrayList<ID3v22Frame> frames = new ArrayList<>();

        int startPosition = 0;
        while (startPosition < header.getDataSize()) {
            ID3v22Frame frame;
            try {
                frame = ID3v22FrameFactory.extractFrameMetadata(Arrays.copyOfRange(framesData, startPosition, framesData.length));
            } catch (InvalidFrameException ife) {
                break;
            }
            frames.add(frame);
            startPosition += frame.getFrameSize();
        }

        return frames;
    }
}
