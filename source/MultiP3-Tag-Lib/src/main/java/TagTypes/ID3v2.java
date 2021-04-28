package TagTypes;

import TagStructures.ID3v2Header;

//TODO: JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v2 {

    protected ID3v2Header header;
    protected byte[] tagBytes;
    protected byte[] frameBytes;

    public ID3v2Header getHeader() {
        return header;
    }

    public void setHeader(ID3v2Header header) {
        this.header = header;
    }

    public byte[] getTagBytes() {
        return tagBytes;
    }

    public void setTagBytes(byte[] tagBytes) {
        this.tagBytes = tagBytes;
    }

    public byte[] getFrameBytes() {
        return frameBytes;
    }

    public void setFrameBytes(byte[] frameBytes) {
        this.frameBytes = frameBytes;
    }
}
