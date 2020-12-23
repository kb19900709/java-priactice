package practice.sort;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SortTest {

    @Test
    public void bubbleSortTest(){
        int[] array = {3, 38, 44, 5, 47, 15, 36, 26, 27, 2};

        assertThat(BubbleSort.sort(array)).containsExactly(2, 3, 5, 15, 26, 27, 36, 38, 44, 47);
    }

    @Test
    public void selectionSortTest(){
        int[] array = {3, 38, 44, 5, 47, 15, 36, 26, 27, 2};

        assertThat(SelectionSort.sort(array)).containsExactly(2, 3, 5, 15, 26, 27, 36, 38, 44, 47);
    }


}
