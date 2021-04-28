package TestFileTypes.WAV.ID3v2.ID3v23;

import Factories.ID3v23Factory;
import FileTypes.WAV;
import TagTypes.ID3v23;
import Globals.WAV.ID3v2.WavID3v23Globals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v23Reading {

    //TODO: Identify why not working. Tag header can be found but does not have correct structure.
    @Test
    @DisplayName("Read ID3v2.3 Title Frame")
    void readID3v23Title() throws FileNotFoundException {
        WAV wav = new WAV(WavID3v23Globals.WAV_SAMPLE_ID3V23_FILE_PATH, false);
        ID3v23 id3v23 = ID3v23Factory.extractTag(wav);
        Assertions.assertEquals(WavID3v23Globals.SAMPLE_ID3V23_TITLE, id3v23.getTitle());
    }

}
