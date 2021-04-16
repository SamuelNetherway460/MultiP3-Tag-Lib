package TagStructures;

public class ID3v2Header {

    public static final String IDENTIFIER = "FileTypes.MP3.ID3";
    public static final int FILE_IDENTIFIER_OFFSET = 0;
    public static final int I_OFFSET = 0;
    public static final int D_OFFSET = 1;
    public static final int THREE_OFFSET = 2;
    public static final int MAJOR_VERSION_OFFSET = 3;
    public static final int MINOR_VERSION_OFFSET = 4;
    public static final int FLAGS_OFFSET = 5;
    public static final int TAG_SIZE_1_OFFSET = 6;
    public static final int TAG_SIZE_2_OFFSET = 7;
    public static final int TAG_SIZE_3_OFFSET = 8;
    public static final int TAG_SIZE_4_OFFSET = 9;
    public static final int UNSYNCHRONISATION_BIT = 1;
    public static final int EXTENDED_HEADER_BIT = 2;
    public static final int EXPERIMENTAL_INDICATOR_BIT = 3;
    public static final int FOOTER_PRESENT_BIT = 4;
    public static final int UNDEFINED_FLAG_ONE_BIT = 5;
    public static final int UNDEFINED_FLAG_TWO_BIT = 6;
    public static final int UNDEFINED_FLAG_THREE_BIT = 7;
    public static final int UNDEFINED_FLAG_FOUR_BIT = 8;
    public static final int ID3V2_HEADER_LENGTH = 10;
    public static final int FILE_IDENTIFIER_LENGTH = 3;
    public static final int VERSION_LENGTH = 2;
    public static final int MAJOR_VERSION_LENGTH = 1;
    public static final int MINOR_VERSION_LENGTH = 1;
    public static final int FLAGS_LENGTH = 1;
    public static final int TAG_SIZE_LENGTH = 4;

    private boolean unsynchronisation = false;
    private boolean extendedHeader = false;
    private boolean experimentalIndicator = false;
    private boolean footer = false;
    private int tagSize = 0;
    protected byte[] bytes;

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

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
