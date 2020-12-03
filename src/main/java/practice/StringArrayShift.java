package practice;

import java.util.Arrays;

public class StringArrayShift {
    public static void main(String[] args) {
        String targetString = "abcdef";
        System.out.println("original string: " + targetString);
        System.out.println("shiftOneToLeft : " + StringArrayShift.shiftOneToLeft(targetString));
        System.out.println("shiftOneToRight: " + StringArrayShift.shiftOneToRight(targetString));
        System.out.println("reverse        : " + StringArrayShift.reverse(targetString, 0, targetString.length() - 1));
        System.out.println("dynamicToLeft  : " + StringArrayShift.dynamicToLeft(targetString, 2));

        int[] targetArray1 = {1, 2, 3, 4, 5, 6};
        int[] targetArray1Answer = putTargetAtTheFirstIndexAndReverse(targetArray1, 4);
        System.out.println(Arrays.toString(targetArray1Answer));

        int[] targetArray2 = {1, 2, 3, 4, 5, 6};
        int[] targetArray2Answer = putTargetAtTheFirstIndexAndReverse(targetArray2, 2);
        System.out.println(Arrays.toString(targetArray2Answer));
    }

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

    public static void reverse(int[] value, int from, int to) {
        while (from < to) {
            int temp = value[from];
            value[from++] = value[to];
            value[to--] = temp;
        }
    }

    public static String dynamicToLeft(String value, int number) {
        int valueLength = value.length() - 1;
        value = reverse(value, 0, number - 1);
        value = reverse(value, number, valueLength);
        value = reverse(value, 0, valueLength);
        return value;
    }

    public static void dynamicToLeft(int[] value, int number) {
        int valueLength = value.length - 1;
        reverse(value, 0, number - 1);
        reverse(value, number, valueLength);
        reverse(value, 0, valueLength);
    }

    /**
     * 1->2->3->4->5->6, target=4 => 4->3->2->1->6->5
     * 1->2->3->4->5->6, target=3 => 3->2->1->6->5->4
     */
    public static int[] putTargetAtTheFirstIndexAndReverse(int[] intArray, int target) {
        // step1 reverse
        reverse(intArray, 0, intArray.length - 1);

        // step2 find target's index in the given array. assume the target is able to be found in the array.
        int low = 0;
        int upper = intArray.length - 1;
        int targetIndex = -1;
        while (low <= upper) {
            int mid = (low + upper) >>> 1;
            int currentValue = intArray[mid];
            if (target < currentValue) {
                low = mid + 1;
            } else if (target > currentValue) {
                upper = mid - 1;
            } else {
                targetIndex = mid;
                break;
            }
        }

        // step3 shift
        dynamicToLeft(intArray, targetIndex);

        return intArray;
    }
}
