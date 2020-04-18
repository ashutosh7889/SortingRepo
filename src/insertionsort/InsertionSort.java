package insertionsort;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            insert(array, i);
        }
    }

    private static void insert(int[] array, int nextIndex) {
        int nextValue = array[nextIndex];
        while (nextIndex > 0 && nextValue < array[nextIndex - 1]) {
            array[nextIndex] = array[nextIndex - 1];
            nextIndex--;
        }
        array[nextIndex] = nextValue;
    }
}
