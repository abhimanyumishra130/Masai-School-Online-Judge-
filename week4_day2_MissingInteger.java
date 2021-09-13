/*

Missing Integer
Description

You are given an array of N-1 integers and integers are in the range of 1 to N. There are no duplicates in the array. One of the integers is missing in the array. Find the missing integer


Input
Input Format


The first and only line contains N-1 integers

Constraints

N<100


Output
Print the one number belonging from 1 to N which is not present in the array


Sample Input 1 

4 5 1 3
Sample Output 1

2
*/


//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String N= sc.nextLine();
    String[] num = N.split(" ");
    int[] arr=new int[num.length];
    for(int i=0;i<arr.length;i++){
      arr[i]=Integer.parseInt(num[i]);
    }
    int n=arr.length+1;
    int sumOfNum=(n*(n+1))/2;
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
    }
    int missing=sumOfNum-sum;
    System.out.print(missing);
  }
}
    
    
