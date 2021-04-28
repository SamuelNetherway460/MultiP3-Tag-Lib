package TestFileTypes.MP3.ID3;

import FileTypes.MP3;
import Globals.MP3.ID3.ID3v1.ID3v1Globals;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v11;
import TagTypes.ID3v24;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class MultipleTagTesting {

    @Test
    @DisplayName("Write ID3v11 and ID3v24")
    void writeID3v11AndID3v24() throws FileNotFoundException {
        MP3 mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, true);
        ID3v11 id3v11 = new ID3v11();
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        Assertions.assertEquals(MP3Globals.SAMPLE_MP3_TITLE, id3v11.getTitle());// Check for original Title

        // Set and save the new title
        id3v11.setTitle(ID3v1Globals.TEST_TITLE_NOM);

        ID3v24 id3v24 = null;
        if (mp3.hasID3v24()) id3v24 = mp3.getId3v24();
        id3v24.setTitle(ID3v1Globals.TEST_TITLE_NOM);


        mp3.saveID3v11();
        mp3.saveID3v24();;

        mp3 = new MP3(MP3Globals.SAMPLE_MP3_FILE_PATH, true);
        id3v11 = new ID3v11();
        id3v24 = null;
        if (mp3.hasID3v11()) id3v11 = mp3.getId3v11();
        if (mp3.hasID3v24()) id3v24 = mp3.getId3v24();
        Assertions.assertEquals(ID3v1Globals.TEST_TITLE_NOM, id3v11.getTitle());// Check for original Title
        Assertions.assertEquals(ID3v1Globals.TEST_TITLE_NOM, id3v24.getTitle());// Check for original Title
    }

}
