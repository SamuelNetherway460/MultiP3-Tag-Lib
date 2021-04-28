package TestFileTypes.MP3.ID3.ID3v2.ID3v23;

import Factories.ID3v23Factory;
import Factories.ID3v23FrameFactory;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v2.ID3v23Globals;
import TagTypes.ID3v23;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v23WritingNormal {

    @Test
    @DisplayName("Write ID3v2.3 BPM Frame")
    void writeID3v23BPMFrame() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_BPM, id3v23.getBpm());

        mp3.setId3v23(id3v23);
        id3v23.setBpm(74);
        mp3.saveID3v23();

        mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(74, id3v23.getBpm());

        mp3.setId3v23(id3v23);
        id3v23.setBpm(ID3v23Globals.SAMPLE_ID3V23_BPM);
        mp3.saveID3v23();

        mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_BPM, id3v23.getBpm());
    }

    @Test
    @DisplayName("Write ID3v2.3 Initial Key Frame")
    void writeID3v23InitialKeyFrame() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_INITIAL_KEY, id3v23.getInitialKey());

        mp3.setId3v23(id3v23);
        id3v23.setInitialKey("2m");
        mp3.saveID3v23();

        mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals("2m", id3v23.getInitialKey());

        mp3.setId3v23(id3v23);
        id3v23.setInitialKey(ID3v23Globals.SAMPLE_ID3V23_INITIAL_KEY);
        mp3.saveID3v23();

        mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_INITIAL_KEY, id3v23.getInitialKey());
    }

    @Test
    @DisplayName("Delete ID3v2.3 Initial Key Frame")
    void deleteInitialKeyFrame() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_INITIAL_KEY, id3v23.getInitialKey());

        id3v23.deleteFrame(ID3v23FrameFactory.INITIAL_KEY);
        mp3.setId3v23(id3v23);
        mp3.saveID3v23();

        mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(null, id3v23.getInitialKey());

        mp3.setId3v23(id3v23);
        id3v23.setInitialKey(ID3v23Globals.SAMPLE_ID3V23_INITIAL_KEY);
        mp3.saveID3v23();

        mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_INITIAL_KEY, id3v23.getInitialKey());
    }

    @Test
    @DisplayName("Write ID3v2.3 Language Frame")
    void writeID3v23NewLanguageFrame() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_LANGUAGE, id3v23.getLanguage());

        mp3.setId3v23(id3v23);
        id3v23.setLanguage(ID3v23Globals.SAMPLE_ID3V23_LANGUAGE_NEW);
        mp3.saveID3v23();

        mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_LANGUAGE_NEW, id3v23.getLanguage());

        mp3.setId3v23(id3v23);
        id3v23.deleteFrame(ID3v23FrameFactory.LANGUAGE);
        mp3.saveID3v23();

        mp3 = new MP3(ID3v23Globals.SAMPLE_ID3V23_FILE_PATH, false);
        id3v23 = ID3v23Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v23Globals.SAMPLE_ID3V23_LANGUAGE, id3v23.getLanguage());
    }
}
