package TestFileTypes.MP3.ID3.ID3v2.ID3v24;

import Factories.ID3v24Factory;
import Factories.ID3v24FrameFactory;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v2.ID3v2Globals;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v24;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v24WritingNormal {

    @Test
    @DisplayName("Write ID3v2.4 BPM Frame")
    void writeID3v24BPMFrame() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_BPM, id3v24.getBpm());

        mp3.setId3v24(id3v24);
        id3v24.setBpm(74);
        mp3.saveID3v24();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(74, id3v24.getBpm());

        mp3.setId3v24(id3v24);
        id3v24.setBpm(ID3v2Globals.SAMPLE_MP3_BPM);
        mp3.saveID3v24();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_BPM, id3v24.getBpm());
    }

    @Test
    @DisplayName("Write ID3v2.4 Initial Key Frame")
    void writeID3v24InitialKeyFrame() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_INITIAL_KEY, id3v24.getInitialKey());

        mp3.setId3v24(id3v24);
        id3v24.setInitialKey("1m");
        mp3.saveID3v24();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals("1m", id3v24.getInitialKey());

        mp3.setId3v24(id3v24);
        id3v24.setInitialKey(ID3v2Globals.SAMPLE_MP3_INITIAL_KEY);
        mp3.saveID3v24();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_INITIAL_KEY, id3v24.getInitialKey());
    }

    @Test
    @DisplayName("Write ID3v2.4 Language Frame From New")
    void writeID3v24LanguageFrameFromNew() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(null, id3v24.getLanguage());

        mp3.setId3v24(id3v24);
        id3v24.setLanguage(ID3v2Globals.SAMPLE_MP3_LANGUAGE);
        mp3.saveID3v24();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_LANGUAGE, id3v24.getLanguage());

        id3v24.deleteFrame(ID3v24FrameFactory.LANGUAGE);
        mp3.setId3v24(id3v24);
        mp3.saveID3v24();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(null, id3v24.getLanguage());
    }

    @Test
    @DisplayName("Delete ID3v2.4 Initial Key Frame")
    void deleteInitialKeyFrame() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_INITIAL_KEY, id3v24.getInitialKey());

        id3v24.deleteFrame(ID3v24FrameFactory.INITIAL_KEY);
        mp3.setId3v24(id3v24);
        mp3.saveID3v24();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(null, id3v24.getInitialKey());

        mp3.setId3v24(id3v24);
        id3v24.setInitialKey(ID3v2Globals.SAMPLE_MP3_INITIAL_KEY);
        mp3.saveID3v24();

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);
        id3v24 = ID3v24Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v2Globals.SAMPLE_MP3_INITIAL_KEY, id3v24.getInitialKey());
    }
}
