package Globals.MP3.ID3.ID3v1;

public class ID3v1Globals {

    // Normal
    public static final String TEST_TITLE_NOM = "Testing Title";
    public static final String TEST_ARTIST_NOM = "Testing Artist";
    public static final String TEST_ALBUM_NOM = "Testing Album";
    public static final String TEST_COMMENT_NOM = "Testing Comment";
    public static final int TEST_YEAR_NOM = 2021;
    public static final String TEST_GENRE_NOM = "Dance";
    public static final int TEST_GENRE_INDEX_NOM = 3;

    // Minimum
    public static final String TEST_TITLE_MIN = "";
    public static final String TEST_ARTIST_MIN = "";
    public static final String TEST_ALBUM_MIN = "";
    public static final String TEST_COMMENT_MIN = "";
    public static final int TEST_YEAR_MIN = 0;
    public static final String TEST_GENRE_MIN = "Blues";
    public static final int TEST_GENRE_INDEX_MIN = 0;

    // Maximum
    public static final String TEST_TITLE_MAX = "Testing Title Max Characters--";
    public static final String TEST_ARTIST_MAX = "Testing Artist Max Characters-";
    public static final String TEST_ALBUM_MAX = "Testing Album Max Characters--";
    public static final String TEST_COMMENT_MAX = "Testing Comment Max Characters";
    public static final int TEST_YEAR_MAX = 9999;
    public static final String TEST_GENRE_MAX = "Psybient";
    public static final int TEST_GENRE_INDEX_MAX = 191;

    // Minimum - 1 i.e., robust minimum
    public static final int TEST_YEAR_ROBUST_MIN = -1;
    public static final int TEST_GENRE_INDEX_ROBUST_MIN = -1;

    // Maximum + 1 i.e., robust maximum
    public static final String TEST_TITLE_ROBUST_MAX = "Testing Title Max Characters +1";
    public static final String TEST_ARTIST_ROBUST_MAX = "Testing Artist Max Characters+1";
    public static final String TEST_ALBUM_ROBUST_MAX = "Testing Album Max Characters +1";
    public static final String TEST_COMMENT_ROBUST_MAX = "Testi Comment Max Characters +1";
    public static final int TEST_YEAR_ROBUST_MAX = 10000;
    public static final int TEST_GENRE_INDEX_ROBUST_MAX = 192;
}
