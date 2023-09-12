// Pick an element (from unsorted part) & place in the right position in sorted part

public class Insertionsort {
    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
        // System.out.println();
    }
    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 2, 4, 1 };
        insertionsort(arr);
        printarr(arr);
        // System.out.println(arr);
    }

}
