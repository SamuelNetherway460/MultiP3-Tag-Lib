package TestFileTypes.MP3.ID3.ID3v2.ID3v24;

import Factories.*;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v2.ID3v2Globals;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v24;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v24FrameReading {

    @Test
    @DisplayName("Read ID3v2.4 BPM Frame")
    void readID3v24BPM() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_BPM, id3v24.getBpm());
    }

    @Test
    @DisplayName("Read ID3v2.4 Initial Key Frame")
    void readID3v24InitialKey() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_INITIAL_KEY, id3v24.getInitialKey());
    }

    @Test
    @DisplayName("Read ID3v2.4 Title Frame")
    void readID3v24Title() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v24.getTitle());
    }

    @Test
    @DisplayName("Read ID3v2.4 Album Frame")
    void readID3v24Album() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_ALBUM, id3v24.getAlbum());
    }

    @Test
    @DisplayName("Read ID3v2.4 Date Frame")
    void readID3v24Date() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_DATE, id3v24.getDate());
    }

    @Test
    @DisplayName("Read ID3v2.4 Track Number Frame")
    void readID3v24TrackNumber() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_TRACK_NUMBER, id3v24.getTrackNumberPositionInSet());
    }

    @Test
    @DisplayName("Read ID3v2.4 Encoded By Frame")
    void readID3v24EncodedBy() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_ENCODED_BY, id3v24.getEncodedBy());
    }

    @Test
    @DisplayName("Read ID3v2.4 International Standard Recording Code Frame")
    void readID3v24InternationalStandardRecordingCode() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_INTERNATIONAL_STANDARD_RECORDING_CODE, id3v24.getInternationalStandardRecordingCode());
    }

    @Test
    @DisplayName("Read ID3v2.4 Publisher Frame")
    void readID3v24Publisher() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_PUBLISHER, id3v24.getPublisher());
    }

    @Test
    @DisplayName("Read ID3v2.4 Original Release Year Frame")
    void readID3v24OriginalReleaseYear() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_ORIGINAL_RELEASE_YEAR, id3v24.getOriginalReleaseYear());
    }

    @Test
    @DisplayName("Read ID3v2.4 File Type Frame")
    void readID3v24FileType() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_FILE_TYPE, id3v24.getFileType());
    }

    @Test
    @DisplayName("Read ID3v2.4 Content Type Frame")
    void readID3v24ContentType() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_CONTENT_TYPE, id3v24.getContentType());
    }

    @Test
    @DisplayName("Read ID3v2.4 Release Time Frame")
    void readID3v24ReleaseTime() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_RELEASE_TIME, id3v24.getReleaseTime());
    }

    @Test
    @DisplayName("Read ID3v2.4 Lead Performer Soloists Frame")
    void readID3v24LeadPerformerSoloists() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_LEAD_PERFORMER_SOLOISTS, id3v24.getLeadPerformerSoloists());
    }
}
