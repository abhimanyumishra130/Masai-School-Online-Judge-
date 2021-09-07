/*
Search in sorted and rotated array Ended
Description

Given a sorted(increasing order) array of length n and is rotated by some value beforehand. Find the index of the target element  K in the rotated array in O(logn) time. If not found print -1.

Note: Array contains all distinct elements.


Input
Input Format

First line consists of n and k separated by space.

Second line consists of n integers separated by spaces

Constraints

1 <= n <= 50

k <= 50






Output
Print index of the target element


Sample Input 1 

5 1
3 4 5 1 2
Sample Output 1

3
Sample Input 2 

6 6
3 4 7 9 1 2
Sample Output 2

-1

*/

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[len];
    for(int i=0; i<len; i++) arr[i] = sc.nextInt();
    System.out.print(findK(arr,k));
  }
  
  public static int findK(int[] arr, int k){
    int low = 0;
    int high = arr.length-1;
    while(low <=high ){
      int mid = low+(high-low)/2;
      if(arr[mid] == k) return mid;
      if(arr[mid] <= arr[high]){
        if(k > arr[mid] && k<=arr[high]) low = mid+1;
        else high = mid-1;
      }
      else{
        if(k < arr[mid] && k>=arr[low]) high = mid-1;
        else low = mid+1;
      }   
    }
    return -1;
  }
}
