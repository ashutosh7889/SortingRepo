/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 31/03/20
 *   Time: 10:41 AM
 */

package bubblesort;

import java.util.Scanner;

public class BubbleSort {
    final static Scanner sc = new Scanner(System.in);

    /**
     * This method sorts an integer array using The Bubble Sort Technique
     *
     * @param array the array to be sorted
     */
    public void sort(int[] array) {
        System.out.println("Enter choice:\n 1. For sorting by DESCENDING ORDER.\n 2.For sorting by ASCENDING ORDER");
        int choiceForSorting = sc.nextInt();
        sc.nextLine();
        System.out.println(choiceForSorting == 1 ? "DESCENDING ORDER SORT" : "ASCENDING ORDER SORT");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (choiceForSorting == 1) {
                    sortDescending(array, j);
                } else {
                    sortAscending(array, j);
                }
            }
        }
    }

    /**
     * This is a sortDescending method.
     * This method sorting the element of the array in descending order.
     *
     * @param array This is array of integer type
     * @param j     This is index of element which we have to check that smaller or bigger.
     */
    private void sortDescending(int[] array, int j) {
        if (array[j] < array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }

    /**
     * This is a sortAscending method.
     * This method sorting the element of the array in ascending order.
     *
     * @param array This is array of integer type.
     * @param j     This is index of element which we have to check that smaller or bigger.
     */
    private void sortAscending(int[] array, int j) {
        if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
