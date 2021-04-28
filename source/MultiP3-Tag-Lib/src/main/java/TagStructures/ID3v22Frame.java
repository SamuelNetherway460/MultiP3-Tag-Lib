package TagStructures;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static Utilities.BufferUtilities.packSynchsafeInteger;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class ID3v22Frame extends ID3v2Frame {

    private static final int FRAME_HEADER_SIZE = 6;

    public ID3v22Frame() {

    }

    //TODO: Create new blank frame using id and other relevant parameters
    public ID3v22Frame(String id, byte[] frameData) {
        this.id = id;
        this.frameData = frameData;
        this.dataSize = frameData.length;
        this.frameSize = frameData.length + FRAME_HEADER_SIZE;
        this.frameHeader = constructDefaultHeaderBytes(id, frameData.length);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(frameHeader);
            outputStream.write(frameData);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        this.frame = outputStream.toByteArray();
    }

    public byte[] constructDefaultHeaderBytes(String id, int dataSize) {
        byte[] byteID = id.getBytes(StandardCharsets.ISO_8859_1);
        byte[] size = packSynchsafeInteger(dataSize);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(byteID);
            outputStream.write(size);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return outputStream.toByteArray();
    }
}
