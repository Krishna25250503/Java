/*
 
import java.util.*;

public class functions {
    public static void printhelloworld() {
        System.out.println("Krishna");
        System.out.println("Krishna");
        System.out.println("Krishna");
    }

    public static int calculateSum(int  num1,int num2) {
        int sum = num1 + num2;
        return sum;
        
    }
    
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("Sum is:" + sum);
        
        // Swap Function

        // int a =5;
        // int b=10;
        // int temp = a;
        // a =b;
        // b= temp;
        // System.out.println("a=" +a);
        // System.out.println("b="+b);        

    }
}




import java.util.*;
public class functions{
public static int multiply(int a,int b){
    int product = a*b;
    return product;
}
public static void main(String args[]){
    int a = 3;
    int b=5;
    int prod = multiply (a,b);
    System.out.println("a*b="+ prod);
prod = multiply(10,20);
System.out.println("a * b="+ prod);
}
}

// Factorial of number n 
import java.util.*;
public class functions{
    public static int factorial(int n){
        int f =1;
        for (int i=1;i<n;i++){
            f=f*i;
        }
        return f;
    }
    // public static void main(String args[]){
        // System.out.println(factorial(2));
        
        
        // Binomial coefficient
        
        
        // import java.util.*;
        // public class functions{
            public static int binCoeff(int n,int r){
                int fact_n=factorial(n);
                int fact_r = factorial(r);
        int fact_nmr=factorial(n-r);
        int binCoeff = fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }
    public static void main(String args[]){
        System.out.println(binCoeff(5,2));
        
    }
    
}


import java.util.*;
public class functions{
    public static int sum(int a,int b){            //Function to calculate sum of two numbers
        return a+b;
        
    }
    // function to calculate sum or 3 numbers
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,2));
        
    }
}

//Function to calculate int sum

import java.util.*;
public class functions{
    public  static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum (3,5));
        System.out.println(sum (33.2f,4.8f));
        
    }
}

// Check if the number is prime or not

import java.util.*;

public class functions {
    public static boolean isPrime(int n) {

        // Corner cases only for(n>2)
        if (n == 2) {
            return true;
        }

        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // completly dividing
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(12));

    }
}


import java.util.*;
public class functions{
    public static boolean isPrime(int n){
        if(n==2){
            return true;

        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;

    }
    // public static void main(String args[]){
        // System.out.println(isPrime(2));
        // }
        
        // }
        
        
        
        //Print all prime in a range

        // import java.util.*;
        // public class functions{
            public static void primesinRange(int n){
                for(int i=2;i<=n;i++){
                    if(isPrime(i)){
                    System.out.println(i+" ");
                }
            }
            System.out.println();
        }
        public static void main(String args[]){
            primesinRange(200);
            
        }
    }
        */

//Convert from Binary to Decimal

// import java.util.*;

// Convertfrom Decimal to Binary

// public class functions{
//     public static void dectobin(int n){
//         int myNum = n;
//         int pow =0;
//         int binNum =0;
//         while(n>0){
//             int rem = n%2;
//             binNum = binNum + (rem *(int)Math.pow(10,pow));
//             pow++;
//             n=n/2;
//         }
//         System.out.println("binary form of"+myNum+" = "+binNum);
//     }
//     public static void main(String args[]){
//         dectobin(11);
//     }
// }

// public class functions{
// public static void prints(){
//     int s =45;
// }
// public static void main(String args[]){
//         int s=45;

//         System.out.println(s);

//     }

// }

//Practic questions

// import java.util.*;

// public class functions{
//     public static void main (String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter your Second numebr: ");
//         int b = sc.nextInt();
//         System.out.println("Enter your Third number: ");
//         int c = sc.nextInt();

//         System.out.println("The averagevalue is"+ average(a,b,c)+"\n");
//     }
// public static int average(int a,int b,int c){
//     return (a+b+c)/3;
// }
// }

//QUE 2

// import java.util.*;

// import javax.swing.plaf.synth.SynthStyleFactory;

// public class functions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         System.out.print("Enter your number : ");

//         num = sc.nextInt();

//         if(isEven(num)){
//             System.out.println("Number is Even");

//         }else{
//             System.out.println("Number is odd");
//         }
//     }
//     public static boolean isEven(int number){
//         if(number %2==0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }

// Que 3

// import java.util.Scanner;

// import javax.swing.plaf.synth.SynthStyleFactory;
// public class functions{
//     public static void main(String args[]){
//         int n,s=0,c,r;
//         System.out.println("Enter your number: ");
//         Scanner sc = new Scanner(System.in);

//         n = sc.nextInt();
//         c=n;
//         while(n>0){
//             r =n%10;
//             s=(s*10)+r;
//             n=n/10;
//         }
//         if (c==s){
//             System.out.println("Number is palendrome");

//         }else{
//             System.out.println("Number is not a palendrome");
//         }

//     }
// }

// Que 4

// import java.util.*;

// public class functions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int digits = sc.nextInt();
//         System.out.println("The sum is: "+ Sumdigits(digits));
 

//     }

// public static int Sumdigits(int n){
//     int Sumofdigit =0;
//     while (n>0){
//         int lastDigit =n%10;
//         Sumofdigit += lastDigit;
//         n/=10;
//     }
//     return Sumofdigit;
// }
// }