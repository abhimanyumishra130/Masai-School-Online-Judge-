/*
Rotate the array - easy version
Description

You are given an array of n elements and an integer k, you need to rotate the array by k units towards right direction ( => ).


Input
1<=T<=10

1<=N<=1000, 0<=K<=1000

1 <= Ai <= 1000000


Output
out put N elements, elements of the array , rotated by K units


Sample Input 1 

3
3 1
1 2 3
2 2
1 2
2 3
1 2
Sample Output 1

3 1 2
1 2
2 1

*/


//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int T=s.nextInt();
    for(int i=0;i<T;i++){
      int n=s.nextInt();
      int[] ar=new int[n];
      int K=s.nextInt();
      
      for(int j=0;j<n;j++){
        ar[j]=s.nextInt();
      }
      while(K!=0){
      rotate(n,ar);
        K--;
      }
       for(int j=0;j<n;j++){
        System.out.print(ar[j]+" ");
      }
      System.out.println();
    }
  }

	public static void rotate(int n,int[] arr){
      int temp = arr[n-1];
      for(int i=n-1;i>0;i--){
        arr[i] =arr[i-1];
      }
      arr[0] = temp;
    }
}
