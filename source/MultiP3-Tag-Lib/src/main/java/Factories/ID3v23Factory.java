package Factories;

import Exceptions.HeaderNotFoundException;
import Exceptions.InvalidFrameException;
import FileTypes.MP3;
import FileTypes.WAV;
import TagStructures.ID3v23Frame;
import TagStructures.ID3v2Header;
import TagTypes.ID3v23;

import java.util.ArrayList;
import java.util.Arrays;

import static Factories.ID3v2HeaderFactory.*;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v23Factory extends ID3v2Factory {

    public static ID3v23 extractTag(MP3 mp3) {
        ID3v2Header header = null;
        try {
            header = ID3v2HeaderFactory.extractHeader(mp3);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace(); // TODO Handle correctly
            return null;
        }

        ID3v23 tag = new ID3v23();
        tag.setTagBytes(Arrays.copyOfRange(mp3.getBytes(), header.getPositionInFile(),
            header.getPositionInFile() + header.getTagSize()));

        if (header.hasExtendedHeader()) {

        } else {
            tag.setFrameBytes(Arrays.copyOfRange(tag.getTagBytes(), HEADER_LENGTH, header.getTagSize()));
        }
        tag.setHeader(header);

        ArrayList<ID3v23Frame> frames = extractFrames(header, tag.getFrameBytes());

        tag.setFrames(frames);

        return tag;
    }

    public static ID3v23 extractTag(WAV wav) {
        ID3v2Header header = null;
        try {
            header = ID3v2HeaderFactory.extractHeader(wav);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace(); // TODO Handle correctly
            return null;
        }

        ID3v23 tag = new ID3v23();
        tag.setTagBytes(Arrays.copyOfRange(wav.getBytes(), header.getPositionInFile(),
            header.getPositionInFile() + header.getTagSize()));

        if (header.hasExtendedHeader()) {

        } else {
            tag.setFrameBytes(Arrays.copyOfRange(tag.getTagBytes(), HEADER_LENGTH, header.getTagSize()));
        }
        tag.setHeader(header);

        ArrayList<ID3v23Frame> frames = extractFrames(header, tag.getFrameBytes());

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
    private static ArrayList<ID3v23Frame> extractFrames(ID3v2Header header, byte[] framesData) {
        ArrayList<ID3v23Frame> frames = new ArrayList<>();

        int startPosition = 0;
        while (startPosition < header.getDataSize()) {
            ID3v23Frame frame;
            try {
                frame = ID3v23FrameFactory.extractFrameMetadata(Arrays.copyOfRange(framesData, startPosition, framesData.length));
            } catch (InvalidFrameException ife) {
                break;
            }
            frames.add(frame);
            startPosition += frame.getFrameSize();
        }

        return frames;
    }
}
