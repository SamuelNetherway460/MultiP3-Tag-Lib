package TestFileTypes.MP3.ID3.ID3v1.ID3v10;

import FileTypes.MP3;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ID3v1Reading {

    @Test
    @DisplayName("Read ID3v1 Title")
    void readTitle() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v1.getTitle());
    }

    @Test
    @DisplayName("Read ID3v1 Artist")
    void readArtist() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v1.getArtist());
    }

    @Test
    @DisplayName("Read ID3v1 Album")
    void readAlbum() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v1.getAlbum());
    }

    @Test
    @DisplayName("Read ID3v1 Year")
    void readYear() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v1.getYear());
    }

    @Test
    @DisplayName("Read ID3v1 Comment")
    void readComment() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v1.getComment());
    }

    @Test
    @DisplayName("Read ID3v1 Genre")
    void readGenre() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE, id3v1.getGenre());
    }

    @Test
    @DisplayName("Read ID3v1 Genre Index")
    void readGenreIndex() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v1 id3v1 = new ID3v1();
        if (mp3.hasID3v1()) id3v1 = mp3.getId3v1();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v1.getGenreIndex());
    }
}
