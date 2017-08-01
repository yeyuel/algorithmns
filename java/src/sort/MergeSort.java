package sort;

/**
 * Merge Sort Implementation
 */
public class MergeSort {

    public static void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    /**
     *
     * @param array
     * @param start
     * @param end
     */
    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int center = (start + end) / 2;
            mergeSort(array, start, center);
            mergeSort(array, center + 1, end);
            merge(array, start, center, end);
        }
    }

    /**
     * Merge left part and right part
     * @param array
     * @param start
     * @param center
     * @param end
     */
    public static void merge(int[] array, int start, int center, int end) {
        int[] tmpArray = new int[array.length];

        // pointer to right part
        int right = center + 1;

        // increment pointer to left part
        int left = start;

        // pointer to tmp array
        int tmp = start;

        while (start <= center && right <= end) {
            if (array[start] >= array[right]) {
                tmpArray[left++] = array[start++];
            } else {
                tmpArray[left++] = array[right++];
            }
        }

        // copy remaining elements
        // following loop would only execute either
        while (right<=end) {
            tmpArray[left++] = array[right++];
        }

        while (start<=center) {
            tmpArray[left++] = array[start++];
        }

        while (tmp <= end) {
            array[tmp] = tmpArray[tmp++];
        }
    }
}
