import java.util.Arrays;

public class Inbuiltsort {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 5, 2, 3, 6, 1, 4 };
        Arrays.sort(arr);
        printarr(arr);
        // System.out.println(arr);
    }
}
