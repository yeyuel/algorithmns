package sort;

/**
 * Implementation of shell sort
 */
public class ShellSort {

    /**
     * Sort entry
     * @param array
     */
    public static void sort(int[] array) {
        int j, temp;
        for (int increment = array.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < array.length; i++) {
                temp = array[i];
                for (j = i - increment; j >= 0; j-=increment) {
                    if (temp > array[j]) {
                        array[j + increment] = array[j];
                    } else {
                        break;
                    }
                }
                array[j + increment] = temp;
            }
        }
    }
}
