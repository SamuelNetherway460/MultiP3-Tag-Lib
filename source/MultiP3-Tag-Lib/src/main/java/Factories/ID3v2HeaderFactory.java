package Factories;

import Exceptions.HeaderNotFoundException;
import FileTypes.MP3;
import FileTypes.WAV;
import TagStructures.ID3v2Header;
import Utilities.ByteUtilities;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import static Utilities.BufferUtilities.*;
import static Utilities.ByteUtilities.scanForID3v2TagPosition;

public class ID3v2HeaderFactory {

    public static final String IDENTIFIER = "ID3";

    // Byte start positions
    public static final int IDENTIFIER_START = 0;
    public static final int I_START = 0;
    public static final int D_START = 1;
    public static final int THREE_START = 2;
    public static final int VERSION_START = 3;
    public static final int MAJOR_VERSION_START = 3;
    public static final int MINOR_VERSION_START = 4;
    public static final int FLAGS_START = 5;
    public static final int TAG_SIZE_START = 6;
    public static final int SIZE_START_1 = 6;
    public static final int SIZE_START_2 = 7;
    public static final int SIZE_START_3 = 8;
    public static final int SIZE_START_4 = 9;


    // Byte lengths
    public static final int HEADER_LENGTH = 10;
    public static final int IDENTIFIER_LENGTH = 3;
    public static final int VERSION_LENGTH = 2;
    public static final int MAJOR_VERSION_LENGTH = 1;
    public static final int MINOR_VERSION_LENGTH = 1;
    public static final int FLAGS_LENGTH = 1;
    public static final int TAG_SIZE_LENGTH = 4;
    public static final int INDIVIDUAL_SIZE_LENGTH = 1;

    // Bit start positions
    public static final int UNSYNCHRONISATION_FLAG_BIT_POS = 0;
    public static final int UNSYNCHRONISATION_V22_FLAG_BIT_POS = 0;
    public static final int EXTENDED_HEADER_FLAG_BIT_POS = 1;
    public static final int EXPERIMENTAL_FLAG_BIT_POS = 2;
    public static final int FOOTER_FLAG_BIT_POS = 3;
    public static final int UNASSIGNED_FLAG_BIT_1_POS = 4;
    public static final int UNASSIGNED_FLAG_BIT_2_POS = 5;
    public static final int UNASSIGNED_FLAG_BIT_3_POS = 6;
    public static final int UNASSIGNED_FLAG_4_POS = 7;

    public static ID3v2Header extractHeader(MP3 mp3) throws HeaderNotFoundException {
        int id3v2TagPosition = scanForID3v2TagPosition(mp3);
        byte[] headerBytes = Arrays.copyOfRange(mp3.getBytes(), id3v2TagPosition, id3v2TagPosition + HEADER_LENGTH);
        if (headerBytes == null)
            throw new HeaderNotFoundException("[HEADER NOT FOUND EXCEPTION] ID3v2 header could not be extracted from file.");
        ID3v2Header header = parseHeader(headerBytes, id3v2TagPosition);
        return header;
    }

    public static ID3v2Header extractHeader(WAV wav) throws HeaderNotFoundException {
        int id3v2TagPosition = scanForID3v2TagPosition(wav);
        byte[] headerBytes = Arrays.copyOfRange(wav.getBytes(), id3v2TagPosition, id3v2TagPosition + HEADER_LENGTH);
        if (headerBytes == null)
            throw new HeaderNotFoundException("[HEADER NOT FOUND EXCEPTION] ID3v2 header could not be extracted from file.");
        ID3v2Header header = parseHeader(headerBytes, id3v2TagPosition);
        return header;
    }

    public static ID3v2Header parseHeader(byte[] headerBytes, int positionInFile) {

        int majorVersion = 0;
        int minorVersion = 0;
        try {
            majorVersion = convertByteToInt(headerBytes[MAJOR_VERSION_START]);
            minorVersion = convertByteToInt(headerBytes[MINOR_VERSION_START]);
        } catch (UnsupportedEncodingException uee) {
            uee.printStackTrace();
        }

        boolean unsynchronisation = checkBit(headerBytes[FLAGS_START], UNSYNCHRONISATION_FLAG_BIT_POS);
        boolean extendedHeader = checkBit(headerBytes[FLAGS_START], EXTENDED_HEADER_FLAG_BIT_POS);
        boolean experimental = checkBit(headerBytes[FLAGS_START], EXPERIMENTAL_FLAG_BIT_POS);
        boolean footer = checkBit(headerBytes[FLAGS_START], FOOTER_FLAG_BIT_POS);
        boolean unassignedFlag1 = checkBit(headerBytes[FLAGS_START], UNASSIGNED_FLAG_BIT_1_POS);
        boolean unassignedFlag2 = checkBit(headerBytes[FLAGS_START], UNASSIGNED_FLAG_BIT_2_POS);
        boolean unassignedFlag3 = checkBit(headerBytes[FLAGS_START], UNASSIGNED_FLAG_BIT_3_POS);
        boolean unassignedFlag4 = checkBit(headerBytes[FLAGS_START], UNASSIGNED_FLAG_4_POS);

        int size = unpackSynchsafeInteger(
            headerBytes[SIZE_START_1],
            headerBytes[SIZE_START_2],
            headerBytes[SIZE_START_3],
            headerBytes[SIZE_START_4]);

        return new ID3v2Header(majorVersion, minorVersion, unsynchronisation, extendedHeader, experimental, footer,
            unassignedFlag1, unassignedFlag2, unassignedFlag3, unassignedFlag4, size + HEADER_LENGTH, size,
            positionInFile, headerBytes);
    }

    public static void validateHeader(ID3v2Header id3v2Header) {

    }
}
