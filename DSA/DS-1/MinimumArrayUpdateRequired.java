/*
Minimum Array Update Required
Description

You are given an array having N integer values. You are also provided an integer K. You can update every element of the array by incrementing it by 1 in 1 second. Your task is to write a program that calculates the minimum time required (in seconds) to make every element of the array greater than or equal to K.


Input
Input Format:

First line of the input contains two integer N and K

Second line contains N elements separated by space.

Constraints:

N < 100000

K < 100000


Output
Output one number, which is the minimum number of steps required to make every element of the array greater than or equal to K.


Sample Input 1 

3 4
1 2 5
Sample Output 1

3
*/


//Enter code here
import java.util.Arrays;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] ar= new int[n];
    for(int i=0;i<n;i++){
      ar[i]=sc.nextInt();
    }
    //Arrays.sort(ar);
    int min=ar[0];
    for(int i=0;i<n;i++){
      if(ar[i]<min){
        min=ar[i];
      }
    }
    int step =0;
    if(k>min){
    step=k-min;
    }
    System.out.print(step);
  }
}
