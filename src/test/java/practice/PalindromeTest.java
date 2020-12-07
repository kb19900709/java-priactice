package practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void isPalindromeStrUncertifiedTest() {
        assertThat(Palindrome.isPalindrome("")).isFalse();
        assertThat(Palindrome.isPalindrome(null)).isFalse();
    }

    @Test
    public void isPalindromeEvenTest() {
        assertThat(Palindrome.isPalindrome("ABBA")).isTrue();
    }

    @Test
    public void isPalindromeOddTest() {
        assertThat(Palindrome.isPalindrome("ABCBA")).isTrue();
    }

    @Test
    public void isPalindromeFalseTest() {
        assertThat(Palindrome.isPalindrome("ABCBC")).isFalse();
    }
}
