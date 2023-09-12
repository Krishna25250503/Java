// //Large element come to the end of array by swapping with adjacent elements

import java.util.Arrays;

public class BubbleSort {
    public static void bubblesort(int arr[]){
    for(int turn=0;turn<arr.length;turn++){
        for (int j=0;j<arr.length;j++){
            if(arr[j]> arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
        }
    }
}
public static void printarr(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr);
        printarr(arr);
        // System.out.println(arr);
    }
}