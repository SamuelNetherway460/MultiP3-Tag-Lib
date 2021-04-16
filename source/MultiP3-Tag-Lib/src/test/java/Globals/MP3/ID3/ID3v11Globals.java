package Globals.MP3.ID3;

public class ID3v11Globals extends ID3v1Globals {

    // Normal
    public static final int TEST_TRACK_NUMBER_NOM = 8;

    // Minimum
    public static final int TEST_TRACK_NUMBER_MIN = 0;

    // Maximum
    public static final String TEST_COMMENT_MAX = "Testi Comment Max Characters";
    public static final int TEST_TRACK_NUMBER_MAX = 255;

    // Minimum - 1 i.e., robust minimum
    public static final int TEST_TRACK_NUMBER_ROBUST_MIN = -1;

    // Maximum + 1 i.e., robust maximum
    public static final String TEST_COMMENT_ROBUST_MAX = "Tes Comment Max Characters +1";
    public static final int TEST_TRACK_NUMBER_ROBUST_MAX = 256;
}
