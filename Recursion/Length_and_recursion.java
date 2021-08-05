/*
Length & Recursion
Description

Given a string, S. Find the length of the string using recursion.

Note: You are not allowed to use the length built-in property.


Input
Input Format

The single line  consists of string S

Constraints

1<= S length <= 200


Output
Print length of the given string S.


Sample Input 1 

masaischool
Sample Output 1

11
*/

import java.util.Scanner;
class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String st = "";
    int count = 0;
    
    System.out.print(strLength(str,st,count));
  }
  public static int strLength(String str, String st , int count){
    if(str.equals(st)) return count;
    else{
      st+=str.charAt(count);
      return strLength(str,st,count+1);
    }
  }
}
