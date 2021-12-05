/*
Count triplets Ended
Description

You are given a sorted array consisting of N integers. You need to count to the number of triplets such that the absolute difference between the maximum and minimum element of the triplet should be less than or equal to K.

Note:

A triplet is a group of three integers (a[i], a[j] ,a[k]) where i < j < k.


Input
The first line contains 2 space-separated positive integers N and K denoting the number of elements present in the array and the maximum allowed difference.

The second line contains N space-separated positive integers A[i] denoting the elements of the array.

Constraints

1 <= N <= 10^5

0 <= K <= 10^9

1 <= A[i] <= 10^9


Output
The single line of output should contain the number of triplets.


Sample Input 1 

4 2
-3 -2 -1 0
Sample Output 1

2
Sample Input 2 

4 3
1 2 3 4
Sample Output 2

4
Hint

Explanation for Sample 1

The triplets are {-3,-2-1}, {-2,-1,0}.
*/



import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[len];
        for(int i=0; i<len; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(Triplets(arr, k));
    }
    public static long Triplets(long[] arr, long k) {
        long count = 0;
        int i = 0;
        while(i<arr.length-2) {
           int l = i,h = arr.length-1;
           int ind = 0;
           while(l<=h){
               int mid = l + (h-l)/2;
               if(Math.abs(arr[mid] - arr[i]) <= k){
                   ind = mid;
                   l = mid+1;
               }else h = mid-1;
           }
        //   System.out.println(ind);
        //   count += ind-i+1;
        
        long temp = ind - i-1;
        count += temp *(temp+1)/2;
           
           i++;
        }
        return count;
    }
    public static boolean isTriplet(int i, int j, long[] arr, long k) {
        long abs = Math.abs(arr[i]-arr[j]);
        return abs<=k;
    }
    
    public static long fact(long num){
        if(num<0) return -1;
        if(num == 0) return 1;
        if(num == 1) return 1;
        
        return num * fact(num-1);
    }
}
