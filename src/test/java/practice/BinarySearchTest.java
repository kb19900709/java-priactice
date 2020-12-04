package practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void binarySearchOKTest() {
        int[] intArray = {1, 3, 5, 7, 9, 11};
        int targetInt = 11;
        int result = BinarySearch.binary(intArray, targetInt);

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void binarySearchOK2Test() {
        int[] intArray = {1, 3, 5, 7, 9, 11};
        int targetInt = 3;
        int result = BinarySearch.binary(intArray, targetInt);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void binarySearchFailedTest() {
        int[] intArray = {1, 3, 5, 7, 9, 11};
        int targetInt = 12;
        int result = BinarySearch.binary(intArray, targetInt);

        assertThat(result).isEqualTo(-1);
    }
}
