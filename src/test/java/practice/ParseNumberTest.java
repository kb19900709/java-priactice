package practice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;

public class ParseNumberTest {

    @Test
    public void convertTest() {
        String target = "12345";
        int convertValue = ParseNumber.convert(target);
        assertThat(convertValue).isEqualTo(12345);

        target = "-654321";
        convertValue = ParseNumber.convert(target);
        assertThat(convertValue).isEqualTo(-654321);
    }

    @Test
    public void convertFailedWhileInputIsZeroOrNullOrSingleSignTest() {
        assertThatThrownBy(() -> ParseNumber.convert(null))
                .isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> ParseNumber.convert(""))
                .isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> ParseNumber.convert("-"))
                .isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> ParseNumber.convert("$"))
                .isInstanceOf(NumberFormatException.class);
    }

    @Test
    public void convertFailedWithWrongCharTest() {
        assertThatThrownBy(() -> ParseNumber.convert("-$123"))
                .isInstanceOf(NumberFormatException.class);
    }

    @Test
    public void convertFailedOverLimitTest(){
        assertThatThrownBy(() -> ParseNumber.convert("2147483648"))
                .isInstanceOf(NumberFormatException.class);
    }
}
