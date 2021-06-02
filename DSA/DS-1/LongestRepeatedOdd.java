/*
Longest Repeated Odd
Description

You are given an array A of N integers. Your task is to find the maximum number of times an odd number is continuously repeated in the array.


Input
Input Format

First line contains N which is the number of element present in the array.

Second line contains N integers which are the values of array.

Constraints

N<100


Output
Output Format

Output one integer which the maximum number of times an odd number is repeated in array.


Sample Input 1 

12
1 1 1 1 2 2 2 2 2 1 1 1
Sample Output 1

4
Hint

Sample 1 Explanation

1 is repeated 4 times from index 0 to index 3 => 4 times

2 is repeated 5 times from index 4 to index 8 => 5 times

1 is repeated 3 times from index 9 to index 11 => 3 times

So, the output is 4 since 1 is odd.


*/


//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    int count=0;
    int max=0;
    for(int i=0;i<n;i++){
        if(a[i]%2==0){
            count=0;
        }else{
            if(count==0){
                count++;
            }
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                count=1;
            }
            //System.out.println(a[i]+" "+count);
        }
        if(count>max){
            max=count;
        }
        
        if(i==n-2){
            break;
        }
    }
    System.out.print(max);
  }
}
