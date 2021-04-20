package Utilities;

import Factories.ID3v2HeaderFactory;
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

    public static byte[] getFileBytes(MP3 mp3) {
        return all(mp3);
    }

    public static byte[] all(MP3 mp3) {
        byte[] bytes = null;
        try {
            SeekableByteChannel seekableByteChannel = Files.newByteChannel(mp3.getPath(), StandardOpenOption.READ);
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

    public static byte[] getID3v2HeaderBytes(MP3 mp3) {
        byte[] bytes = all(mp3);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i + ID3v2HeaderFactory.I_START] == DECIMAL_I
                && bytes[i + ID3v2HeaderFactory.D_START] == DECIMAL_D
                && bytes[i + ID3v2HeaderFactory.THREE_START] == DECIMAL_3) {
                if (bytes[i + ID3v2HeaderFactory.MAJOR_VERSION_START] < 255
                    && bytes[i + ID3v2HeaderFactory.MINOR_VERSION_START] < 255) {
                    if (bytes[i + ID3v2HeaderFactory.SIZE_START_1] < 128
                        && bytes[i + ID3v2HeaderFactory.SIZE_START_2] < 128
                        && bytes[i + ID3v2HeaderFactory.SIZE_START_3] < 128
                        && bytes[i + ID3v2HeaderFactory.SIZE_START_4] < 128) {
                        return Arrays.copyOfRange(bytes, i, ID3v2HeaderFactory.HEADER_LENGTH);
                    }
                }
            }
        }
        return null;
    }

    public static int scanForID3v2TagPosition(MP3 mp3) {
        byte[] bytes = all(mp3);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i + ID3v2HeaderFactory.I_START] == DECIMAL_I
                && bytes[i + ID3v2HeaderFactory.D_START] == DECIMAL_D
                && bytes[i + ID3v2HeaderFactory.THREE_START] == DECIMAL_3) {
                if (bytes[i + ID3v2HeaderFactory.MAJOR_VERSION_START] < 255
                    && bytes[i + ID3v2HeaderFactory.MINOR_VERSION_START] < 255) {
                    if (bytes[i + ID3v2HeaderFactory.SIZE_START_1] < 128
                        && bytes[i + ID3v2HeaderFactory.SIZE_START_2] < 128
                        && bytes[i + ID3v2HeaderFactory.SIZE_START_3] < 128
                        && bytes[i + ID3v2HeaderFactory.SIZE_START_4] < 128) {
                        return i;
                    }
                }
            }
        }
        return -1; //TODO:  ERROR VALUE, TAG COULD NOT BE FOUND REPLACE WITH EXCEPTION THROW
    }

    public static byte[] getID3v2TagBytes(MP3 mp3, ID3v2Header header) {
        byte[] bytes = null;
        try {
            SeekableByteChannel seekableByteChannel = Files.newByteChannel(mp3.getPath(), StandardOpenOption.READ);
            ByteBuffer byteBuffer = ByteBuffer.allocate(header.getTagSize());
            seekableByteChannel.position(header.getPositionInFile());
            byteBuffer.clear();
            seekableByteChannel.read(byteBuffer);
            bytes = byteBuffer.array();
        } catch (IOException ioe) {
            bytes = null;
            return bytes;
        }
        return bytes;
    }

    // TODO Implement
    /**
     * Extracts the variable length extended header from the FileTypes.MP3.ID3.ID3v24 tag.
     *
     * @param id3v24 The FileTypes.MP3.ID3.ID3v24 tag.
     * @return A byte array containing the extended FileTypes.MP3.ID3.ID3v24 tag header.
     */
    public static byte[] getID3v2ExtendedHeader(ID3v24 id3v24) {
        //return Arrays.copyOfRange(id3v24.getBytes(), ID3V24_START_POSITION, ID3V24_HEADER_LENGTH - 1);
        return null;
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