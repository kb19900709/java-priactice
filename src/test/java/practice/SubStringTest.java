package practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SubStringTest {
    @Test
    public void isSubArrayTrueTest() {
        String[] longArray = {"A", "B", "C", "D"};
        String[] shortArray = {"B", "A", "D"};

        assertThat(SubString.isSubArray(longArray, shortArray)).isTrue();
    }

    @Test
    public void isSubArrayFalseTest() {
        String[] longArray = {"A", "B", "C", "D"};
        String[] shortArray = {"B", "C", "E"};

        assertThat(SubString.isSubArray(longArray, shortArray)).isFalse();
    }
}
