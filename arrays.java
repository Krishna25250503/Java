//  import java.util.*;

//   public class arrays {
//   public static void main(String args[]) {
//  int marks[] = new int[100];
//   Scanner sc = new Scanner(System.in);
//   in phy;
//   phy =sc.nextInt();

// System.out.println("Lenght of array =" + marks.length );

//  marks[0] = sc.nextInt();
//  marks[1] = sc.nextInt();
//   marks[2] = sc.nextInt();
//   System.out.println("physics :" + marks[0]);
//  System.out.println("chemistary :" + marks[1]);
//    System.out.println("Maths :" + marks[2]);

//  marks[2] = marks[2] +1;
//    System.out.println("Maths :" + marks[2]);

//   int percentage = (marks[0] + marks[1] + marks[2] )/3;
//   System.out.println("percentage =" + percentage + "%");

//   }

//  }

/*
* 
* import java.util.*;
* 
* public class arrays {
* public static void update(int marks[]) {
* for(int i=0;i<marks.length;i++){
* marks[i] = marks[i]+1;
* }
* }
* public static void main(String args[]){
* 
* int marks[] = { 97, 98, 99 };
* update(marks);
* 
* for(int i=0;i<marks.length;i++){
* System.out.print(marks[i]+" ");
* 
* }
* System.out.println();
* }
* }
* 
* 
* import java.util.*;
* 
* public class arrays {
* public static int getlargest(int num[]) {
* int largest = Integer.MIN_VALUE; // _infinity
* int smallest = Integer.MAX_VALUE;
* for (int i = 0; i < num.length; i++) {
* if (largest < num[i]) {
* largest = num[i];
* }
* if(smallest > num[i]){
* smallest = num[i];
* 
* }
* }
* System.out.println("smallest number is :" + smallest);
* return largest;
* }
* 
* public static void main(String args[]) {
* int num[] = { 1, 2, 6, 8, 9 };
* System.out.println("largest value is :" + getlargest(num));
* }
* }
* 
* import java.util.*;
* 
* public class arrays {
* public static int binarysearch(int numbers[], int key) {
* int start = 0, end = numbers.length - 1;
* while (start <= end - 1) {
* int mid = (start + end) / 2;
* 
* if (numbers[mid] == key) {
* 
* return mid;
* }
* if (numbers[mid] < key) {
* start = mid + 1;
* } else {
* end = mid - 1;
* 
* }
* }
* return -1;
* }
* 
* public static void main(String args[]) {
* int numbers[] = { 1, 2, 5, 6, 9 };
* int key = 9;
* System.out.println("index for the key is:" + binarysearch(numbers, key));
* }
* }
* 
* 
* //Reverse an array
* 
* 
* 
* import java.util.*;
* public class arrays{
* public static void reverse(int numbers[]){
* int first =0,last = numbers.length-1;
* while(first < last){
* int temp = numbers[last];
* numbers[last] = numbers[first];
* numbers[first] = temp;
* first++;
* last--;
* }
* }
* public static void main (String args[]){
* int numbers[] = {2,4,6,8,10};
* reverse(numbers);
* for (int i=0;i<numbers.length;i++)
* 
* System.out.print(numbers[i] + " ");
* }
* }
* 
* // Pairs in an array (Nested loops)
* 
* 
* //To calculate total pairs formula = n(n-1)/2 ***
* 
* import java.util.*;
* 
* public class arrays {
* public static void printpairs(int numbers[]) {
* int tp =0;
* for (int i = 0; i < numbers.length; i++) {
* int curr = numbers[i];
* for (int j = i + 1; j < numbers.length; j++) {
* System.out.print("(" + curr + "," + numbers[j] + ") ");
* tp++;
* }
* System.out.println();
* }
* System.out.println("total pairs = " + tp);
* }
* 
* public static void main(String args[]) {
* int numbers[] = { 2, 4, 6, 8, 10 };
* printpairs(numbers);
* }
* }
* 
* 
* //Print sub array
* 
* 
* 
* import java.util.*;
* public class arrays{
* public static void printsubarrays(int numbers[]){
* int td =0;
* for(int i =0;i<numbers.length;i++){
* int start = i;
* for(int j=i;j<numbers.length;j++){
* int end = j;
* for(int k=start;k<=end;k++){
* System.out.print(numbers[k] +" ");
* }
* td++;
* System.out.println();
* }
* System.out.println();
* }
* System.out.println("Total subarrays =" + td);
* }
* public static void main (String args[]){
* int numbers[]= {2,4,6,8,10};
* printsubarrays(numbers);
* }
* }
* 
* //Max Sub array sum
* 
* import java.util.*;
* 
* public class arrays{
* public static void maxsubarraysum(int numbers[]){
* int currsum =0;
* int maxSum = Integer.MIN_VALUE;
* for(int i=0;i<numbers.length;i++){
* int start = i;
* for(int j=0;j<numbers.length;j++){
* int end =j;
* currsum =0;
* for(int k=start;k<=end ;k++){
* currsum += numbers[k];
* }
* System.out.println(currsum);
* if (maxSum <currsum){
* maxSum =currsum;
* }
* 
* 
* }
* }
* System.out.println("Max Sum ="+ maxSum);
* }
* public static void main(String args[]){
* int numbers[] ={2,4,6,8,10};
* maxsubarraysum(numbers);
* 
* }
* }
* 
* //Prefix Sum
* 
* import java.util.*;
* 
* public class arrays {
* public static void prefixsum(int numbers[]) {
* int currsum = 0;
* int maxsum = Integer.MIN_VALUE;
* int prefix[] = new int[numbers.length];
* prefix[0] = numbers[0];
* for (int i = 1; i < prefix.length; i++) {
* prefix[i] = prefix[i - 1] + numbers[i];
* }
* for (int i = 0; i < numbers.length; i++) {
* int start = i;
* for (int j = i; j < numbers.length; j++) {
* int end = j;
* currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start = 1];
* if (maxsum < currsum) {
* maxsum = currsum;
* }
* }
* }
* System.out.println("Max sum " + maxsum);
* }
* 
* public static void main(String args[]) {
* int numbers[] = { -1, -2, 6, -1, 3 };
* prefixsum(numbers);
* 
* }
* }
* 
* //Kedans Algorethim
* 
* import java.util.*;
* 
* public class arrays {
* public static void kadanes(int numbers[]) {
* int ms = Integer.MIN_VALUE;
* int cs = 0;
* for (int i = 0; i < numbers.length; i++) {
* cs = cs + numbers[i];
* if (cs < 0) {
* cs = 0;
* }
* ms = Math.max(cs, ms);
* }
* System.out.println("Our max Subarray is :" + ms);
* 
* }
* 
* public static void main(String args[]) {
* int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
* kadanes(numbers);
* }
* }
* 
* 
* 
* // DSA sheet question no 22   *****
*                                
* 
* // Trapping RainWater
* 
* // Formula
* 
* (WaterLevel - BarLevel or BarHeight) * width = Trapped Water
* 
* // Points
* 
* 
* 
* 1 => Minimum numbers of bar required >= 2
* 2 => If bars are in ascending/Desinding form no Water is trapped
* 3 =>  Waterlevel = (maxLeft ,MaxRight) Ki minimum value

import java.util.*;

public class arrays {
   public static int trappedrainwater(int height[]){
       int leftmax[] = new int [height.length];
       leftmax[0] = height[0];
       for(int i=1;i<height.length;i++){
           leftmax[i] = Math.max(height[i],leftmax[i-1]);
       }
       int rightmax[] = new int [height.length-1];
       rightmax[height.length-1] = height[height.length-1];
       for(int i=height.length-2;i>=0;i--){
           rightmax[i] = Math.max(height[i],rightmax[i+1]); 
   }
   int trappedwater =0;
   for(int i=0;i<height.length;i++){
       int waterlevel = Math.min(leftmax[i],rightmax[i]);
           trappedwater += waterlevel -height[i];
       }
       return trappedwater;
   }

   
   public static void main(String args[]) {
       int height[] = { 4, 2, 0, 6, 3, 2, 5 };
       System.out.println(trappedrainwater(height));
   }
}

// DSA Questions 

import java.util.*;

public class arrays {
    public boolean duplicates(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    // System.out.println(nums);

    public static void main(String args[]) {
        int nums[]= {-1,2,4,-5};
        System.out.println(nums);
    }

}




//Stocks Wala Question


import java.util.*;
public class arrays{
    public int maxProfit(int [] prices){
        int buy = prices[0];
        int profit =0;
        
    }
    public static void main (String args[]){

    }
}

import java.util.*;

public class arrays {
    public static int trappedrainwater(int height[]){
        int n = height.length;
        int leftmax [] = new int [height.length];
        //calculate left max boundary -array
        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary - array
        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightmax[n-1] = height[n-1];
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
int trappedwater=0;


        //loop
        for(int i=0;i<n;i++){
            //waterlevel = min(leftmax boundary ,rightmax boundary)
           int waterlevel = Math.min(leftmax[i],rightmax[i]);
                // Trapped Water = Water Level - Height[i]
                trappedwater += waterlevel -height[i];
            

        }


return trappedwater;
}

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
         System.out.println(trappedrainwater(height)); 
        }
    }
    */

// Buy and sell Stocks 

import java.util.*;

// public class arrays {
//     public static int buyandsellstocks(int prices[]) {


// int n = 6;
// int n = n + 6;
// int n += n;
// System.out.println(n);


//     }
// }

//         int buyprice = Integer.MAX_VALUE;
//         int maxprofit = 0;

//         for(int i=0;i<prices.length;i++){
//             if(buyprice < prices[i]){
//                 int profit = prices[i] - buyprice;
//                 maxprofit = Math.max(maxprofit,profit);
//             }
//             else{
//                 buyprice = prices[i];

                
//             }
//         }
//         return maxprofit;
//     }

//     public static void main(String args[]) {
//         int prices[] = { 7, 1, 5, 3, 6, 4 };
//         System.out.println(buyandsellstocks(prices));
//     }
// }