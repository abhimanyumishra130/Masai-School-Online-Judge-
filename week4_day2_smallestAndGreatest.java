/*


Smallest and Largest of all
Description

Given an array, A, of N integers, print the smallest and largest element present in the array

YOU MUST NOT USE ANY BUILT-IN FUNCTION


Input
Input Format

The first line contains an integer, N (the number of integers in A). The second line contains N space separated integers describing A.

Constraints

N<100


Output
Output Format

Print 2 integers in different lines where first integer represents the minimum of all elements and second integer represents the maximum of all


Sample Input 1 

4
-2 0 8 4
Sample Output 1

-2
8
*/

//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr =new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int large=arr[0];
    int small=arr[0];
    
    for(int i=0;i<n;i++)
    {
      if(arr[i] > large){
        large =arr[i];
      }
      if(arr[i] < small){
        small=arr[i];
      }
    }
    System.out.println(small);
    System.out.println(large);
  }
}
    
