package TestFileTypes.WAV.ID3v2.ID3v22;

import Factories.ID3v22Factory;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v2.ID3v22Globals;
import TagTypes.ID3v22;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v22Reading {

    @Test
    @DisplayName("Read ID3v2.2 BPM Frame")
    void readID3v22BPM() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_BPM, id3v22.getBpm());
    }

    @Test
    @DisplayName("Read ID3v2.2 Lead Performers Soloists Frame")
    void readID3v22LeadPerformersSoloists() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_LEAD_PERFORMERS_SOLOISTS, id3v22.getLeadPerformerSoloists());
    }

    @Test
    @DisplayName("Read ID3v2.2 Album Movie Show Title Frame")
    void readID3v22AlbumMovieShowTitle() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_ALBUM_MOVIE_SHOW_TITLE, id3v22.getAlbum());
    }

    @Test
    @DisplayName("Read ID3v2.2 Composer Frame")
    void readID3v22Composer() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_COMPOSER, id3v22.getComposer());
    }

    @Test
    @DisplayName("Read ID3v2.2 Encoded By Frame")
    void readID3v22EncodedBy() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_ENCODED_BY, id3v22.getEncodedBy());
    }

    @Test
    @DisplayName("Read ID3v2.2 Track number Position In Set Frame")
    void readID3v22TrackNumberPositionInSet() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_TRACK_NUMBER_POSITION_IN_SET, id3v22.getTrackNumberPositionInSet());
    }

    @Test
    @DisplayName("Read ID3v2.2 Part Of Set Frame")
    void readID3v22PartOfSet() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_PART_OF_SET, id3v22.getPartOfSet());
    }

    @Test
    @DisplayName("Read ID3v2.2 Content Type Frame")
    void readID3v22ContentType() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_CONTENT_TYPE, id3v22.getContentType());
    }

    @Test
    @DisplayName("Read ID3v2.2 Year Frame")
    void readID3v22Year() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_YEAR, id3v22.getYear());
    }

    @Test
    @DisplayName("Read ID3v2.2 Title Frame")
    void readID3v22Title() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_TITLE, id3v22.getTitle());
    }

    @Test
    @DisplayName("Read ID3v2.2 Language Frame")
    void readID3v22Language() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_LANGUAGE, id3v22.getLanguage());
    }

    @Test
    @DisplayName("Read ID3v2.2 Size Frame")
    void readID3v22Size() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_SIZE, id3v22.getSize());
    }

    @Test
    @DisplayName("Read ID3v2.2 Media Type Frame")
    void readID3v22MediaType() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_MEDIA_TYPE, id3v22.getMediaType());
    }

    @Test
    @DisplayName("Read ID3v2.2 File Type Frame")
    void readID3v22FileType() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_FILE_TYPE, id3v22.getFileType());
    }
}
