package quicksort;

public class QuickSort {
    public static void sort(int array[], int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int pivot = partition(array, leftIndex, rightIndex);
            sort(array, leftIndex, pivot - 1);
            sort(array, pivot + 1, rightIndex);
        }
    }

    private static int partition(int array[], int leftIndex, int rightIndex) {
        int pivot = array[rightIndex];

        int partitionIndex = leftIndex;
        for (int i = leftIndex; i < rightIndex; i++) {
            if (array[i] <= pivot) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, partitionIndex, rightIndex);
        return partitionIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
