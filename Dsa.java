
// //Bubble sort
// import java.util.Arrays;

// public class Dsa {
//     // public static int bubblesort(int arr[]) {
//     //     for (int i = 0; i < arr.length; i++) {
//     //         for (int j = 0; j < arr.length; j++) {
//     //             if (arr[j] > arr[j + 1]) {
//     //                 // Swapping code
//     //                 int temp = arr[j];
//     //                 arr[j] = arr[j + 1];
//     //                 arr[j + 1] = i;

//                     // Arrays.sort(arr);
//                     // reverse(arr);
//     //             }
//     //         }
//     //     }
//     //     // return arr;   

//     // }

//     public static int selectionsort(int arr[]){

//     }

//         public static void printarr(int arr[]) {
//             for (int i = 0; i < arr.length; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//         }

//         public static void main(String args[]) {
//             int arr[] = { 1, 2, 6, 7, 4, 8, 9, 3 };
//             Arrays.sort(arr);
//             printarr(arr);
//         }

//     }

// import java.util.*;

// public class Dsa {
//     public static void selectinsort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             int minpos = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[minpos] < arr[j]) {
//                      minpos = j;
//                 }
//             }
            
//             // Swap
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i]=  temp;
//         }
//     }

//     public static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, 2, 4, 6, 7, 3, 5,8, 9 };
//         selectinsort(arr);
//         printarr(arr);
//     }
// }

