package TestFileTypes.MP3.ID3.ID3v1.ID3v11;

import Exceptions.GenreOutOfBoundsException;
import Exceptions.TrackNumberOutOfBoundsException;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v1.ID3v11Globals;
import Globals.MP3.ID3.ID3v1.ID3v1Globals;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v11WritingBoundary {

    @Test
    @DisplayName("Write ID3v1.1 Title MIN")
    void writeTitleMin() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original Title

        // Set and save the new title
        id3v11.setTitle(ID3v1Globals.TEST_TITLE_MIN);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_TITLE_MIN, id3v11.getTitle());// Check for test Title

        // Reset to original title
        id3v11.setTitle(MP3Globals.SAMPLE_MP3_TITLE);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original Title
    }

    @Test
    @DisplayName("Write ID3v1.1 Title MAX")
    void writeTitleMax() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original Title

        // Set and save the new title
        id3v11.setTitle(ID3v1Globals.TEST_TITLE_MAX);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_TITLE_MAX, id3v11.getTitle());// Check for test Title

        // Reset to original title
        id3v11.setTitle(MP3Globals.SAMPLE_MP3_TITLE);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original Title
    }

    @Test
    @DisplayName("Write ID3v1.1 Artist MIN")
    void writeArtistMin() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());// Check for original Artist

        // Set and save the new title
        id3v11.setArtist(ID3v1Globals.TEST_ARTIST_MIN);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_ARTIST_MIN, id3v11.getArtist());// Check for test Artist

        // Reset to original title
        id3v11.setArtist(MP3Globals.SAMPLE_MP3_ARTIST);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());// Check for original Artist
    }

    @Test
    @DisplayName("Write ID3v1.1 Artist MAX")
    void writeArtistMax() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());// Check for original Artist

        // Set and save the new title
        id3v11.setArtist(ID3v1Globals.TEST_ARTIST_MAX);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_ARTIST_MAX, id3v11.getArtist());// Check for test Artist

        // Reset to original title
        id3v11.setArtist(MP3Globals.SAMPLE_MP3_ARTIST);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());// Check for original Artist
    }

    @Test
    @DisplayName("Write ID3v1.1 Album MIN")
    void writeAlbumMin() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());// Check for original Album

        // Set and save the new title
        id3v11.setAlbum(ID3v1Globals.TEST_ALBUM_MIN);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_ALBUM_MIN, id3v11.getAlbum());// Check for test Album

        // Reset to original title
        id3v11.setAlbum(MP3Globals.SAMPLE_MP3_ALBUM);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());// Check for original Album
    }

    @Test
    @DisplayName("Write ID3v1.1 Album MAX")
    void writeAlbumMax() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());// Check for original Album

        // Set and save the new title
        id3v11.setAlbum(ID3v1Globals.TEST_ALBUM_MAX);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_ALBUM_MAX, id3v11.getAlbum());// Check for test Album

        // Reset to original title
        id3v11.setAlbum(MP3Globals.SAMPLE_MP3_ALBUM);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());// Check for original Album
    }

    @Test
    @DisplayName("Write ID3v1.1 Year MIN")
    void writeYearMin() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year

        // Set and save the new title
        id3v11.setYear(ID3v1Globals.TEST_YEAR_MIN);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_YEAR_MIN, id3v11.getYear());// Check for test Year

        // Reset to original title
        id3v11.setYear(MP3Globals.SAMPLE_MP3_YEAR);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Write ID3v1.1 Year MAX")
    void writeYearMax() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year

        // Set and save the new title
        id3v11.setYear(ID3v1Globals.TEST_YEAR_MAX);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_YEAR_MAX, id3v11.getYear());// Check for test Year

        // Reset to original title
        id3v11.setYear(MP3Globals.SAMPLE_MP3_YEAR);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Write ID3v1.1 Comment MIN")
    void writeCommentMin() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());// Check for original Comment

        // Set and save the new Comment
        id3v11.setComment(ID3v11Globals.TEST_COMMENT_MIN);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test Comment
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v11Globals.TEST_COMMENT_MIN, id3v11.getComment());// Check for test Comment

        // Reset to original Comment
        id3v11.setComment(MP3Globals.SAMPLE_MP3_COMMENT);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());// Check for original Comment
    }

    @Test
    @DisplayName("Write ID3v1.1 Comment MAX")
    void writeCommentMax() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());// Check for original Comment

        // Set and save the new Comment
        id3v11.setComment(ID3v11Globals.TEST_COMMENT_MAX);
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test Comment
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v11Globals.TEST_COMMENT_MAX, id3v11.getComment());// Check for test Comment

        // Reset to original Comment
        id3v11.setComment(MP3Globals.SAMPLE_MP3_COMMENT);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());// Check for original Comment
    }

    @Test
    @DisplayName("Write ID3v1.1 Track Number MIN")
    void writeTrackNumberMin() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number

        // Set and save the new Track Number
        try {
            id3v11.setTrackNumber(ID3v11Globals.TEST_TRACK_NUMBER_MIN);
        } catch (TrackNumberOutOfBoundsException tnoobe) {
            tnoobe.printStackTrace();
        }
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test Track Number
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v11Globals.TEST_TRACK_NUMBER_MIN, id3v11.getTrackNumber());// Check for test Track Number

        // Reset to original Track Number
        try {
            id3v11.setTrackNumber(MP3Globals.SAMPLE_MP3_TRACK_NUMBER);
        } catch (TrackNumberOutOfBoundsException tnoobe) {
            tnoobe.printStackTrace();
        }
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number
    }

    @Test
    @DisplayName("Write ID3v1.1 Track Number MAX")
    void writeTrackNumberMax() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number

        // Set and save the new Track Number
        try {
            id3v11.setTrackNumber(ID3v11Globals.TEST_TRACK_NUMBER_MAX);
        } catch (TrackNumberOutOfBoundsException tnoobe) {
            tnoobe.printStackTrace();
        }
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test Track Number
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v11Globals.TEST_TRACK_NUMBER_MAX, id3v11.getTrackNumber());// Check for test Track Number

        // Reset to original Track Number
        try {
            id3v11.setTrackNumber(MP3Globals.SAMPLE_MP3_TRACK_NUMBER);
        } catch (TrackNumberOutOfBoundsException tnoobe) {
            tnoobe.printStackTrace();
        }
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number
    }

    @Test
    @DisplayName("Write ID3v1.1 Genre Index MIN")
    void writeGenreIndexMin() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index

        // Set and save the new title
        try {
            id3v11.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_MIN);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_GENRE_INDEX_MIN, id3v11.getGenreIndex());// Check for test Genre Index

        // Reset to original title
        try {
            id3v11.setGenreIndex(MP3Globals.SAMPLE_MP3_GENRE_INDEX);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index
    }

    @Test
    @DisplayName("Write ID3v1.1 Genre Index MAX")
    void writeGenreIndexMax() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index

        // Set and save the new title
        try {
            id3v11.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_MAX);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v11();

        // Refresh and read ID3v1.1 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_GENRE_INDEX_MAX, id3v11.getGenreIndex());// Check for test Genre Index

        // Reset to original title
        try {
            id3v11.setGenreIndex(MP3Globals.SAMPLE_MP3_GENRE_INDEX);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index
    }
}
