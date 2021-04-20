package TagStructures;

public class ID3v2Header {

    private int majorVersion;
    private int minorVersion;
    private boolean unsynchronisation;
    private boolean compression;
    private boolean extendedHeader;
    private boolean experimental;
    private boolean footer;
    private boolean unassignedFlag1;
    private boolean unassignedFlag2;
    private boolean unassignedFlag3;
    private boolean unassignedFlag4;
    private int tagSize;
    private int dataSize;
    private int positionInFile;
    private byte[] bytes;

    public ID3v2Header() {}

    public ID3v2Header(int majorVersion, int minorVersion, boolean unsynchronisation, boolean extendedHeader,
                       boolean experimental, boolean footer, boolean unassignedFlag1, boolean unassignedFlag2,
                       boolean unassignedFlag3, boolean unassignedFlag4, int tagSize, int dataSize, int positionInFile,
                       byte[] bytes) {
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.unsynchronisation = unsynchronisation;
        this.extendedHeader = extendedHeader;
        this.experimental = experimental;
        this.footer = footer;
        this.unassignedFlag1 = unassignedFlag1;
        this.unassignedFlag2 = unassignedFlag2;
        this.unassignedFlag3 = unassignedFlag3;
        this.unassignedFlag4 = unassignedFlag4;
        this.tagSize = tagSize;
        this.dataSize = dataSize;
        this.positionInFile = positionInFile;
        this.bytes = bytes;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    /**
     * Gets the flag value indicating whether the tag has unsynchronisation.
     *
     * @return A boolean value indicating whether the tag has unsynchronisation.
     */
    public boolean hasUnsynchronisation() {
        return unsynchronisation;
    }

    /**
     * Updates the flag value indicating whether the tag has unsynchronisation.
     *
     * @param unsynchronisation A boolean value indicating whether the tag has unsynchronisation.
     */
    public void setUnsynchronisation(boolean unsynchronisation) {
        this.unsynchronisation = unsynchronisation;
    }

    /**
     * Gets the flag value indicating whether the tag uses a compression scheme. Exclusive to the ID3v2.2 version.
     *
     * @return A boolean value indicating whether the tag uses a compression scheme.
     */
    public boolean hasCompression() {
        if (majorVersion != 2) return false;
        return compression;
    }

    /**
     * Gets the flag value indicating whether the tag has an extended header.
     *
     * @return A boolean value indicating whether the tag has an extended header.
     */
    public boolean hasExtendedHeader() {
        return extendedHeader;
    }

    /**
     * Update the flag value indicating whether the tag contains an extended header.
     *
     * @param extendedHeader A boolean value indicating whether the tag contains an extended header.
     */
    public void setExtendedHeader(boolean extendedHeader) {
        this.extendedHeader = extendedHeader;
    }

    /**
     * Gets the flag value indicating whether the tag is experimental.
     *
     * @return A boolean value indicating whether the tag is experimental.
     */
    public boolean hasExperimentalIndicator() {
        return experimental;
    }

    /**
     * Updates the flag value indicating whether the tag is experimental.
     *
     * @param experimental A boolean value indicating whether the tag is experimental.
     */
    public void setExperimental(boolean experimental) {
        this.experimental = experimental;
    }

    /**
     * Gets the flag value indicating whether the tag has a footer.
     *
     * @return A boolean value indicating whether the tag has a footer.
     */
    public boolean hasFooter() {
        return footer;
    }

    /**
     * Updates the flag value indicating whether the tag has a footer.
     *
     * @param footer A boolean value indicating whether the tag has a footer.
     */
    public void setFooter(boolean footer) {
        this.footer = footer;
    }

    public boolean hasUnassignedFlag1() {
        return unassignedFlag1;
    }

    public void setUnassignedFlag1(boolean unassignedFlag1) {
        this.unassignedFlag1 = unassignedFlag1;
    }

    public boolean hasUnassignedFlag2() {
        return unassignedFlag2;
    }

    public void setUnassignedFlag2(boolean unassignedFlag2) {
        this.unassignedFlag2 = unassignedFlag2;
    }

    public boolean hasUnassignedFlag3() {
        return unassignedFlag3;
    }

    public void setUnassignedFlag3(boolean unassignedFlag3) {
        this.unassignedFlag3 = unassignedFlag3;
    }

    public boolean hasUnassignedFlag4() {
        return unassignedFlag4;
    }

    public void setUnassignedFlag4(boolean unassignedFlag4) {
        this.unassignedFlag4 = unassignedFlag4;
    }

    /**
     * The size of the tag in bytes.
     *
     * @return The size of the tag in bytes.
     */
    public int getTagSize() {
        return tagSize;
    }

    /**
     * Updates the size of the tag in bytes.
     *
     * @param tagSize The size of the tag in bytes.
     */
    public void setTagSize(int tagSize) {
        this.tagSize = tagSize;
    }

    public int getDataSize() {
        return dataSize;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }

    public int getPositionInFile() {
        return positionInFile;
    }

    public void setPositionInFile(int positionInFile) {
        this.positionInFile = positionInFile;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
