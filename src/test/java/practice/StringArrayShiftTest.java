package practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringArrayShiftTest {

    private static final String targetStr = "ABCDE";

    @Test
    public void shiftOneToLeftTest() {
        assertThat(StringArrayShift.shiftOneToLeft(targetStr)).isEqualTo("BCDEA");
    }

    @Test
    public void shiftOneToRightTest() {
        assertThat(StringArrayShift.shiftOneToRight(targetStr)).isEqualTo("EABCD");
    }

    @Test
    public void reverseTest() {
        assertThat(StringArrayShift.reverse(targetStr, 0, targetStr.length() - 1))
                .isEqualTo(
                        new StringBuilder().append(targetStr).reverse().toString()
                );
    }

    @Test
    public void dynamicToLeftTest() {
        assertThat(StringArrayShift.dynamicToLeft(targetStr, 2)).isEqualTo("CDEAB");
    }
}
