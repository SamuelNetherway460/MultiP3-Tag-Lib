import FileTypes.MP3;
import TagTypes.ID3v1;

//TODO - Add a lot of front end user validation to prevent incorrect data being written to the tags
//TODO - Null checks in every tag class
//TODO - JavaDoc
public class Main {

    private final static String TEST_MUSIC_DIRECTORY = "/Users/samuelnetherway/Temp/TestMusic/mp3/";

    public static void main(String[] args) {

        String path = TEST_MUSIC_DIRECTORY + "High Contrast - Days Go By (2019 Extended Mix).mp3";
        MP3 mp3 = new MP3(path, true);
        ID3v1 id3v1 = mp3.getId3v1();

        // Original
        System.out.println("Original Embedded Metadata: ");
        System.out.println(id3v1 + "\n");

        // Alter title
        id3v1.setTitle("New Title");
        mp3.saveID3v1();

        // New
        mp3.initTags();
        id3v1 = mp3.getId3v1();
        System.out.println("Altered Embedded Metadata: ");
        System.out.println(id3v1);
    }
}