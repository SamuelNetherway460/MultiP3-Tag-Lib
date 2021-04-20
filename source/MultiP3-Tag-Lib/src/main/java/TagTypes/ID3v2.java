package TagTypes;

import TagStructures.ID3v2Frame;
import TagStructures.ID3v2Header;

import java.util.Map;

public class ID3v2 {

    protected ID3v2Header header;
    private Map<String, ID3v2Frame> frames;
    private byte[] bytes;
    private byte[] frameBytes;

    public ID3v2Header getHeader() {
        return header;
    }

    public void setHeader(ID3v2Header header) {
        this.header = header;
    }

    public Map<String, ID3v2Frame> getFrames() {
        return frames;
    }

    public void setFrames(Map<String, ID3v2Frame> frames) {
        this.frames = frames;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public byte[] getFrameBytes() {
        return frameBytes;
    }

    public void setFrameBytes(byte[] frameBytes) {
        this.frameBytes = frameBytes;
    }

    public int getMajorVersion() {
        return header.getMajorVersion();
    }

    public int getMinorVersion() {
        return header.getMinorVersion();
    }
}
