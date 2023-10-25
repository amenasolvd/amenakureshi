// Programme of Insertion Sorting.
// Programmer: Amena Kureshi
// date: Oct 25, 2023
import java.util.Arrays;
public class  Main {
    
    // Method to sort array by inserting element
    public static void sorting(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int k = array[j];
            int i = j-1;
            
            while ( i >=0 && array [i] > k  ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = k;
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr1));
            sorting(arr1);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr1));
    }
}
