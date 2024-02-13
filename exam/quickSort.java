/* File 	  : QuickSortDemo.java
 * Description: QuickSort
 * Author	  : Doney Siby
 * Version	  : 1.0
 * Date		  : 05/12/2023
 */

import java.util.Scanner;
public class quickSort {
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(String[] arr,int low, int high){
        String pivot = arr[low];
        int i = low;
        for(int j = low+1;j<=high;j++){
            if(arr[j].compareTo(pivot) < 0){
                i++;
                swap(arr,i,j);
            }

        }
        swap(arr,low,i);
        return i;
    }

    public static void QuickSort(String[] arr,int low,int high){
        if(low<high){
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi -1);
            QuickSort(arr,pi+1,high);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        sc.nextLine(); 

        String[] strings = new String[limit];
        System.out.println("Enter the strings:");
        for (int i = 0; i < limit; i++) {
            strings[i] = sc.nextLine();
        }

        QuickSort(strings, 0, limit - 1);

        System.out.print("Sorted strings : ");
        for (int i = 0; i < limit; i++) {
            System.out.print(strings[i]+"  ");
        }
    }
}