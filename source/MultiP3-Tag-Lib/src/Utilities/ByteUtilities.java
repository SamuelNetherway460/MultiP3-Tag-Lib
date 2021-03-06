package Utilities;

import FileTypes.MP3;
import FileTypes.WAV;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

/**
 * Utility class for accessing and modifying tag byte data.
 *
 * @author Samuel Netherway
 */
public class ByteUtilities {

    private static final int DEFAULT_BUFFER_LENGTH = 65536;
    private static final int ID3V1_TAG_LENGTH = 128;
    private static final int ENHANCED_TAG_LENGTH = 227;
    private static final int ENHANCED_TAG_START = 0;

    private static final int ID3V24_START_POSITION = 0;
    private static final int ID3V24_HEADER_LENGTH = 10;

    //TODO - JavaDoc

    /**
     *
     * @param mp3 The mp3 file which contains the
     * @return
     */
    public static byte[] getID3v1Bytes(MP3 mp3) {
        byte[] bytes = null;
        int endPortion = (int)mp3.getSize() - ID3V1_TAG_LENGTH;
        try {
            SeekableByteChannel seekableByteChannel = Files.newByteChannel(mp3.getPath(), StandardOpenOption.READ);
            ByteBuffer byteBuffer = ByteBuffer.allocate(ID3V1_TAG_LENGTH);
            seekableByteChannel.position(endPortion);
            byteBuffer.clear();
            seekableByteChannel.read(byteBuffer);
            bytes = byteBuffer.array();
        } catch (IOException ioe) {
            bytes = null;
            return bytes;
        }
        return bytes;
    }

    //TODO - JavaDoc
    //TODO - Comment on how this method works, look at documentation
    public static void writeID3v1Bytes(MP3 mp3) {
        byte[] bytes = mp3.getId3v1().getRaw();
        int endPortion = (int)mp3.getSize() - ID3V1_TAG_LENGTH;
        try {
            SeekableByteChannel seekableByteChannel = Files.newByteChannel(mp3.getPath(), StandardOpenOption.WRITE);
            seekableByteChannel.position(endPortion);
            ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            byteBuffer.rewind();
            seekableByteChannel.write(byteBuffer);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //TODO - JavaDoc
    public static byte[] getID3v1EnhancedBytes(MP3 mp3) {
        byte[] bytes = null;
        try {
            SeekableByteChannel seekableByteChannel = Files.newByteChannel(mp3.getPath(), StandardOpenOption.READ);
            ByteBuffer byteBuffer = ByteBuffer.allocate(ENHANCED_TAG_LENGTH);
            seekableByteChannel.position(ENHANCED_TAG_START);
            byteBuffer.clear();
            seekableByteChannel.read(byteBuffer);
            bytes = byteBuffer.array();
        } catch (IOException ioe) {
            bytes = null;
            return bytes;
        }
        return bytes;
    }

    public static byte[] all(MP3 mp3) {
        byte[] bytes = null;
        try {
            SeekableByteChannel seekableByteChannel = Files.newByteChannel(mp3.getPath(), StandardOpenOption.READ);
            System.out.println(seekableByteChannel.size());
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) seekableByteChannel.size());
            seekableByteChannel.position(0);
            byteBuffer.clear();
            seekableByteChannel.read(byteBuffer);
            bytes = byteBuffer.array();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            bytes = null;
            return bytes;
        }
        return bytes;
    }

    //TODO - JavaDoc
    //TODO - Implement
    public static byte[] getID3v22Bytes(MP3 mp3) {
        byte[] bytes = null;

        return bytes;
    }

    //TODO - JavaDoc
    //TODO - Implement
    public static byte[] getID3v23Bytes(MP3 mp3) {
        byte[] bytes = null;

        return bytes;
    }

    //TODO - Implement
    //TODO - JavaDoc
    /**
     *
     * @param wav
     * @return
     */
    public static byte[] getID3v23Bytes(WAV wav) {
        byte[] bytes = null;

        return bytes;
    }

    //TODO - JavaDoc
    //TODO - Implement
    public static byte[] getID3v24Bytes(MP3 mp3) {
        byte[] bytes = null;
        try {
            SeekableByteChannel seekableByteChannel = Files.newByteChannel(mp3.getPath(), StandardOpenOption.READ);
            ByteBuffer byteBuffer = ByteBuffer.allocate(ID3V24_HEADER_LENGTH);
            seekableByteChannel.position(ID3V24_START_POSITION);
            byteBuffer.clear();
            seekableByteChannel.read(byteBuffer);
            bytes = byteBuffer.array();
        } catch (IOException ioe) {
            bytes = null;
            return bytes;
        }
        return bytes;
    }

    /**
     * Updates a section of a byte array.
     *
     * @param raw Original byte array.
     * @param section New section content to be inserted.
     * @param start The start position of the section.
     * @param length The length of the section.
     * @return The updated byte array.
     */
    public static byte[] updateSection(byte[] raw, String section, int start, int length) {
        String paddedString = StringUtilities.addPadding(section, length);
        byte[] sectionBytes = paddedString.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(raw);
        buffer.position(start);
        buffer.put(sectionBytes);
        return raw;
    }
}