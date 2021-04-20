package TagStructures;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v2Frame {

    private String id;
    private int frameSize;
    private int frameHeaderSize;
    private int dataSize;
    private boolean unassignedStatusMessageFlag1 = false;
    private boolean preserveTag = false;
    private boolean preserveFile = false;
    private boolean readOnly = false;
    private boolean unassignedStatusMessageFlag2 = false;
    private boolean unassignedStatusMessageFlag3 = false;
    private boolean unassignedStatusMessageFlag4 = false;
    private boolean unassignedStatusMessageFlag5 = false;
    private boolean unassignedFormatDescriptionFlag1 = false;
    private boolean groupIdentity = false;
    private boolean unassignedFormatDescriptionFlag2 = false;
    private boolean unassignedFormatDescriptionFlag3 = false;
    private boolean compression = false;
    private boolean encryption = false;
    private boolean unsynchronisation = false;
    private boolean dataLengthIndicator = false;
    private byte[] frame;
    private byte[] frameHeader;
    private byte[] frameData;


    public ID3v2Frame() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public int getFrameHeaderSize() {
        return frameHeaderSize;
    }

    public void setFrameHeaderSize(int frameHeaderSize) {
        this.frameHeaderSize = frameHeaderSize;
    }

    public int getDataSize() {
        return dataSize;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
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

    public boolean isUnassignedStatusMessageFlag2() {
        return unassignedStatusMessageFlag2;
    }

    public void setUnassignedStatusMessageFlag2(boolean unassignedStatusMessageFlag2) {
        this.unassignedStatusMessageFlag2 = unassignedStatusMessageFlag2;
    }

    public boolean isUnassignedStatusMessageFlag3() {
        return unassignedStatusMessageFlag3;
    }

    public void setUnassignedStatusMessageFlag3(boolean unassignedStatusMessageFlag3) {
        this.unassignedStatusMessageFlag3 = unassignedStatusMessageFlag3;
    }

    public boolean isUnassignedStatusMessageFlag4() {
        return unassignedStatusMessageFlag4;
    }

    public void setUnassignedStatusMessageFlag4(boolean unassignedStatusMessageFlag4) {
        this.unassignedStatusMessageFlag4 = unassignedStatusMessageFlag4;
    }

    public boolean isUnassignedStatusMessageFlag5() {
        return unassignedStatusMessageFlag5;
    }

    public void setUnassignedStatusMessageFlag5(boolean unassignedStatusMessageFlag5) {
        this.unassignedStatusMessageFlag5 = unassignedStatusMessageFlag5;
    }

    public boolean isGroupIdentity() {
        return groupIdentity;
    }

    public void setGroupIdentity(boolean groupIdentity) {
        this.groupIdentity = groupIdentity;
    }

    public boolean isUnassignedFormatDescriptionFlag1() {
        return unassignedFormatDescriptionFlag1;
    }

    public void setUnassignedFormatDescriptionFlag1(boolean unassignedFormatDescriptionFlag1) {
        this.unassignedFormatDescriptionFlag1 = unassignedFormatDescriptionFlag1;
    }

    public boolean isUnassignedFormatDescriptionFlag2() {
        return unassignedFormatDescriptionFlag2;
    }

    public void setUnassignedFormatDescriptionFlag2(boolean unassignedFormatDescriptionFlag2) {
        this.unassignedFormatDescriptionFlag2 = unassignedFormatDescriptionFlag2;
    }

    public boolean isUnassignedFormatDescriptionFlag3() {
        return unassignedFormatDescriptionFlag3;
    }

    public void setUnassignedFormatDescriptionFlag3(boolean unassignedFormatDescriptionFlag3) {
        this.unassignedFormatDescriptionFlag3 = unassignedFormatDescriptionFlag3;
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

    public byte[] getFrame() {
        return frame;
    }

    public void setFrame(byte[] frame) {
        this.frame = frame;
    }

    public byte[] getFrameHeader() {
        return frameHeader;
    }

    public void setFrameHeader(byte[] frameHeader) {
        this.frameHeader = frameHeader;
    }

    public byte[] getFrameData() {
        return frameData;
    }

    public void setFrameData(byte[] frameData) {
        this.frameData = frameData;
    }

}
