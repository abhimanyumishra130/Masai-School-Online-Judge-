/*
X smallest odd frequency
Description

You are given a 2D array with N rows and N columns, having positive integers. X is defined as the collection elements of the left diagonal and right diagonal of the array. Check if the frequency of the smallest element of X is odd or not.


Input
First line: Single integer denoting the value of T - the number of test cases.

For each test case:

First line: Single integer denoting the value of N.

N lines follow:

Each of the lines consists of N single space-separated integers, denoting a row of a matrix.

Constraints:

1 <= T <= 10
1 <= N <= 50
The value any of array element doesn't exceed 100.


Output
For each test case, print in a new line, "yes" (without quotes) if the frequency of the smallest element of X is odd. Else print "no"(without quotes).


Sample Input 1 

1
2
1 1
4 1
Sample Output 1

yes
Hint

Given the test case,

Test 1:

N = 2, and given 2D array:

1  1

4  1

The left diagonal contains 1 1.

The right diagonal contains 1 4.

Hence the smallest element in X is 1. Since 1 appears thrice in X, which is odd, hence the answer is yes.
*/




//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    for(int k=0;k<t;k++){
      int n= sc.nextInt();
      int[][] ar = new int[n][n];
      int a=n+n;
      if(n%2==1) a=a-1; 
      int[] x= new int[a];
      int idx=0;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          ar[i][j]= sc.nextInt();
          if(i==j){
            x[idx++]=ar[i][j];
           // System.out.println(ar[i][j]+" "+i+" "+j);
          }
          else if(i+j==n-1){
             x[idx++]=ar[i][j];
            //System.out.println(ar[i][j]+" "+i+" "+j);
          }
        }
      }
      int min=x[0];
      for(int i=0;i<x.length;i++){
        if(x[i]<min){
          min=x[i];
        }
      }
      int count=0;
      for(int i=0;i<x.length;i++){
        //System.out.println(x[i]+" "+min);
        if(x[i]==min){
          count++;
        }
      }
      System.out.println((count%2==0)?"no":"yes");
    }
  }
}
      
