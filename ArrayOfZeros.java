/*
Array of Zeroes
Description

You have an array of non-negative integers. You can perform one operation on it in which you can choose i-th index with 0 <= i < n and subtract 1 from both i-th and (i+1) th index of array.

Your task is to write a program that can comment if it is possible to get an array of all zeros after several operations.


Input
Input Format

The first line of test case is a number N. (0 < N <= 10000) The next line is N non-negative integers, 0 <= a_i <= 109

Constraints

0 < N <= 10000


Output
Output Format

If it can be modified into all zeros with several operations output “YES” in a single line, otherwise output “NO” instead.


Sample Input 1 

2
1 2
Sample Output 1

NO
Sample Input 2 

2
2 2
Sample Output 2

YES

*/


import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    for(int i=0; i<n; i++) {
      ar[i] = sc.nextInt();
    }
    for(int i=0; i<n-1; i++) {
      int temp = ar[i];
      ar[i+1] = ar[i+1] - temp;
      ar[i] = ar[i] - temp;
      //System.out.println(ar[i-1]+" "+ar[i]);
    }
    boolean b = true;
    for(int i=0; i<n; i++) {
      if(ar[i]!=0) {
        b = false;
        break;
      }
    }
    System.out.println(b?"YES":"NO");
  }
}
