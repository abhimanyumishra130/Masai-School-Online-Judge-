/*

Binary Equivalent - Recursive
Description

Given an integer n, you need to find out its binary representation using recursion.

Here multiple test cases exist and the expected time complexity is - O(t*logn) where is t is the number of test cases.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 100000) — the number.



Output
For each test case, print the answer: The binary representation of the integer.


Sample Input 1 

2
15
128
Sample Output 1

1111
10000000

*/

import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    for(int t = 0; t<testcase; t++){
      int num = sc.nextInt();
      String bin = "";
      System.out.println(binary(num,bin));
    }
  }
  public static String binary(int num , String bin){
    if(num==0) return bin;
    else {
      bin=num%2+bin;
      num/=2;
      return binary(num,bin);
    }
  }
}
