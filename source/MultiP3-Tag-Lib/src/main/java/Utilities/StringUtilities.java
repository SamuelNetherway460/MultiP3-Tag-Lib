package Utilities;

//TODO - JavaDoc
/**
 *
 *
 * @author Samuel Netherway
 */
public class StringUtilities {

    private static char paddingChar = '\00';

    //TODO - Inspect
    //TODO - JavaDoc
    public static String removePadding(String s) {
        int pos = s.length() - 1;
        // If string only contains padding
        if (s.charAt(0) < 32) return "";
        // If string contains a value
        while (s.charAt(pos) < 32) {
            pos--;
        }
        // Trim if field isn't full
        if (pos != s.length() - 1) s = trimStringRight(s, pos + 1);
        return s;
    }

    public static String addPadding(String s, int maxLength) {
        if (s.length() >= maxLength) return s;
        StringBuilder stringBuffer = new StringBuilder(s);
        while (stringBuffer.length() < maxLength) {
            stringBuffer.append(paddingChar);
        }
        return stringBuffer.toString();
    }

    //TODO - JavaDoc
    public static String trimStringRight(String s, int length) {
        return s.substring(0, length);
    }

    //TODO - JavaDoc
    public static String trimStringLeft(String s, int length) {
        return s.substring(s.length() - length);
    }
}