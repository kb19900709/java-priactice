package practice;

// TODO advance feature: how to convert string to double without library in Java
public class ParseNumber {

    /**
     * ASCII
     * -    45
     * 0    48
     * 1    49
     * 2    50
     * 3    51
     * 4    52
     * 5    53
     * 6    54
     * 7    55
     * 8    56
     * 9    57
     */
    public static int convert(String intStr) {
        if (intStr == null || intStr.length() == 0) {
            throwNumberFormatException(intStr);
        }

        int radix = 10;

        boolean sign = true;
        int result = 0;
        int index = 0;
        int multipleLimit = Integer.MAX_VALUE / radix;
        int strLength = intStr.length();

        char firstChar = intStr.charAt(0);
        if (firstChar < '0') {
            if (firstChar == '-') {
                if (strLength == 1) {
                    throwNumberFormatException(intStr);
                }
                sign = false;
                index++;
            } else {
                throwNumberFormatException(intStr);
            }
        }

        while (index < strLength) {
            int digit = Character.digit(intStr.charAt(index++), radix);

            if (digit < 0) {
                throwNumberFormatException(intStr);
            }

            if (result > multipleLimit) {
                throwNumberFormatException(intStr);
            }

            result *= radix;

            if (result > Integer.MAX_VALUE - digit) {
                throwNumberFormatException(intStr);
            }

            result += digit;
        }


        return sign ? result : -result;
    }

    private static void throwNumberFormatException(String intStr) {
        throw new NumberFormatException(String.format("unrecognized value, %s", intStr));
    }
}
