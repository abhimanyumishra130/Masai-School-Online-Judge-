/*
Total number of Pairs with Odd sum.
Description

You are given an array of N integers.

You need to print total number of pairs whose sum is odd.


Input
First line contains T, no of test cases.

First line of each test case contains N, size of array

Second line of each test case contains N spaced integers, of array.

Constraints

1 <= T <= 10

1 <= N <= 10^6

1 <= A[i] <= 10^6


Output
For each test case, printtotal number of pairs whose sum is odd.


Sample Input 1 

2
3
1 2 3
5
2 2 2 2 1
Sample Output 1

2
4
Hint

For test case 1

Pairs with odd sum are :- (1,2)  (2,3)

For test case 2

Pairs with odd sum are :- (2, 1), (2, 1), (2, 1), (2, 1)
*/




import java.util.Scanner;
class Main{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    for(int k=0;k<t;k++){
      int n = sc.nextInt();
      //int m=sc.nextInt();
      int[] ar = new int[n];
      for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
      }
      int count=0;
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          if((ar[i]+ar[j])%2==1) count++;
          //System.out.println(count);
        }
      }
      System.out.println(count);
    }
  }
}
