package TestFileTypes.MP3.ID3.ID3v2.ID3v22;

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
    @DisplayName("Read ID3v2.2 Title Frame")
    void readID3v22Title() throws FileNotFoundException {
        MP3 mp3 = new MP3(ID3v22Globals.SAMPLE_ID3V22_FILE_PATH, false);
        ID3v22 id3v22 = ID3v22Factory.extractTag(mp3);
        Assertions.assertEquals(ID3v22Globals.SAMPLE_ID3V22_TITLE, id3v22.getTitle());
    }
}
