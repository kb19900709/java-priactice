package practice;

public class Palindrome {

    public static void main(String[] args) {
        String target = "ABBA";
        System.out.println(isPalindrome(target));
    }

    private static boolean isPalindrome(String target) {
        if (target == null || target.length() == 0) {
            return false;
        }

        int length = target.length();
        int midPos = length >>> 1;
        int frontIndex = length % 2 != 1 ? midPos - 1 : midPos;
        int rearIndex = midPos;
        while (frontIndex >= 0) {
            if (target.charAt(frontIndex--) == target.charAt(rearIndex++)) {
                continue;
            }
            return false;
        }

        return true;
    }
}
