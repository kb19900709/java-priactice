package practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ParseNumberTest {

    @Test
    public void convertTest(){
        String target = "12345";
        int convertValue = ParseNumber.convert(target);
        assertThat(convertValue).isEqualTo(12345);
    }
}
