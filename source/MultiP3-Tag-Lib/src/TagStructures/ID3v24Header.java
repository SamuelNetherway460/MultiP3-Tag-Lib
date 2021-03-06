package TagStructures;

import TagTypes.ID3v24;
import Utilities.ByteUtilities;

/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v24Header extends ID3v2Header {
    public final int MAJOR_VERSION = 4;
    public final int MINOR_VERSION = 0;

    public ID3v24Header(ID3v24 id3v24) {
        super();
        raw = ByteUtilities.getID3v24Header(id3v24);
    }

    /**
     * Generates a formatted string containing all header data.
     *
     * @return A formatted string containing all header data.
     */
    public String toString() {
        String string = "";
        return string;
    }
}
