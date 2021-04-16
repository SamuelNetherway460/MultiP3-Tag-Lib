package TagStructures;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v2Frame {

    private String id;
    private int size = 0;
    private byte[] data;
    private boolean preserveTag = false;
    private boolean preserveFile = false;
    private boolean readOnly = false;
    private boolean group = false;
    private boolean compression = false;
    private boolean encryption = false;
    private boolean unsynchronisation = false;
    private boolean sizeIndicator = false;
}
