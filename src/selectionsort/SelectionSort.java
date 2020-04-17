/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 02/04/20
 *   Time: 3:36 AM
 */

package selectionsort;

public class SelectionSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int posMin = i;
            for (int next = i + 1; next < array.length; next++) {
                if (array[next] < array[posMin]) {
                    posMin = next;
                }
            }
        }
    }

    private void swap(int[] array, int fill, int posMin) {
        int temp = array[fill];
    }
}
