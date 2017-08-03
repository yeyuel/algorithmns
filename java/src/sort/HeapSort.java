package sort;

/**
 * Implementation of heap sort
 */
public class HeapSort {

    /**
     * Sort entry
     * @param array
     */
    public static void sort(int[] array) {
        heapSort(array, false);
    }

    /**
     * Heap sort caller
     * @param array
     * @param reverse
     */
    public static void heapSort(int[] array, boolean reverse) {
        for (int i = 0; i < array.length; i++) {
            if (reverse) {
                createMaxHeap(array, array.length -1 - i);
            } else {
                createMinHeap(array, array.length - 1 - i);
            }
            swap(array, 0, array.length -1 - i);
        }
    }

    /**
     * Implementation for min heap creation
     * @param array
     * @param last
     */
    public static void createMinHeap(int[]array, int last) {
        for (int i = (last - 1) / 2; i >= 0; i--) {
            int k = i;

            // until to the last element
            while (2 * k + 1 <= last) {
                int smaller = 2 * k + 1;
                if (smaller < last) {
                    if (array[smaller] > array[smaller + 1]) {
                     smaller ++;
                    }
                }
                if (array[k] > array[smaller]) {
                    swap(array, k, smaller);
                    k = smaller;
                } else {
                    break;
                }
            }
        }
    }

    /**
     * Implementation for max heap creation
     * @param array
     * @param last
     */
    public static void createMaxHeap(int[] array, int last) {
        for (int i = (last - 1) / 2; i >= 0 ; i--) {
            int k = i;
            while (2 * k + 1 <= last) {
                int bigger = 2 * k + 1;
                if (bigger < last) {
                    if (array[bigger] < array[bigger + 1]) {
                        bigger ++;
                    }
                }
                if (array[k] < array[bigger]) {
                    swap(array, bigger, k);
                    k = bigger;
                } else {
                    break;
                }
            }
        }
    }

    /**
     * Swap without extra space
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            array[i] = array[i] + array[j];
            array[j] = array[i] - array[j];
            array[i] = array[i] - array[j];
        }
    }
}
