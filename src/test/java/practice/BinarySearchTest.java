package practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void binarySearchTest() {
        int[] intArray = {1, 3, 5, 7, 9, 11};
        int targetInt = 11;
        int result = BinarySearch.binary(intArray, targetInt);

        assertThat(result).isEqualTo(5);
    }
}
