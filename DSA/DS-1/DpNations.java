/*
DpNation - find the max contiguous subarray -9440:47:18
Description

you are given an integerarray, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.


Input
1<=T<=10

1<=N<=100000

-1e9<=Ai<=1e9


Output
output a single integer, the solution


Sample Input 1 

3
3
1 2 3
4
-1 -1 0 1
3
2 -1 2
Sample Output 1

6
1
3
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase--!=0) {
            int len = sc.nextInt();
            long[] ar = new long[len];
            for(int i=0; i<len; i++) {
                ar[i] = sc.nextLong();
            }
            long max = Long.MIN_VALUE;
            long sum = 0;
            for(int i=0; i<len; i++) {
                sum += ar[i];
                max = Math.max(sum, max);
                
                if(sum<0) sum=0;
            }
            System.out.println(max);
        }
    }
}
