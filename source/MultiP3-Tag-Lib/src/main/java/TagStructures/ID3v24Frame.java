package TagStructures;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static Factories.ID3v24FrameFactory.*;
import static Utilities.BufferUtilities.*;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v24Frame extends ID3v2Frame {

    private boolean unassignedStatusMessageFlag1;
    private boolean preserveTag;
    private boolean preserveFile;
    private boolean readOnly;
    private boolean unassignedStatusMessageFlag5;
    private boolean unassignedStatusMessageFlag6;
    private boolean unassignedStatusMessageFlag7;
    private boolean unassignedStatusMessageFlag8;

    private boolean unassignedFormatDescriptionFlag1;
    private boolean groupIdentity;
    private boolean unassignedFormatDescriptionFlag3;
    private boolean unassignedFormatDescriptionFlag4;
    private boolean compression;
    private boolean encryption;
    private boolean unsynchronisation;
    private boolean dataLengthIndicator;

    private static final int FRAME_HEADER_SIZE = 10;

    public ID3v24Frame() {

    }

    //TODO: Create new blank frame using id and other relevant parameters
    public ID3v24Frame(String id, byte[] frameData) {
        this.id = id;
        this.frameData = frameData;
        this.dataSize = frameData.length;
        this.frameSize = frameData.length + FRAME_HEADER_SIZE;
        this.frameHeader = constructDefaultHeaderBytes(id, frameData.length);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(frameHeader);
            outputStream.write(frameData);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        this.frame = outputStream.toByteArray();
    }

    public byte[] constructDefaultHeaderBytes(String id, int dataSize) {
        byte[] byteID = id.getBytes(StandardCharsets.ISO_8859_1);
        byte[] flags = defaultFlags();
        byte[] size = packSynchsafeInteger(dataSize);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(byteID);
            outputStream.write(size);
            outputStream.write(flags);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return outputStream.toByteArray();
    }

    public byte[] defaultFlags() {
        byte[] flags = {(byte) 0, (byte) 0};
        setBit(flags[0], UNASSIGNED_STATUS_MESSAGES_FLAG_1_BIT_POS, false);
        setBit(flags[0], TAG_ALTER_PRESERVATION_FLAG_BIT_POS, false);
        setBit(flags[0], FILE_ALTER_PRESERVATION_FLAG_BIT_POS, false);
        setBit(flags[0], READ_ONLY_FLAG_BIT_POS, false);
        setBit(flags[0], UNASSIGNED_STATUS_MESSAGES_FLAG_5_BIT_POS, false);
        setBit(flags[0], UNASSIGNED_STATUS_MESSAGES_FLAG_6_BIT_POS, false);
        setBit(flags[0], UNASSIGNED_STATUS_MESSAGES_FLAG_7_BIT_POS, false);
        setBit(flags[0], UNASSIGNED_STATUS_MESSAGES_FLAG_8_BIT_POS, false);

        setBit(flags[1], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_1_BIT_POS, false);
        setBit(flags[1], GROUPING_IDENTITY_FLAG_BIT_POS, false);
        setBit(flags[1], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_3_BIT_POS, false);
        setBit(flags[1], UNASSIGNED_FORMAT_DESCRIPTION_FLAG_4_BIT_POS, false);
        setBit(flags[1], COMPRESSION_FLAG_BIT_POS, false);
        setBit(flags[1], ENCRYPTION_FLAG_BIT_POS, false);
        setBit(flags[1], UNSYNCHRONISATION_FLAG_BIT_POS, false);
        setBit(flags[1], DATA_LENGTH_INDICATOR_FLAG_BIT_POS, false);

        return flags;
    }



    public boolean isUnassignedStatusMessageFlag1() {
        return unassignedStatusMessageFlag1;
    }

    public void setUnassignedStatusMessageFlag1(boolean unassignedStatusMessageFlag1) {
        this.unassignedStatusMessageFlag1 = unassignedStatusMessageFlag1;
    }

    public boolean isPreserveTag() {
        return preserveTag;
    }

    public void setPreserveTag(boolean preserveTag) {
        this.preserveTag = preserveTag;
    }

    public boolean isPreserveFile() {
        return preserveFile;
    }

    public void setPreserveFile(boolean preserveFile) {
        this.preserveFile = preserveFile;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public boolean isUnassignedStatusMessageFlag5() {
        return unassignedStatusMessageFlag5;
    }

    public void setUnassignedStatusMessageFlag5(boolean unassignedStatusMessageFlag5) {
        this.unassignedStatusMessageFlag5 = unassignedStatusMessageFlag5;
    }

    public boolean isUnassignedStatusMessageFlag6() {
        return unassignedStatusMessageFlag6;
    }

    public void setUnassignedStatusMessageFlag6(boolean unassignedStatusMessageFlag6) {
        this.unassignedStatusMessageFlag6 = unassignedStatusMessageFlag6;
    }

    public boolean isUnassignedStatusMessageFlag7() {
        return unassignedStatusMessageFlag7;
    }

    public void setUnassignedStatusMessageFlag7(boolean unassignedStatusMessageFlag7) {
        this.unassignedStatusMessageFlag7 = unassignedStatusMessageFlag7;
    }

    public boolean isUnassignedStatusMessageFlag8() {
        return unassignedStatusMessageFlag8;
    }

    public void setUnassignedStatusMessageFlag8(boolean unassignedStatusMessageFlag8) {
        this.unassignedStatusMessageFlag8 = unassignedStatusMessageFlag8;
    }

    public boolean isUnassignedFormatDescriptionFlag1() {
        return unassignedFormatDescriptionFlag1;
    }

    public void setUnassignedFormatDescriptionFlag1(boolean unassignedFormatDescriptionFlag1) {
        this.unassignedFormatDescriptionFlag1 = unassignedFormatDescriptionFlag1;
    }

    public boolean isGroupIdentity() {
        return groupIdentity;
    }

    public void setGroupIdentity(boolean groupIdentity) {
        this.groupIdentity = groupIdentity;
    }

    public boolean isUnassignedFormatDescriptionFlag3() {
        return unassignedFormatDescriptionFlag3;
    }

    public void setUnassignedFormatDescriptionFlag3(boolean unassignedFormatDescriptionFlag3) {
        this.unassignedFormatDescriptionFlag3 = unassignedFormatDescriptionFlag3;
    }

    public boolean isUnassignedFormatDescriptionFlag4() {
        return unassignedFormatDescriptionFlag4;
    }

    public void setUnassignedFormatDescriptionFlag4(boolean unassignedFormatDescriptionFlag4) {
        this.unassignedFormatDescriptionFlag4 = unassignedFormatDescriptionFlag4;
    }

    public boolean isCompression() {
        return compression;
    }

    public void setCompression(boolean compression) {
        this.compression = compression;
    }

    public boolean isEncryption() {
        return encryption;
    }

    public void setEncryption(boolean encryption) {
        this.encryption = encryption;
    }

    public boolean isUnsynchronisation() {
        return unsynchronisation;
    }

    public void setUnsynchronisation(boolean unsynchronisation) {
        this.unsynchronisation = unsynchronisation;
    }

    public boolean isDataLengthIndicator() {
        return dataLengthIndicator;
    }

    public void setDataLengthIndicator(boolean dataLengthIndicator) {
        this.dataLengthIndicator = dataLengthIndicator;
    }
}
