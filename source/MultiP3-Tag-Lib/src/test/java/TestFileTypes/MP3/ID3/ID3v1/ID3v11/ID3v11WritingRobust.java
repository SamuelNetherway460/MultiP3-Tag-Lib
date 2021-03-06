package TestFileTypes.MP3.ID3.ID3v1.ID3v11;

import Exceptions.GenreOutOfBoundsException;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v1.ID3v11Globals;
import Globals.MP3.ID3.ID3v1.ID3v1Globals;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v11WritingRobust {

    @Test
    @DisplayName("Should not write ID3v1.1 Title with characters = MAX+1")
    void shouldNotWriteInvalidTitleMaxCharactersPlusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original title

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setTitle(ID3v1Globals.TEST_TITLE_ROBUST_MAX));

        // Refresh and read ID3v1.1 tag to check that title hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original title
    }

    @Test
    @DisplayName("Should not write ID3v1.1 Artist with characters = MAX+1")
    void shouldNotWriteInvalidArtistMaxCharactersPlusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());// Check for original Artist

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setArtist(ID3v1Globals.TEST_ARTIST_ROBUST_MAX));

        // Refresh and read ID3v1.1 tag to check that the Artist hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());// Check for original Artist
    }

    @Test
    @DisplayName("Should not write ID3v1.1 Album with characters = MAX+1")
    void shouldNotWriteInvalidAlbumMaxCharactersPlusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());// Check for original Album

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setAlbum(ID3v1Globals.TEST_ALBUM_ROBUST_MAX));

        // Refresh and read ID3v1.1 tag to check that the Album hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());// Check for original Album
    }

    @Test
    @DisplayName("Should not write ID3v1.1 Year with value = MAX+1")
    void shouldNotWriteInvalidYearMaxValuePlusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setYear(ID3v1Globals.TEST_YEAR_ROBUST_MAX));

        // Refresh and read ID3v1.1 tag to check that the Comment hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Should not write ID3v1.1 Year with value = MIN-1")
    void shouldNotWriteInvalidYearMinValueMinusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setYear(ID3v1Globals.TEST_YEAR_ROBUST_MIN));

        // Refresh and read ID3v1.1 tag to check that the Comment hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Should not write ID3v1.1 Genre with index = MAX+1")
    void shouldNotWriteInvalidGenreIndexMaxPlusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(GenreOutOfBoundsException.class,
            () -> finalId3v.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_ROBUST_MAX));

        // Refresh and read ID3v1.1 tag to check that the Genre Index hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index
    }

    @Test
    @DisplayName("Should not write ID3v1.1 Genre with index = MIN-1")
    void shouldNotWriteInvalidGenreIndexMinMinusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(GenreOutOfBoundsException.class,
            () -> finalId3v.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_ROBUST_MIN));

        // Refresh and read ID3v1.1 tag to check that the Genre Index hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index
    }

    @Test
    @DisplayName("Should not write ID3v1.1 Comment with characters = MAX+1")
    void shouldNotWriteInvalidCommentMaxCharactersPlusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());// Check for original Comment

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setComment(ID3v11Globals.TEST_COMMENT_ROBUST_MAX));

        // Refresh and read ID3v1.1 tag to check that the Comment hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());// Check for original Comment
    }

    @Test
    @DisplayName("Should not write ID3v1.1 track number with value = MAX-1")
    void shouldNotWriteInvalidTrackNumberMinusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setTrackNumber(ID3v11Globals.TEST_TRACK_NUMBER_ROBUST_MIN));

        // Refresh and read ID3v1.1 tag to check that the Track Number hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number
    }

    @Test
    @DisplayName("Should not write ID3v1.1 track number with value = MAX+1")
    void shouldNotWriteInvalidTrackNumberPlusOne() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number

        // Check that exception is thrown
        ID3v11 finalId3v = id3v11;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> finalId3v.setTrackNumber(ID3v11Globals.TEST_TRACK_NUMBER_ROBUST_MAX));

        // Refresh and read ID3v1.1 tag to check that the Track Number hasn't changed
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number
    }
}
