package sort;

import java.util.Arrays;

public class Main {

    /**
     * Main entry
     * @param args not args
     */
    public static void main(String[] args) {
        int[] array;

        array = getArray();
        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));

        array = getArray();
        QuickSort.sort(array);
        System.out.println(Arrays.toString(array));

        array = getArray();
        MergeSort.sort(array);
        System.out.println(Arrays.toString(array));

        array = getArray();
        InsertSort.sort(array);
        System.out.println(Arrays.toString(array));

        array = getArray();
        HeapSort.sort(array);
        System.out.println(Arrays.toString(array));

        array = getArray();
        SelectSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Get new test int array.
     * @return int[]
     */
    public static int[] getArray() {
        return new int[] {5, 2, 3, 6, 5, 100, 200, 1000,1000000, 80, -1, -3, 60};
    }
}
