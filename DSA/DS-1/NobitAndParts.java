/*
Nobita and Parts Ended
Description

Given a string and K operations on string you need to output the string after doing those K operations, The operation is like this: you will receive two integer L and R which are indexes of string positions and you need to reverse the sub-string and update the original string and in the 2nd operation you need to do the same on the previously updated string.



Note: The string is 0-index based and contains only lowercase English Alphabet

Suppose the String is this:

"abcd"

In 1st operation , L = 1, R = 3 then now the string becomes :  "adcb" , reversed the substring starting from index 1 to index 3.

In 2nd operation , L = 0, R = 2,then now the string becomes : "cbad"

So the output will be finally "cbad" which you need to print.

You need to do first operation first then second operation, do not do 2nd operation first it will give wrong result.


Input
Input Format:

First line of input contains the number N and K, denoting the length of the string and Number of operations that you need to do.

Second line of input contains the string.

Next 2 lines contain 2 integers L and R which is the substring that you need to reverse on the string.

Constraints:

1<=N<=100

K = 2, There will always be exactly 2 operations

0<=L<R<N


Output
Output the final string after doing the K operations on it.


Sample Input 1 

6 2
abcdfg
0 3
2 5
Sample Output 1

dcgfab
Sample Input 2 

3 2
abc
0 1
1 2
Sample Output 2

bca
Hint

In Sample 1:

N = 6, K = 2

String is "abcdfg"

1st Operation:  L = 0, R = 3 , in first operation we reverse the sub-string from position 0 to 3, so the string becomes "dcbafg" ( 2nd operation will be done on this string )

2nd Operation: L = 2, R = 5, in second operation we reverse the sub-string from position 2 to 5,so the string becomes "dcgfab"

Output will be "dcgfab" which is the obtained string after performing the operations K times.
*/


import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();
        for(int i=0; i<k; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            String temp = revStr(ch,l,r);
            int ind =0;
            for(int j=l; j<=r; j++){
                ch[j] = temp.charAt(ind);
                ind++;
            }
        }
        
        str = "";
        for(int i=0; i<ch.length; i++){
            str= str + ch[i];
        }
        System.out.print(str);
    }
    
    public static String revStr(char[] ch, int l, int r){
        String st = "";
        for(int i=r; i>=l; i--){
            st+=ch[i];
        }
        return st;
    }
}
