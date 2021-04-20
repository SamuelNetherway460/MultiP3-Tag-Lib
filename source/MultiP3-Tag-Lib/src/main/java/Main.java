import Exceptions.HeaderNotFoundException;
import Factories.ID3v2HeaderFactory;
import FileTypes.MP3;
import TagStructures.ID3v2Header;

public class Main {
    public static void main(String [] args) {
        MP3 mp3 = new MP3("/Users/samuelnetherway/Temp/TestMusic/mp3/Andy C - Back & Forth (Original Mix).mp3", false);

        ID3v2Header id3v2Header = null;
        try {
            id3v2Header = ID3v2HeaderFactory.extractHeader(mp3);
        } catch (HeaderNotFoundException hnfe) {
            hnfe.printStackTrace();
        }
    }
}
