package Utilities;

import java.io.UnsupportedEncodingException;

//TODO - JavaDoc
public class BufferUtilities {

    //TODO - JavaDoc
    // Constructs a new String by decoding the specified subarray of bytes using the specified charset.
    public static String convertBytesToString(byte[] bytes, int start, int length, String charsetName) throws UnsupportedEncodingException {
        if (length < 1) return "";
        return new String(bytes, start, length, charsetName);
    }

    //TODO - JavaDoc
    public static int unpackInteger(byte b1, byte b2, byte b3, byte b4) {
        int value = b4 & 0xff;
        value += BufferUtilities.shiftByte(b3, -8);
        value += BufferUtilities.shiftByte(b2, -16);
        value += BufferUtilities.shiftByte(b1, -24);
        return value;
    }

    //TODO - JavaDoc
    public static int shiftByte(byte c, int places) {
        int i = c & 0xff;
        if (places < 0) {
            return i << -places;
        } else if (places > 0) {
            return i >> places;
        }
        return i;
    }
}