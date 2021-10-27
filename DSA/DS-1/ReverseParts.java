/*
Reverse Parts Ended
Description

Given a string and a range L, R you need to reverse the sub-string starting from index L and ending at index R, and finally print the updated string.



e.g.: Suppose you are given this string

"abcd"

L = 0 and R = 2, then the substring "abc" will be reversed as "cba", and the final output will be "cbad"



Note:String is 0-indexed and contains only lowercase English Alphabet


Input
Input Format:

First line of input contains the number N , denoting the length of the string

Second line of input contains the string.

Next line contain 2 integers L and R which is the sub-string that you need to reverse in the string.

Constraints:

1<=N<=100

0<=L<R<N


Output
Output the final string after doing the operation on it.


Sample Input 1 

8
fxavixem
0 1
Sample Output 1

xfavixem
Hint

In Sample 1:

N = 8

String is "fxavixem"

Operation:  L = 0, R = 1 , in this operation we reverse the sub-string from position 0 to 1, so the string becomes "xfavixem"

Output will be "xfavixem" which is the obtained string after performing the operation
*/

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();
        int l = sc.nextInt();
        int r = sc.nextInt();
        char[] ch = str.toCharArray();
        String revStr = "";
        for(int i=r; i>=l; i--){
            revStr += ch[i];
        }
        int j=0;
        for(int i=l; i<=r; i++){
            ch[i] = revStr.charAt(j);
            j++;
        }
        String res = "";
        for(int i=0; i<ch.length; i++){
            res +=ch[i];
        }
        System.out.print(res);
    }
}
