package TagStructures;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v2Frame {

    protected String id;
    protected int frameSize;
    protected int frameHeaderSize;
    protected int dataSize;
    protected byte[] frame;
    protected byte[] frameHeader;
    protected byte[] frameData;

    public ID3v2Frame() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public int getFrameHeaderSize() {
        return frameHeaderSize;
    }

    public void setFrameHeaderSize(int frameHeaderSize) {
        this.frameHeaderSize = frameHeaderSize;
    }

    public int getDataSize() {
        return dataSize;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }

    public byte[] getFrame() {
        return frame;
    }

    public void setFrame(byte[] frame) {
        this.frame = frame;
    }

    public byte[] getFrameHeader() {
        return frameHeader;
    }

    public void setFrameHeader(byte[] frameHeader) {
        this.frameHeader = frameHeader;
    }

    public byte[] getFrameData() {
        return frameData;
    }

    public void setFrameData(byte[] frameData) {
        this.frameData = frameData;
    }
}