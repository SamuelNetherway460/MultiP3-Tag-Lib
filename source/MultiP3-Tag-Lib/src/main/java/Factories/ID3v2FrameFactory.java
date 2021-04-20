package Factories;

import Exceptions.InvalidFrameException;
import TagStructures.ID3v2Frame;
import TagStructures.ID3v2Header;
import Utilities.BufferUtilities;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

import static Utilities.BufferUtilities.checkBit;
import static Utilities.BufferUtilities.unpackSynchsafeInteger;

/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v2FrameFactory {

    private static final int ID_START = 0;
    private static final int SIZE_START = 4;
    private static final int SIZE_START_1 = 4;
    private static final int SIZE_START_2 = 5;
    private static final int SIZE_START_3 = 6;
    private static final int SIZE_START_4 = 7;
    private static final int FLAGS_START = 8;
    private static final int STATUS_MESSAGES_FLAGS_START = 8;
    private static final int FORMAT_DESCRIPTION_FLAGS_START = 9;

    private static final int ID_LENGTH = 4;
    private static final int SIZE_LENGTH = 4;
    private static final int FLAGS_LENGTH = 2;

    // Bit start positions
    // Status Messages Flags
    private static final int UNASSIGNED_STATUS_MESSAGES_FLAG_1_BIT_POS = 0;
    private static final int TAG_ALTER_PRESERVATION_FLAG_BIT_POS = 1;
    private static final int FILE_ALTER_PRESERVATION_FLAG_BIT_POS = 2;
    private static final int READ_ONLY_FLAG_BIT_POS = 3;
    private static final int UNASSIGNED_STATUS_MESSAGES_FLAG_2_BIT_POS = 4;
    private static final int UNASSIGNED_STATUS_MESSAGES_FLAG_3_BIT_POS = 5;
    private static final int UNASSIGNED_STATUS_MESSAGES_FLAG_4_BIT_POS = 6;
    private static final int UNASSIGNED_STATUS_MESSAGES_FLAG_5_BIT_POS = 7;

    // Format Description Flags
    private static final int UNASSIGNED_FORMAT_DESCRIPTION_FLAG_1_BIT_POS = 0;
    private static final int GROUPING_IDENTITY_FLAG_BIT_POS = 1;
    private static final int UNASSIGNED_FORMAT_DESCRIPTION_FLAG_2_BIT_POS = 2;
    private static final int UNASSIGNED_FORMAT_DESCRIPTION_FLAG_3_BIT_POS = 3;
    private static final int COMPRESSION_FLAG_BIT_POS = 4;
    private static final int ENCRYPTION_FLAG_BIT_POS = 5;
    private static final int UNSYNCHRONISATION_FLAG_BIT_POS = 6;
    private static final int DATA_LENGTH_INDICATOR_FLAG_BIT_POS = 7;

    /**
     * Extracts all supported frames from the ID3v2 tag.
     *
     * @param header The ID3v2 tag header.
     * @param framesData The frames data as an array of bytes.
     * @return An arraylist of ID3v2 frames populated with data.
     */
    public static ArrayList<ID3v2Frame> extractFrames(ID3v2Header header, byte[] framesData) {
        ArrayList<ID3v2Frame> frames = new ArrayList<>();

        int startPosition = 0;
        while (startPosition < header.getDataSize()) {
            ID3v2Frame frame;
            try {
                frame = extractFrame(Arrays.copyOfRange(framesData, startPosition, framesData.length));
            } catch (InvalidFrameException ife) {
                break;
            }
            frames.add(frame);
            startPosition += frame.getFrameSize();
        }

        return frames;
    }

    /**
     * Extracts a single frame and populates a ID3v2 frame object with basic frame data.
     *
     * @param frameData The data for a single frame as an array of bytes.
     * @throws InvalidFrameException If the ID is invalid.
     * @return A ID3v2 frame populated with data.
     */
    private static ID3v2Frame extractFrame(byte[] frameData) throws InvalidFrameException {
        ID3v2Frame id3v2Frame = new ID3v2Frame();
        id3v2Frame.setFrameData(frameData);

        extractFrameID(id3v2Frame);
        extractFrameSizes(id3v2Frame);
        extractFrameFlags(id3v2Frame);
        extractFrameFlagData(id3v2Frame);
        extractFrameData(id3v2Frame);

        return id3v2Frame;
    }

    /**
     * Extracts the frame id for a particular ID3v2 frame.
     *
     * @param id3v2Frame The ID3v2Frame object being populated with the ID data.
     * @throws InvalidFrameException If the ID is invalid.
     */
    private static void extractFrameID(ID3v2Frame id3v2Frame) throws InvalidFrameException {
        String id = null;
        try {
            id = BufferUtilities.convertBytesToString(id3v2Frame.getFrameData(), ID_START, ID_LENGTH, "ISO-8859-1");
        } catch (UnsupportedEncodingException uee) {
            uee.printStackTrace();
        }

        if (!isFrameIDValid(id)) throw new InvalidFrameException("[INVALID FRAME EXCEPTION] The frame ID " + id
            + " does not correspond to an appropriate frame.");

        id3v2Frame.setId(id);
    }

    /**
     * Determines whether a particular frame ID is valid.
     *
     * @param id The string frame id being checked for validity.
     * @return A boolean value indicating the validity of the frame id.
     */
    public static boolean isFrameIDValid(String id) {
        for (int i = 0; i < id.length(); i++) {
            if (!((id.charAt(i) >= '0' && id.charAt(i) <= '9') || (id.charAt(i) >= 'A' && id.charAt(i) <= 'Z'))) return false;
        }
        return true;
    }

    /**
     * Extracts the size of the ID3v2 frame.
     *
     * @param id3v2Frame The ID3v2Frame object being populated with size data.
     */
    private static void extractFrameSizes(ID3v2Frame id3v2Frame) {
        int size = unpackSynchsafeInteger(
            id3v2Frame.getFrameData()[SIZE_START_1],
            id3v2Frame.getFrameData()[SIZE_START_2],
            id3v2Frame.getFrameData()[SIZE_START_3],
            id3v2Frame.getFrameData()[SIZE_START_4]);
        id3v2Frame.setFrameSize(size + 10);
        id3v2Frame.setDataSize(size);
    }

    /**
     * Extracts the flags configuration of the ID3v2.4 frame.
     *
     * @param id3v2Frame The ID3v2Frame being populated with flags configuration.
     */
    private static void extractFrameFlags(ID3v2Frame id3v2Frame) {
        id3v2Frame.setUnassignedStatusMessageFlag1(checkBit(id3v2Frame.getFrameData()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_1_BIT_POS));
        id3v2Frame.setPreserveTag(checkBit(id3v2Frame.getFrameData()[STATUS_MESSAGES_FLAGS_START], TAG_ALTER_PRESERVATION_FLAG_BIT_POS));
        id3v2Frame.setPreserveFile(checkBit(id3v2Frame.getFrameData()[STATUS_MESSAGES_FLAGS_START], FILE_ALTER_PRESERVATION_FLAG_BIT_POS));
        id3v2Frame.setReadOnly(checkBit(id3v2Frame.getFrameData()[STATUS_MESSAGES_FLAGS_START], READ_ONLY_FLAG_BIT_POS));
        id3v2Frame.setUnassignedStatusMessageFlag2(checkBit(id3v2Frame.getFrameData()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_2_BIT_POS));
        id3v2Frame.setUnassignedStatusMessageFlag3(checkBit(id3v2Frame.getFrameData()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_3_BIT_POS));
        id3v2Frame.setUnassignedStatusMessageFlag4(checkBit(id3v2Frame.getFrameData()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_4_BIT_POS));
        id3v2Frame.setUnassignedStatusMessageFlag5(checkBit(id3v2Frame.getFrameData()[STATUS_MESSAGES_FLAGS_START], UNASSIGNED_STATUS_MESSAGES_FLAG_5_BIT_POS));

        id3v2Frame.setUnassignedFormatDescriptionFlag1(checkBit(id3v2Frame.getFrameData()[FORMAT_DESCRIPTION_FLAGS_START], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_1_BIT_POS));
        id3v2Frame.setGroupIdentity(checkBit(id3v2Frame.getFrameData()[FORMAT_DESCRIPTION_FLAGS_START], GROUPING_IDENTITY_FLAG_BIT_POS));
        id3v2Frame.setUnassignedFormatDescriptionFlag2(checkBit(id3v2Frame.getFrameData()[FORMAT_DESCRIPTION_FLAGS_START], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_2_BIT_POS));
        id3v2Frame.setUnassignedFormatDescriptionFlag3(checkBit(id3v2Frame.getFrameData()[FORMAT_DESCRIPTION_FLAGS_START], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_3_BIT_POS));
        id3v2Frame.setCompression(checkBit(id3v2Frame.getFrameData()[FORMAT_DESCRIPTION_FLAGS_START], COMPRESSION_FLAG_BIT_POS));
        id3v2Frame.setEncryption(checkBit(id3v2Frame.getFrameData()[FORMAT_DESCRIPTION_FLAGS_START], ENCRYPTION_FLAG_BIT_POS));
        id3v2Frame.setUnsynchronisation(checkBit(id3v2Frame.getFrameData()[FORMAT_DESCRIPTION_FLAGS_START], UNSYNCHRONISATION_FLAG_BIT_POS));
        id3v2Frame.setDataLengthIndicator(checkBit(id3v2Frame.getFrameData()[FORMAT_DESCRIPTION_FLAGS_START], DATA_LENGTH_INDICATOR_FLAG_BIT_POS));
    }

    //TODO: Flag data based off checked flags
    /**
     * Extracts and populates necessary additional flag data.
     *
     * @param id3v2Frame The ID3v2Frame object being populated with additional flag data.
     */
    private static void extractFrameFlagData(ID3v2Frame id3v2Frame) {
        if (id3v2Frame.isUnassignedStatusMessageFlag1()) {}
        if (id3v2Frame.isPreserveTag()) {}
        if (id3v2Frame.isPreserveFile()) {}
        if (id3v2Frame.isReadOnly()) {}
        if (id3v2Frame.isUnassignedStatusMessageFlag2()) {}
        if (id3v2Frame.isUnassignedStatusMessageFlag3()) {}
        if (id3v2Frame.isUnassignedStatusMessageFlag4()) {}
        if (id3v2Frame.isUnassignedStatusMessageFlag5()) {}

        if (id3v2Frame.isUnassignedFormatDescriptionFlag1()) {}
        if (id3v2Frame.isGroupIdentity()) {}
        if (id3v2Frame.isUnassignedFormatDescriptionFlag2()) {}
        if (id3v2Frame.isUnassignedFormatDescriptionFlag3()) {}
        if (id3v2Frame.isCompression()) {}
        if (id3v2Frame.isEncryption()) {}
        if (id3v2Frame.isUnsynchronisation()) {}
        if (id3v2Frame.isDataLengthIndicator()) {}
    }

    //TODO: Potentially handle with sub class factories
    //TODO: Call relevant method based off frame ID
    /**
     * Extracts frame data contents, i.e., title of the track, album of the track, etc.
     *
     * @param id3v2Frame The ID3v2Frame being populated with the frames contents.
     */
    private static void extractFrameData(ID3v2Frame id3v2Frame) {

    }
}
