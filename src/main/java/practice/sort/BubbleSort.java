package practice.sort;

public class BubbleSort {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (j + 1 >= array.length - i) {
                    break;
                }

                int current = array[j];
                int next = array[j + 1];
                if (current > next) {
                    array[j] = next;
                    array[j + 1] = current;
                }
            }
        }

        return array;
    }

}
