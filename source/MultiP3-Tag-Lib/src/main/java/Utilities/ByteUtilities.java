package Utilities;

import FileTypes.MP3;
import FileTypes.WAV;
import TagStructures.ID3v2Header;
import TagTypes.ID3v24;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

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

    private static final int DECIMAL_I = 73;
    private static final int DECIMAL_D = 68;
    private static final int DECIMAL_3 = 51;

    private static final String HEX_I = "0x0049";
    private static final String HEX_D = "0x0044";
    private static final String HEX_3 = "0x0033";

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
    //TODO - Comment on how this method works, look at documentation
    public static void writeID3v11Bytes(MP3 mp3) {
        byte[] bytes = mp3.getId3v11().getRaw();
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

    public static byte[] scanForID3v2Header(MP3 mp3) {
        byte[] bytes = all(mp3);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i + ID3v2Header.I_OFFSET] == DECIMAL_I
                && bytes[i + ID3v2Header.D_OFFSET] == DECIMAL_D
                && bytes[i + ID3v2Header.THREE_OFFSET] == DECIMAL_3) {
                if (bytes[i + ID3v2Header.MAJOR_VERSION_OFFSET] < 255
                    && bytes[i + ID3v2Header.MINOR_VERSION_OFFSET] < 255) {
                    if (bytes[i + ID3v2Header.TAG_SIZE_1_OFFSET] < 128
                        && bytes[i + ID3v2Header.TAG_SIZE_2_OFFSET] < 128
                        && bytes[i + ID3v2Header.TAG_SIZE_3_OFFSET] < 128
                        && bytes[i + ID3v2Header.TAG_SIZE_4_OFFSET] < 128) {
                        return Arrays.copyOfRange(bytes, i, ID3v2Header.ID3V2_HEADER_LENGTH - 1);
                    }
                }
            }
        }
        return null;
    }

    // TODO Implement
    /**
     * Extracts the variable length extended header from the FileTypes.MP3.ID3.ID3v24 tag.
     *
     * @param id3v24 The FileTypes.MP3.ID3.ID3v24 tag.
     * @return A byte array containing the extended FileTypes.MP3.ID3.ID3v24 tag header.
     */
    public static byte[] getID3v2ExtendedHeader(ID3v24 id3v24) {
        return Arrays.copyOfRange(id3v24.getBytes(), ID3V24_START_POSITION, ID3V24_HEADER_LENGTH - 1);
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

    //TODO: Throw exception if cannot update
    /**
     * Updates a section of a byte array.
     *
     * @param raw Original byte array.
     * @param section New section content to be inserted.
     * @param start The start position of the section.
     * @return The updated byte array.
     */
    public static byte[] updateSection(byte[] raw, int section, int start) {
        byte sectionBytes;
        if (section < 128) {
            sectionBytes = (byte) section;
        } else {
            sectionBytes = (byte) (section - 256);
        }

        ByteBuffer buffer = ByteBuffer.wrap(raw);
        buffer.position(start);
        buffer.put(sectionBytes);
        return raw;
    }
}