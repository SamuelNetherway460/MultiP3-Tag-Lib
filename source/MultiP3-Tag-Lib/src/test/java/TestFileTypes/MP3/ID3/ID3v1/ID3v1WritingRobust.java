package TestFileTypes.MP3.ID3.ID3v1;

import FileTypes.MP3;
import Globals.MP3.ID3.ID3v1Globals;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ID3v1WritingRobust {

    @Test
    @DisplayName("Should not write ID3v1 Title with characters = MAX+1")
    void shouldNotWriteInvalidTitleMaxCharactersPlusOne() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v1.getTitle());// Check for original title

        // Check that exception is thrown
        ID3v1 finalId3v = id3v1;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setTitle(ID3v1Globals.TEST_TITLE_ROBUST_MAX));

        // Refresh and read ID3v1 tag to check that title hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v1.getTitle());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v1.getTitle());// Check for original title
    }

    @Test
    @DisplayName("Should not write ID3v1 Artist with characters = MAX+1")
    void shouldNotWriteInvalidArtistMaxCharactersPlusOne() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v1.getArtist());// Check for original Artist

        // Check that exception is thrown
        ID3v1 finalId3v = id3v1;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setArtist(ID3v1Globals.TEST_ARTIST_ROBUST_MAX));

        // Refresh and read ID3v1 tag to check that the Artist hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v1.getArtist());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v1.getArtist());// Check for original Artist
    }

    @Test
    @DisplayName("Should not write ID3v1 Album with characters = MAX+1")
    void shouldNotWriteInvalidAlbumMaxCharactersPlusOne() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v1.getAlbum());// Check for original Album

        // Check that exception is thrown
        ID3v1 finalId3v = id3v1;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setAlbum(ID3v1Globals.TEST_ALBUM_ROBUST_MAX));

        // Refresh and read ID3v1 tag to check that the Album hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v1.getAlbum());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v1.getAlbum());// Check for original Album
    }

    @Test
    @DisplayName("Should not write ID3v1 Comment with characters = MAX+1")
    void shouldNotWriteInvalidCommentMaxCharactersPlusOne() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v1.getComment());// Check for original Comment

        // Check that exception is thrown
        ID3v1 finalId3v = id3v1;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setComment(ID3v1Globals.TEST_COMMENT_ROBUST_MAX));

        // Refresh and read ID3v1 tag to check that the Comment hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v1.getComment());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v1.getComment());// Check for original Comment
    }

    @Test
    @DisplayName("Should not write ID3v1 Year with value = MAX+1")
    void shouldNotWriteInvalidYearMaxValuePlusOne() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());// Check for original Year

        // Check that exception is thrown
        ID3v1 finalId3v = id3v1;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setYear(ID3v1Globals.TEST_YEAR_ROBUST_MAX));

        // Refresh and read ID3v1 tag to check that the Comment hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Should not write ID3v1 Year with value = MIN-1")
    void shouldNotWriteInvalidYearMinValueMinusOne() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());// Check for original Year

        // Check that exception is thrown
        ID3v1 finalId3v = id3v1;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setYear(ID3v1Globals.TEST_YEAR_ROBUST_MIN));

        // Refresh and read ID3v1 tag to check that the Comment hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Should not write ID3v1 Genre with index = MAX+1")
    void shouldNotWriteInvalidGenreIndexMaxPlusOne() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());// Check for original Genre Index

        // Check that exception is thrown
        ID3v1 finalId3v = id3v1;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_ROBUST_MAX));

        // Refresh and read ID3v1 tag to check that the Genre Index hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());// Check for original Genre Index
    }

    @Test
    @DisplayName("Should not write ID3v1 Genre with index = MIN-1")
    void shouldNotWriteInvalidGenreIndexMinMinusOne() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());// Check for original Genre Index

        // Check that exception is thrown
        ID3v1 finalId3v = id3v1;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_ROBUST_MIN));

        // Refresh and read ID3v1 tag to check that the Genre Index hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());// Check for original Genre Index
    }
}
