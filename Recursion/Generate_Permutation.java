/*
Generate Permutations Ended
Description

Given a collection of numbers, return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.

For the purpose of this problem, assume that all the numbers in the collection are unique.

USING BUILT-IN LIBRARY FUNCTION TO PERMUTE WILL LEAD TO DISQUALIFICATION


Input
Input Format :

The first line of input contain an integer n - denoting the size of array

The next line contain n distinct integers, A[1],A[2]...A[N]

Constraints :

1<= n <=6




Output
Print the permutations of numbers in new line seperated by space, also make sure the permutations are printed in sorted order that is "1 2 3" must come before "2 3 1". Print without quotes. See sample test case for better understanding.


Sample Input 1 

3
1 2 3
Sample Output 1

1 2 3 
1 3 2 
2 1 3 
2 3 1 
3 1 2 
3 2 1
*/

import java.util.*;
class Main{
    private static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i] = sc.nextInt();
        permutation(arr,0);
        
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        list.clear();
    }
    
    public static void permutation(int[] arr, int ind){
        if(ind == arr.length-1){
            String str = "";
            for(int i=0; i<arr.length; i++){
               str += arr[i]+" ";
            }
            list.add(str);
        } 
        
        for(int i=ind; i<arr.length; i++){
            swap(arr,ind,i);
            permutation(arr,ind+1);
            swap(arr,ind,i);
        }
    }
    
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
