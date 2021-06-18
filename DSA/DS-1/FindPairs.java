/*
Find Pairs
Description

You are given an array A of size N, and a integer M.

You need to count total pairs in array whose product is M.


Input
First line contains T, no of test cases.

First line of each test case contains N and M, size of array and integer.

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= M <= 100

3 <= N <= 100

1 <= A[i] <= 1000


Output
Output count of such pairs on new line for each test case.



Sample Input 1 

2
3 0
1 3 2
5 4
3 2 2 1 5
Sample Output 1

0
1
*/


//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    for(int k=0;k<t;k++){
      int n = sc.nextInt();
      int m=sc.nextInt();
      int[] ar = new int[n];
      for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
      }
      int count=0;
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          if(ar[i]*ar[j]==m) count++;
        }
      }
      System.out.println(count);
    }
  }
}
