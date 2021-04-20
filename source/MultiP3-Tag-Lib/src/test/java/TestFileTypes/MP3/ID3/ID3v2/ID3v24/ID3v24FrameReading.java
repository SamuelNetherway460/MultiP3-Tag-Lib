package TestFileTypes.MP3.ID3.ID3v2.ID3v24;

import Exceptions.HeaderNotFoundException;
import Factories.ID3v24Factory;
import Factories.ID3v2Factory;
import Factories.ID3v2FrameFactory;
import Factories.ID3v2HeaderFactory;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v2.ID3v2HeaderGlobals;
import Globals.MP3.MP3Globals;
import TagStructures.ID3v2Header;
import TagTypes.ID3v2;
import TagTypes.ID3v24;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ID3v24FrameReading {

    @Test
    @DisplayName("Read ID3v2 Frames")
    void readID3v2Frames() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);

        ID3v24 tag = ID3v24Factory.extractTag(mp3);

        ID3v2FrameFactory.extractFrames(tag.getHeader(), tag.getFrameBytes());
    }
}
