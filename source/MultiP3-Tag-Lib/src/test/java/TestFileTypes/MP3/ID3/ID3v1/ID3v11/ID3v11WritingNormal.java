package TestFileTypes.MP3.ID3.ID3v1.ID3v11;

import Exceptions.GenreOutOfBoundsException;
import Exceptions.TrackNumberOutOfBoundsException;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v1.ID3v1Globals;
import Globals.MP3.MP3Globals;
import Globals.MP3.ID3.ID3v1.ID3v11Globals;
import TagTypes.ID3v11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ID3v11WritingNormal {

    @Test
    @DisplayName("Write ID3v1.1 Title NOM")
    void writeTitleNormal() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original Title

        // Set and save the new title
        id3v11.setTitle(ID3v1Globals.TEST_TITLE_NOM);
        mp3.saveID3v11();

        // Refresh and read ID3v11 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_TITLE_NOM, id3v11.getTitle());// Check for test Title

        // Reset to original title
        id3v11.setTitle(MP3Globals.SAMPLE_MP3_TITLE);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original Title
    }

    @Test
    @DisplayName("Write ID3v1.1 Artist NOM")
    void writeArtistNormal() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());// Check for original Artist

        // Set and save the new title
        id3v11.setArtist(ID3v1Globals.TEST_ARTIST_NOM);
        mp3.saveID3v11();

        // Refresh and read ID3v11 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_ARTIST_NOM, id3v11.getArtist());// Check for test Artist

        // Reset to original title
        id3v11.setArtist(MP3Globals.SAMPLE_MP3_ARTIST);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());// Check for original Artist
    }

    @Test
    @DisplayName("Write ID3v1.1 Album NOM")
    void writeAlbumNormal() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());// Check for original Album

        // Set and save the new title
        id3v11.setAlbum(ID3v1Globals.TEST_ALBUM_NOM);
        mp3.saveID3v11();

        // Refresh and read ID3v11 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_ALBUM_NOM, id3v11.getAlbum());// Check for test Album

        // Reset to original title
        id3v11.setAlbum(MP3Globals.SAMPLE_MP3_ALBUM);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());// Check for original Album
    }

    @Test
    @DisplayName("Write ID3v1.1 Year NOM")
    void writeYearNormal() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year

        // Set and save the new title
        id3v11.setYear(ID3v1Globals.TEST_YEAR_NOM);
        mp3.saveID3v11();

        // Refresh and read ID3v11 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_YEAR_NOM, id3v11.getYear());// Check for test Year

        // Reset to original title
        id3v11.setYear(MP3Globals.SAMPLE_MP3_YEAR);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());// Check for original Year
    }

    @Test
    @DisplayName("Write ID3v1.1 Genre Index NOM")
    void writeGenreIndexNormal() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());// Check for original Genre Index

        // Set and save the new title
        try {
            id3v11.setGenreIndex(ID3v1Globals.TEST_GENRE_INDEX_NOM);
        } catch (GenreOutOfBoundsException goobe) {
            goobe.printStackTrace();
        }
        mp3.saveID3v11();

        // Refresh and read ID3v11 tag for test title
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v1Globals.TEST_GENRE_INDEX_NOM, id3v11.getGenreIndex());// Check for test Genre Index

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
    @DisplayName("Write ID3v1.1 Comment NOM")
    void writeCommentNormal() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());// Check for original Comment

        // Set and save the new Comment
        id3v11.setComment(ID3v11Globals.TEST_COMMENT_NOM);
        mp3.saveID3v11();

        // Refresh and read ID3v11.1 tag for test Comment
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v11Globals.TEST_COMMENT_NOM, id3v11.getComment());// Check for test Comment

        // Reset to original Comment
        id3v11.setComment(MP3Globals.SAMPLE_MP3_COMMENT);
        mp3.saveID3v11();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());// Check for original Comment
    }

    @Test
    @DisplayName("Write ID3v1.1 Track Number NOM")
    void writeTrackNumberNormal() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());// Check for original Track Number

        // Set and save the new Track Number
        try {
            id3v11.setTrackNumber(ID3v11Globals.TEST_TRACK_NUMBER_NOM);
        } catch (TrackNumberOutOfBoundsException tnoobe) {
            tnoobe.printStackTrace();
        }
        mp3.saveID3v11();

        // Refresh and read ID3v11.1 tag for test Track Number
        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(ID3v11Globals.TEST_TRACK_NUMBER_NOM, id3v11.getTrackNumber());// Check for test Track Number

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
}
