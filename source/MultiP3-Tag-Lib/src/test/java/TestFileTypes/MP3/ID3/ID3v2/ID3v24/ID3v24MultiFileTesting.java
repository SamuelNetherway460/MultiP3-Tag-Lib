package TestFileTypes.MP3.ID3.ID3v2.ID3v24;

import Factories.ID3v24Factory;
import FileTypes.MP3;
import Globals.MP3.ID3.ID3v2.ID3v2Globals;
import Globals.MP3.MP3Globals;
import TagTypes.ID3v24;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class ID3v24MultiFileTesting {

    @Test
    @DisplayName("Read ID3v2.4 Multiple Files")
    void readID3v24MultipleFiles() throws FileNotFoundException {
        MP3 mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C - Back & Forth (Original Mix).mp3", true);
        ID3v24 tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C - Till Dawn (Original Mix).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C - What Bass (Original Mix).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C, Fiora - Heartbeat Loud (Andy C VIP).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Bcee, S.P.Y - Is Anybody Out There? (Friction & K-Tee Remix).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/High Contrast - Days Go By (2019 Extended Mix).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/John Holt - Police In Helicopter - Benny L Remix (Dirty Extended).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Kanine - Sundown (Clean Extended).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Metrik - Gravity (Clean Extended).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Sub Focus & Culture Shock - Move Higher (Aweminus Bootleg) (Clean Radio Edit).mp3", true);
        tag = mp3.getId3v24();
        System.out.println(tag.getTitle());
        System.out.println(tag.getLeadPerformerSoloists());
        System.out.println(tag.getAlbum());
    }

    @Test
    @DisplayName("Write ID3v2.4 Multiple Files")
    void writeID3v24MultipleFiles() throws FileNotFoundException {
        MP3 mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C - Back & Forth (Original Mix).mp3", true);
        ID3v24 tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C - Till Dawn (Original Mix).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C - What Bass (Original Mix).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C, Fiora - Heartbeat Loud (Andy C VIP).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Bcee, S.P.Y - Is Anybody Out There? (Friction & K-Tee Remix).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/High Contrast - Days Go By (2019 Extended Mix).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/John Holt - Police In Helicopter - Benny L Remix (Dirty Extended).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Kanine - Sundown (Clean Extended).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Metrik - Gravity (Clean Extended).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();

        mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Sub Focus & Culture Shock - Move Higher (Aweminus Bootleg) (Clean Radio Edit).mp3", true);
        tag = mp3.getId3v24();
        tag.setTitle("TEST");
        mp3.saveID3v24();
    }

}
