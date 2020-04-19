package mergesort;

public class MergeSort {
    public static void sort(int array[]) {
        if (array.length > 1) {
            int halfSize = array.length / 2;

            int[] leftArray = new int[halfSize];
            int[] rightArray = new int[array.length - halfSize];

            System.arraycopy(array, 0, leftArray, 0, halfSize);
            System.arraycopy(array, halfSize, rightArray, 0, array.length - halfSize);

            sort(leftArray);
            sort(rightArray);
        }
    }

    public static void merge(int[] outputArray, int[] leftSubArray, int[] rightSubArray) {
    }
}
