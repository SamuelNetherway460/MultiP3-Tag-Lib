package TestFileTypes.MP3.ID3.ID3v2.ID3v2Header;

import Exceptions.HeaderNotFoundException;
import Factories.ID3v2HeaderFactory;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v2.ID3v2HeaderGlobals;
import Globals.MP3.MP3Globals;
import TagStructures.ID3v2Header;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ID3v2HeaderReading {

    //TODO: Check version in header
    @Test
    @DisplayName("Read ID3v2 Header")
    void readID3v2Header() {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, false);

        ID3v2Header id3v2Header = null;
        try {
            id3v2Header = ID3v2HeaderFactory.extractHeader(mp3);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace();
        }

        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_MAJOR_VERSION, id3v2Header.getMajorVersion());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_MINOR_VERSION, id3v2Header.getMinorVersion());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_UNSYNCHRONISATION_FLAG, id3v2Header.hasUnsynchronisation());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_EXTENDED_HEADER_FLAG, id3v2Header.hasExtendedHeader());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_EXPERIMENTAL_FLAG, id3v2Header.hasExperimentalIndicator());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_FOOTER_FLAG, id3v2Header.hasFooter());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_UNASSIGNED_FLAG_1, id3v2Header.hasUnassignedFlag1());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_UNASSIGNED_FLAG_2, id3v2Header.hasUnassignedFlag2());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_UNASSIGNED_FLAG_3, id3v2Header.hasUnassignedFlag3());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_UNASSIGNED_FLAG_4, id3v2Header.hasUnassignedFlag4());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_TAG_SIZE, id3v2Header.getTagSize());
        Assertions.assertEquals(ID3v2HeaderGlobals.SAMPLE_MP3_DATA_SIZE, id3v2Header.getDataSize());
    }
}
