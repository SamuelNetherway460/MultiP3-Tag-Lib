import FileTypes.MP3;
import Utilities.ByteUtilities;

import java.nio.charset.StandardCharsets;

//TODO - Add a lot of front end user validation to prevent incorrect data being written to the tags
//TODO - Null checks in every tag class
//TODO - JavaDoc
public class Test {

    private final static String TEST_MUSIC_DIRECTORY = "/Users/samuelnetherway/Temp/TestMusic/mp3/";

    public static void main(String[] args) {

        String path = TEST_MUSIC_DIRECTORY + "04 Bring It On.mp3";
        MP3 mp3 = new MP3(path, false);
        byte[] id3v24Bytes = ByteUtilities.getID3v24Bytes(mp3);

        for (int i = 0; i < id3v24Bytes.length; i++) {
            System.out.print(new String(id3v24Bytes, i, 1, StandardCharsets.ISO_8859_1));
        }
    }
}

/*
        ID3v1 id3v1 = mp3.getId3v1();

        System.out.println(id3v1 + "\n");

        // Alter artist
        id3v1.setArtist("Testing");
        mp3.saveID3v1();

        // New
        mp3.initTags();
        id3v1 = mp3.getId3v1();
        System.out.println(id3v1);
*/

/*
        String rawString = "";
        try {
            byte[] bytes = ByteUtilities.all(mp3);
            rawString = BufferUtilities.convertBytesToString(bytes, 10, 70, "ISO-8859-1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n\n" + rawString);
 */