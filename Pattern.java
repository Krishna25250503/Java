// import java.util.*;
public class Pattern {
    public static void Hollow_Rectangle(int totalRow, int totalcol) {
        // OuterLoop
        for (int i = 1; i <= totalRow; i++) {
            // Inner loop
            for (int j = 1; j <= totalcol; j++) {
                if (i == 1 || i == totalRow || j == 1 || j == totalcol) {
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow_Rectangle(4, 5);

    }

}
