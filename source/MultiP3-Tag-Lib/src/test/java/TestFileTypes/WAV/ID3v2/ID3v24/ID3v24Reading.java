package TestFileTypes.WAV.ID3v2.ID3v24;

import Factories.ID3v23Factory;
import Factories.ID3v24Factory;
import FileTypes.WAV;
import Globals.WAV.ID3v2.WavID3v23Globals;
import TagTypes.ID3v23;
import TagTypes.ID3v24;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v24Reading {

    //TODO: Identify why not working. Tag header can be found but does not have correct structure.
    @Test
    @DisplayName("Read ID3v2.4 Title Frame")
    void readID3v23Title() throws FileNotFoundException {
        WAV wav = new WAV(WavID3v23Globals.WAV_SAMPLE_ID3V23_FILE_PATH, false);
        ID3v24 id3v24 = ID3v24Factory.extractTag(wav);
        Assertions.assertEquals(WavID3v23Globals.SAMPLE_ID3V23_TITLE, id3v24.getTitle());
    }

}
