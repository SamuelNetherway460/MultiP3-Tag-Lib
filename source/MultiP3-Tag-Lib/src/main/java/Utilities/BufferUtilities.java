package Utilities;

import java.io.UnsupportedEncodingException;

/**
 * Class originally sourced from mp3agic. Unnecesarry methods removed.
 * https://github.com/mpatric/mp3agic
 *
 * TODO: Possibly remove unnecesarry methods and reimplement for self
 */
public final class BufferUtilities {

	private BufferUtilities() {}

	//TODO - JavaDoc
	// Constructs a new String by decoding the specified subarray of bytes using the specified charset.
	public static String convertBytesToString(byte[] bytes, int start, int length, String charsetName) throws UnsupportedEncodingException {
		if (length < 1) return "";
		String s = new String(bytes, start, length, charsetName);
		return new String(bytes, start, length, charsetName);
	}

	public static int convertByteToInt(byte b) throws UnsupportedEncodingException {
		Byte by = b;
		return by.intValue();
	}

	public static boolean checkBit(byte b, int bitPosition) {
		return ((b & (0x01 << bitPosition)) != 0);
	}

	public static byte setBit(byte b, int bitPosition, boolean value) {
		byte newByte;
		if (value) {
			newByte = (byte) (b | ((byte) 0x01 << bitPosition));
		} else {
			newByte = (byte) (b & (~((byte) 0x01 << bitPosition)));
		}
		return newByte;
	}

	public static int shiftByte(byte c, int places) {
		int i = c & 0xff;
		if (places < 0) {
			return i << -places;
		} else if (places > 0) {
			return i >> places;
		}
		return i;
	}

	public static int unpackInteger(byte b1, byte b2, byte b3, byte b4) {
		int value = b4 & 0xff;
		value += BufferUtilities.shiftByte(b3, -8);
		value += BufferUtilities.shiftByte(b2, -16);
		value += BufferUtilities.shiftByte(b1, -24);
		return value;
	}

	public static byte[] packInteger(int i) {
		byte[] bytes = new byte[4];
		bytes[3] = (byte) (i & 0xff);
		bytes[2] = (byte) ((i >> 8) & 0xff);
		bytes[1] = (byte) ((i >> 16) & 0xff);
		bytes[0] = (byte) ((i >> 24) & 0xff);
		return bytes;
	}

	public static int unpackSynchsafeInteger(byte b1, byte b2, byte b3, byte b4) {
		int value = ((byte) (b4 & 0x7f));
		value += shiftByte((byte) (b3 & 0x7f), -7);
		value += shiftByte((byte) (b2 & 0x7f), -14);
		value += shiftByte((byte) (b1 & 0x7f), -21);
		return value;
	}

	public static byte[] packSynchsafeInteger(int i) {
		byte[] bytes = new byte[4];
		packSynchsafeInteger(i, bytes, 0);
		return bytes;
	}

	public static void packSynchsafeInteger(int i, byte[] bytes, int offset) {
		bytes[offset + 3] = (byte) (i & 0x7f);
		bytes[offset + 2] = (byte) ((i >> 7) & 0x7f);
		bytes[offset + 1] = (byte) ((i >> 14) & 0x7f);
		bytes[offset + 0] = (byte) ((i >> 21) & 0x7f);
	}
}
