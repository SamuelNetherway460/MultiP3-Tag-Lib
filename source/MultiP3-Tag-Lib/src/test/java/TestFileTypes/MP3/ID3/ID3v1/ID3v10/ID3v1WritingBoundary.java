package TestFileTypes.MP3.ID3.ID3v1.ID3v10;

import Exceptions.GenreOutOfBoundsException;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v1.ID3v1Globals;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ID3v1WritingBoundary {

    @Test
    @DisplayName("Write ID3v1 Title MIN")
    void writeTitleMin() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v1.getTitle());// Check for original Title

        // Set and save the new title
        id3v1.setTitle(ID3v1Globals.TEST_TITLE_MIN);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_TITLE_MIN, id3v1.getTitle());// Check for test Title

        // Reset to original title
        id3v1.setTitle(MP3Globals.SAMPLE_MP3_TITLE);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v1.getTitle());// Check for original Title
    }

    @Test
    @DisplayName("Write ID3v1 Title MAX")
    void writeTitleMax() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v1.getTitle());// Check for original Title

        // Set and save the new title
        id3v1.setTitle(ID3v1Globals.TEST_TITLE_MAX);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_TITLE_MAX, id3v1.getTitle());// Check for test Title

        // Reset to original title
        id3v1.setTitle(MP3Globals.SAMPLE_MP3_TITLE);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v1.getTitle());// Check for original Title
    }

    @Test
    @DisplayName("Write ID3v1 Artist MIN")
    void writeArtistMin() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v1.getArtist());// Check for original Artist

        // Set and save the new title
        id3v1.setArtist(ID3v1Globals.TEST_ARTIST_MIN);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_ARTIST_MIN, id3v1.getArtist());// Check for test Artist

        // Reset to original title
        id3v1.setArtist(MP3Globals.SAMPLE_MP3_ARTIST);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v1.getArtist());// Check for original Artist
    }

    @Test
    @DisplayName("Write ID3v1 Artist MAX")
    void writeArtistMax() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v1.getArtist());// Check for original Artist

        // Set and save the new title
        id3v1.setArtist(ID3v1Globals.TEST_ARTIST_MAX);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_ARTIST_MAX, id3v1.getArtist());// Check for test Artist

        // Reset to original title
        id3v1.setArtist(MP3Globals.SAMPLE_MP3_ARTIST);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v1.getArtist());// Check for original Artist
    }

    @Test
    @DisplayName("Write ID3v1 Album MIN")
    void writeAlbumMin() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v1.getAlbum());// Check for original Album

        // Set and save the new title
        id3v1.setAlbum(ID3v1Globals.TEST_ALBUM_MIN);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_ALBUM_MIN, id3v1.getAlbum());// Check for test Album

        // Reset to original title
        id3v1.setAlbum(MP3Globals.SAMPLE_MP3_ALBUM);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v1.getAlbum());// Check for original Album
    }

    @Test
    @DisplayName("Write ID3v1 Album MAX")
    void writeAlbumMax() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v1.getAlbum());// Check for original Album

        // Set and save the new title
        id3v1.setAlbum(ID3v1Globals.TEST_ALBUM_MAX);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_ALBUM_MAX, id3v1.getAlbum());// Check for test Album

        // Reset to original title
        id3v1.setAlbum(MP3Globals.SAMPLE_MP3_ALBUM);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v1.getAlbum());// Check for original Album
    }

    @Test
    @DisplayName("Write ID3v1 Comment MIN")
    void writeCommentMin() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v1.getComment());// Check for original Comment

        // Set and save the new title
        id3v1.setComment(ID3v1Globals.TEST_COMMENT_MIN);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_COMMENT_MIN, id3v1.getComment());// Check for test Comment

        // Reset to original title
        id3v1.setComment(MP3Globals.SAMPLE_MP3_COMMENT);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v1.getComment());// Check for original Comment
    }

    @Test
    @DisplayName("Write ID3v1 Comment MAX")
    void writeCommentMax() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v1.getComment());// Check for original Comment

        // Set and save the new title
        id3v1.setComment(ID3v1Globals.TEST_COMMENT_MAX);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_COMMENT_MAX, id3v1.getComment());// Check for test Comment

        // Reset to original title
        id3v1.setComment(MP3Globals.SAMPLE_MP3_COMMENT);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v1.getComment());// Check for original Comment
    }

    @Test
    @DisplayName("Write ID3v1 Year MIN")
    void writeYearMin() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());// Check for original Year

        // Set and save the new title
        id3v1.setYear(ID3v1Globals.TEST_YEAR_MIN);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_YEAR_MIN, id3v1.getYear());// Check for test Year

        // Reset to original title
        id3v1.setYear(MP3Globals.SAMPLE_MP3_YEAR);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Write ID3v1 Year MAX")
    void writeYearMax() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());// Check for original Year

        // Set and save the new title
        id3v1.setYear(ID3v1Globals.TEST_YEAR_MAX);
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_YEAR_MAX, id3v1.getYear());// Check for test Year

        // Reset to original title
        id3v1.setYear(MP3Globals.SAMPLE_MP3_YEAR);
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Write ID3v1 Genre Index MIN")
    void writeGenreIndexMin() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());// Check for original Genre Index

        // Set and save the new title
        try {
            id3v1.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_MIN);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_GENRE_INDEX_MIN, id3v1.getGenreIndex());// Check for test Genre Index

        // Reset to original title
        try {
            id3v1.setGenreIndex(MP3Globals.SAMPLE_MP3_GENRE_INDEX);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());// Check for original Genre Index
    }

    @Test
    @DisplayName("Write ID3v1 Genre Index MAX")
    void writeGenreIndexMax() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());// Check for original Genre Index

        // Set and save the new title
        try {
            id3v1.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_MAX);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v1();

        // Refresh and read ID3v1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(ID3v1Globals.TEST_GENRE_INDEX_MAX, id3v1.getGenreIndex());// Check for test Genre Index

        // Reset to original title
        try {
            id3v1.setGenreIndex(MP3Globals.SAMPLE_MP3_GENRE_INDEX);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v1();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());// Check for original Genre Index
    }
}
