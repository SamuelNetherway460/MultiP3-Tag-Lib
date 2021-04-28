package TestFileTypes.MP3.ID3.ID3v2.ID3v23;

import Factories.ID3v23Factory;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v2.ID3v23Globals;
import TagTypes.ID3v23;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v23Reading {

    @Test
    @DisplayName("Read ID3v2.3 BPM Frame")
    void readID3v23BPM() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_BPM, id3v23.getBpm());
    }

    @Test
    @DisplayName("Read ID3v2.3 Initial Key Frame")
    void readID3v23InitialKey() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_INITIAL_KEY, id3v23.getInitialKey());
    }

    @Test
    @DisplayName("Read ID3v2.3 Date Frame")
    void readID3v23Date() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_DATE, id3v23.getDate());
    }

    @Test
    @DisplayName("Read ID3v2.3 Encoded By Frame")
    void readID3v23EncodedBy() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_ENCODED_BY, id3v23.getEncodedBy());
    }

    @Test
    @DisplayName("Read ID3v2.3 International Standard Recoding Code Frame")
    void readID3v23InternationalStandardRecordingCode() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_INTERNATIONAL_STANDARD_RECORDING_CODE, id3v23.getInternationalStandardRecordingCode());
    }

    @Test
    @DisplayName("Read ID3v2.3 Publisher Frame")
    void readID3v23Publisher() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_PUBLISHER, id3v23.getPublisher());
    }

    @Test
    @DisplayName("Read ID3v2.3 Original Release Year Frame")
    void readID3v23OriginalReleaseYear() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_ORIGINAL_RELEASE_YEAR, id3v23.getOriginalReleaseYear());
    }

    @Test
    @DisplayName("Read ID3v2.3 File Type Frame")
    void readID3v23OriginalFileType() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_FILE_TYPE, id3v23.getFileType());
    }

    @Test
    @DisplayName("Read ID3v2.3 Content Type Frame")
    void readID3v23ContentType() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_CONTENT_TYPE, id3v23.getContentType());
    }

    @Test
    @DisplayName("Read ID3v2.3 Release Time Frame")
    void readID3v23ReleaseTime() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_RELEASE_TIME, id3v23.getTime());
    }

    @Test
    @DisplayName("Read ID3v2.3 Lead Performer Soloists Frame")
    void readID3v23LeadPerformerSoloists() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_LEAD_PERFORMER_SOLOISTS, id3v23.getLeadPerformerSoloists());
    }

    @Test
    @DisplayName("Read ID3v2.3 Track Number Position In Set Frame")
    void readID3v23TrackNumberPositionInSet() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_TRACK_NUMBER, id3v23.getTrackNumberPositionInSet());
    }

    @Test
    @DisplayName("Read ID3v2.3 Language Frame")
    void readID3v23Language() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_LANGUAGE, id3v23.getLanguage());
    }

    @Test
    @DisplayName("Read ID3v2.3 Band Orchestra Accompaniment Frame")
    void readID3v23BandOrchestraAccompaniment() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_BAND_ORCHESTRA_ACCOMPANIMENT, id3v23.getBandOrchestraAccompaniment());
    }

    @Test
    @DisplayName("Read ID3v2.3 Title Frame")
    void readID3v23Title() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_TITLE, id3v23.getTitle());
    }
}
