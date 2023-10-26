// Programme of Insertion Sorting.
//Programmer: Amena Kureshi
//Date: Oct 26, 2023

import java.util.Arrays;
public class Main {

    // Method to sort array
    public static void sorting(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr1));
            sorting(arr1);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr1));
    }
}