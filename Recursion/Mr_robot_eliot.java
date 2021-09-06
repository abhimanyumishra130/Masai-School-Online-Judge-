/*
Mr Robot - Elliot Ended
Description

Mr.Robot needs an encryption method, so Elliott was there to help him. At the same time, Richard wrote a paper on encryption. Elliott then started writing his algorithms with the help of paper from Richard but he needs your help in implementing. The algorithm is like this:

Given an input string, the encrypted string will start with the middle character of the string and will be formed henceforth with the middle characters of the left and right substrings (of the middle character of the word) and so on. Take a look at the explanation of the sample test case for better understanding.


Input
Input Format :

The first line contains an integer T denoting the number of TEST CASES. Each TEST CASE consists of 2 lines. The first line contains an integer N denoting the length of the word that needs to be encrypted. The second line contains the word that needs to be encrypted.

Constraints :

1 <= T <= 10

1 <= Length of the string <= 10000


Output
N lines where each line will contain the encrypted words


Sample Input 1 

3
3
abc
4
abcd
11
abcdefghijk
Sample Output 1

bac
bacd
fcabdeighjk
Hint

For abc, initially, ans is "",

1. Middle character for abc is b, so the answer becomes "b", and strings are a and c.

2. Now the middle character of the string "a" is a, so the answer becomes "ba".

3. Now the middle character of the string "c" is c, so the answer becomes "bac".

*/

import java.util.*;
class Main{
  
  public static String ans="";
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    for(int t=0; t<testcase; t++){
      int len = sc.nextInt();
      String str = sc.next();
      ans="";
      ansStr(str,0,len-1,len-1);
      System.out.println(ans);
    }
  }
  
  public static void ansStr(String str,int low,int high,int len){
    int mid = low+(high-low)/2;
    //System.out.println(mid);
    
    if(low>high) return;
    ans+=str.charAt(mid);
    if(mid==-1) return;
    if(mid==len+1) return;
    //if(mid==high-1) return ans;
    //if(mid%2==1) ans+=str.charAt(mid);
    //else ans+=str.charAt(mid-1);
    
    
    ansStr(str,low,mid-1,len);
    ansStr(str,mid+1,high,len);
  }
  
}
