package sort;

public class QuickSort {

    /**
     * Sort method
     * @param array
     */
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Quick sort method
     * @param array
     * @param begin
     * @param end
     */
    public static void quickSort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int middle = getMiddle(array, begin, end);
        quickSort(array, begin, middle - 1);
        quickSort(array, middle + 1, end);
    }

    /**
     * Get middle position of pivok (Partition method)
     * @param array
     * @param begin
     * @param end
     * @return middle position
     */
    public static int getMiddle(int[] array, int begin, int end) {
        int pivok = array[begin];
        while (begin < end) {
            while (begin < end && array[end] <= pivok) {
                end --;
            }
            array[begin] = array[end];
            while (begin < end && array[begin] >= pivok) {
                begin ++;
            }
            array[end] = array[begin];
        }
        array[begin] = pivok;
        return begin;
    }
}
