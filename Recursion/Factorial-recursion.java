/*
Factorial-Recursion
Description

The factorial of a positive integer N is the product of all positive integers less than or equal to n:

Given a number N your task is to write a program that calculates factorial of N


Input
Input Format

First and the only line contains N



Constraints

N<15


Output
Output the factorial value of N


Sample Input 1 

5
Sample Output 1

120
Hint

Sample Explanation

Factorial of 5 = 5*4*3*2*1 = 120


*/


import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(fact(num));
  }
  public static int fact(int num){
    if(num==0){
      return 1;
  }else {
    return num*fact(num-1);
  }
}
}

    
