package sort;

/**
 * Implementation of insert sort
 */
public class InsertSort {

    /**
     * sort method
     * @param array
     */
    public static void sort(int[] array) {
        int i, j;

        // treat first element as sorted
        for (i = 1; i < array.length; i++) {

            // target is the element to be inserted
            int target = array[i];

            for (j = i; j > 0 && target > array[j-1]; j--) {
                array[j] = array[j-1];
            }
            array[j] = target;
        }
    }
}
