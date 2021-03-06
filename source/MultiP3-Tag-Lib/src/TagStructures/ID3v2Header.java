package TagStructures;

public class ID3v2Header {
    public final String IDENTIFIER = "ID3";

    private boolean unsynchronisation = false;
    private boolean extendedHeader = false;
    private boolean experimentalIndicator = false;
    private boolean footer = false;
    private int tagSize = 0;
    protected byte[] raw;

    public ID3v2Header() {
        super();
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
        return experimentalIndicator;
    }

    /**
     * Updates the flag value indicating whether the tag is experimental.
     *
     * @param experimentalIndicator A boolean value indicating whether the tag is experimental.
     */
    public void setExperimentalIndicator(boolean experimentalIndicator) {
        this.experimentalIndicator = experimentalIndicator;
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
}
