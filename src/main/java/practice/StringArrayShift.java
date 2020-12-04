package practice;

public class StringArrayShift {

    static String shiftOneToLeft(String value) {
        char[] chars = value.toCharArray();
        char firstChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            chars[i - 1] = chars[i];
        }
        chars[chars.length - 1] = firstChar;
        return String.valueOf(chars);
    }

    public static String shiftOneToRight(String value) {
        char[] chars = value.toCharArray();
        char lastChar = chars[chars.length - 1];
        for (int i = chars.length - 1; i >= 1; i--) {
            chars[i] = chars[i - 1];
        }
        chars[0] = lastChar;
        return String.valueOf(chars);
    }

    public static String reverse(String value, int from, int to) {
        char[] chars = value.toCharArray();
        while (from < to) {
            char temp = chars[from];
            chars[from++] = chars[to];
            chars[to--] = temp;
        }

        return String.valueOf(chars);
    }

    public static String dynamicToLeft(String value, int number) {
        int valueLength = value.length() - 1;
        value = reverse(value, 0, number - 1);
        value = reverse(value, number, valueLength);
        value = reverse(value, 0, valueLength);
        return value;
    }
}
