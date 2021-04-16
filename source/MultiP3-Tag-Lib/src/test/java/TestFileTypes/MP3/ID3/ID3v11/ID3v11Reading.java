package TestFileTypes.MP3.ID3.ID3v11;

import FileTypes.MP3;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ID3v11Reading {

    @Test
    @DisplayName("Read ID3v1.1 Title")
    void readTitle() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());
    }

    @Test
    @DisplayName("Read ID3v11 Artist")
    void readArtist() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ARTIST, id3v11.getArtist());
    }

    @Test
    @DisplayName("Read ID3v1.1 Album")
    void readAlbum() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v11.getAlbum());
    }

    @Test
    @DisplayName("Read ID3v1.1 Year")
    void readYear() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_YEAR, id3v11.getYear());
    }

    @Test
    @DisplayName("Read ID3v1.1 Genre")
    void readGenre() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE, id3v11.getGenre());
    }

    @Test
    @DisplayName("Read ID3v1.1 Genre Index")
    void readGenreIndex() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_GENRE_INDEX, id3v11.getGenreIndex());
    }

    @Test
    @DisplayName("Read ID3v1.1 Comment")
    void readComment() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_COMMENT, id3v11.getComment());
    }

    @Test
    @DisplayName("Read ID3v1.1 Zero Byte")
    void readZeroByte() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ZERO_BYTE, id3v11.hasZeroByte());
    }

    @Test
    @DisplayName("Read ID3v1.1 Track Number")
    void readTrackNumber() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TRACK_NUMBER, id3v11.getTrackNumber());
    }
}
