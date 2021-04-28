package Factories;

/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v2FrameFactory {

    protected static final int ID_START = 0;

    /**
     * Extracts all supported frames from the ID3v2 tag.
     *
     * @param header The ID3v2 tag header.
     * @param framesData The frames data as an array of bytes.
     * @return An arraylist of ID3v2 frames populated with data.
     */
    /*
    public static ArrayList<ID3v2Frame> extractFrames(ID3v2Header header, byte[] framesData) {
        ArrayList<ID3v2Frame> frames = new ArrayList<>();

        int startPosition = 0;
        while (startPosition < header.getDataSize()) {
            ID3v2Frame frame;
            try {
                frame = extractFrame(Arrays.copyOfRange(framesData, startPosition, framesData.length));
            } catch (InvalidFrameException ife) {
                break;
            }
            frames.add(frame);
            startPosition += frame.getFrameSize();
        }

        return frames;
    }
     */



    /**
     * Determines whether a particular frame ID is valid.
     *
     * @param id The string frame id being checked for validity.
     * @return A boolean value indicating the validity of the frame id.
     */
    public static boolean isFrameIDValid(String id) {
        for (int i = 0; i < id.length(); i++) {
            if (!((id.charAt(i) >= '0' && id.charAt(i) <= '9') || (id.charAt(i) >= 'A' && id.charAt(i) <= 'Z'))) return false;
        }
        return true;
    }
}
