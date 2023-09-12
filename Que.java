//   Count how many times lower case vowel so ccurred in a String entered by the user...???


// import java.util.*;
// public class Que {
//     public static void mian(String[] args){
//         String sc = new Scanner(System.in).next();
//         int count = 0;
//         for(int i=0;i<sc.length();i++){
//             char ch = sc.charAt(i);
//             if(ch=='a'|| ch=='e'|| ch =='i'|| ch=='0'|| ch =='u'){
//                 count++;
//             }

//         }
//         System.out.println("The number of voveles "+ count);
//     }

//     }


// Que2
//   Determine if 2 Strings areanagramsof each other


// import java.util.Arrays;

// public class Que {
//     public static void main(String[] args) {
//         String str1 = "earth";
//         String str2 = "heart";

//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();

//         if (str1.length() == str2.length());
//         char[] str1charArray = str1.toCharArray();
//         char[] str2charArray = str2.toCharArray();

//         Arrays.sort(str1charArray);
//         Arrays.sort(str2charArray);

//         boolean result = Arrays.equals(str1charArray, str2charArray);
//         if (result) {
//             System.out.println(str1 + "and" + str2 + "Its anagramas");
//         } else {
//             System.out.println(str1 + "and" + str2 + "Its not anagramas");
//         }
//     }
// }