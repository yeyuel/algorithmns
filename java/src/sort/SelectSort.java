package sort;

/**
 * Implementation of select sort
 */
public class SelectSort {

    /**
     * Sort entry
     * @param array
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            if (max != i) {
                HeapSort.swap(array, i, max);
            }
        }
    }
}
