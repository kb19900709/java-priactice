package practice;

public class BinarySearch {
    public static int binary(int[] intArray, int target) {
        int low = 0;
        int high = intArray.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int currentValue = intArray[mid];
            if (currentValue < target) {
                low = mid + 1;
            } else if (currentValue > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
