/*
Detect Palindrome II
Description

You are given a string S. Find if the string, can be converted into a palindrome.

You are free to rearrange the string in any way you want. Rearrangement refers to the fact that the characters can be arranged in any way in the string.

Deletion or addition of characters is not allowed.


Input
The first line contains T, the number of test cases.

The first line of each test case contains N, the length of the string.

The next line contains the string.

Constraints

1 <= T <= 10

1 <= N <= 100


Output
If the string can be rearranged into a palindrome, print "Possible!", else print "Not Possible!".


Sample Input 1 

2
6
aabbcc
5
aabcd
Sample Output 1

Possible!
Not Possible!
Hint

In the first sample test case, the string can be rearranged as "acbbca", which is a palindrome.

In the second sample test case, the string cannot be rearranged into a palindrome.


*/

//Enter code here
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Main{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0; i<t; i++){
      int length= sc.nextInt();
      String string= sc.next();
      HashMap<Character, Integer> hashmap = new HashMap<>();
      for(int j=0; j<length ; j++){
        if(hashmap.containsKey(string.charAt(j))){
          int count=hashmap.get(string.charAt(j));
          hashmap.put(string.charAt(j),count+1);
        }else{
          hashmap.put(string.charAt(j), 1);
        }
      }
      int odd_count=0;
      for(Map.Entry<Character , Integer> a:hashmap.entrySet()){
        int count = a.getValue();
        if(count%2!=0) odd_count++;
      }
      System.out.println(odd_count>1?"Not Possible!":"Possible!");
    }
  }
}
