/*
Half Palindrome
Description

Given a string of even length , the definition is: a string is palindrome if both of it's half is a palindrome, if both the halves are palindrome output yes else no.

Note: String contains lowercase English alphabet



"ababcb", output will be "yes"

"abcdff" , output will be "no"


Input
Input Format:

First line of input contains the number N , denoting the length of the string

Second line of input contains the string.

Constraints:

1<=N<=500


Output
Output "yes" or "no"


Sample Input 1 

6
ababcb
Sample Output 1

yes
Sample Input 2 

4
abdc
Sample Output 2

no
Sample Input 3 

6
abbbba
Sample Output 3

no
*/

//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    String s=sc.next();
    String str1="";
    String str2="";
    
      for(int j=0;j<n/2;j++){
        str1=str1+s.charAt(j);
      }
    for(int i=n/2;i<n;i++){
      str2=str2+s.charAt(i);
    }
    if(palin(str1) && palin(str2)){
      System.out.print("yes");
    }else{
      System.out.print("no");
    }
  }
  public static boolean palin(String str){
    String s="";
    for(int i=str.length()-1;i>=0;i--){
      s=s+str.charAt(i);
    }
    if(str.equals(s)){
      return true;
    }else{
      return false;
    }
  }
}
      
      
