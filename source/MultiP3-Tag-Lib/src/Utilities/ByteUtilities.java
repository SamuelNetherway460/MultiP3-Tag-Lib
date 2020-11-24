package Utilities;

import FileTypes.MP3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

//TODO - JavaDoc
public class ByteUtilities {

    private static final int DEFAULT_BUFFER_LENGTH = 65536;
    private static final int ID3V1_TAG_LENGTH = 128;
    private static final int ENCHANCED_TAG_LENGTH = 227;
    private static final int ENHANCED_TAG_START = 0;

    //TODO - JavaDoc
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
    public static byte[] getID3v1EnhancedBytes(MP3 mp3) {
        byte[] bytes = null;
        try {
            SeekableByteChannel seekableByteChannel = Files.newByteChannel(mp3.getPath(), StandardOpenOption.READ);
            ByteBuffer byteBuffer = ByteBuffer.allocate(ENCHANCED_TAG_LENGTH);
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

    //TODO - JavaDoc
    //TODO - Implement
    public static byte[] getID3v24Bytes(MP3 mp3) {
        byte[] bytes = null;

        return bytes;
    }
}