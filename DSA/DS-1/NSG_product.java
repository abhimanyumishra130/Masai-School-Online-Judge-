/*

NSG Product Ended
Description

Given an array of N elements,find the next smaller of next greater elementof every element in array, assume -1 if next smaller or next greater does not exists. Refer to the sample I/O for better understanding.



You need to output the product of these values , which is for each element it's next smaller of next greater in the array, assume -1 ifnext smaller or next greater does not exists.



Input
Input Format:

The first line contains T, the number of test cases.

The first line of each test case contains N, the number of elements in the array. The next line contains N space separated integers denoting the elements of the array

Constraints:

1 <= T <= 10

1 <= N <= 10^4

0 <= A[i] <= 100


Output
For each test case,print an integer which is the product, in a new line


Sample Input 1 

1
6
5 1 6 2 5 1
Sample Output 1

-4
Hint

In Sample 1:

Next Greater:                                                                   Next Smaller:
5 -> 6                                                                                    6->2

1-> 6                                                                                     6->2

6 -> -1(No Next Greater Exists)                                            -1

2 -> 5                                                                                   5-> 1

5-> -1                                                                                     -1

1 -> -1 (No Next Greater Exists)                                            -1



Product  = 2*2*-1*1*-1*-1 = -4

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
            
            System.out.println(prodNum(arr,len));
        }
    }
    
    public static int prodNum(int[] arr, int len){
        
        int prod = 1;
        for(int i=0; i<len; i++){
            int ind = -1;
            boolean b = false;
            for(int j=i+1; j<len; j++){
                if(arr[j]>arr[i]){
                    ind = j;
                    b = true;
                    break;
                }
            }
            
            if(b){
                int small = -1;
                
                for(int j=ind+1; j<len; j++){
                    if(arr[j] < arr[ind]){
                        small = arr[j];
                        break;
                    }
                }
                
                prod = prod*small;
            }else{
                prod = prod*-1;
            }
        }
        return prod;
    }
}
