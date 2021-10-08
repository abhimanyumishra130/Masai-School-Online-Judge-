/*Majority element -9872:55:1
Description

Given an array A having N non-negative integers. Find the element that occurs more than N/2 times. If no such element is there then print -1.


Input
First line: Single integer T denoting the number of test cases.
For each test case:
First line: Single integer denoting the value of N.
Next line contains N single space separated integers denoting the elements of array A.
Constraints:
1 <= T<= 10
1<= N <= 100000
0 <= A[ i ] <= 100000

Output
For each test case, print in a new line a single integer denoting the majority element.


Sample Input 1 

2
6
1 1 1 1 2 3
5
1 1 2 2 3
Sample Output 1

1
-1
Hint

Given test cases :
Test case 1 :
N = 6,
A : 1 1 1 1 2 3

1 has occurred 4 times which is greater than N/2. Hence 1 is the majority element.

Test case 2 :
N = 5,
A : 1 1 2 2 3

None of the elements occurred more than N/2 times. Hence the answer for this case is -1.

*/


import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-->0){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i=0; i<len; i++) arr[i] = sc.nextInt();
            
            int value = -1;
            for(int i=0; i<len; i++){
                int count = 0;
                for(int j=0; j<len; j++){
                    if(arr[i] == arr[j]) count++;
                }
                if(count > len/2){
                     value = arr[i];
                     break;
                }
            }
            
            System.out.println(value);
        }
    }
}
