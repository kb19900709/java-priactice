package practice.sort;

public class SelectionSort {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }

            }

            array[minIndex] = array[i];
            array[i] = minValue;
        }

        return array;
    }
}
