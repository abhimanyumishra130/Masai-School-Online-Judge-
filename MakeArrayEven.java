/*
Make array even
Description

Given an array, you are allowed to do a single kind operation as many times as you want, choose 2 coordinates i, j

and reassign , ai = aj . Can you make the Sum of the array even. print YES or NO


Input
1<=T<=10

1<=N<=100000

0<=Ai<=100000


Output
output YES or NO as the question states


Sample Input 1 

2
1
2
3
1 2 3
*/


//Enter code here
import java.util.Scanner;
class Main{
  public static int  addSum(int[] ar,int n){
    int sum=0;
    for(int i=0;i<n;i++){
      sum+=ar[i];
    }
    return sum;
  }
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    for(int i=0; i<testCase; i++) {
      int len = sc.nextInt();
      int sum = 0;
      int[] ar = new int[len];
      for(int j=0; j<len; j++) {
        ar[j] = sc.nextInt();
      }
      boolean b=false;
      if(addSum(ar,len)%2==0){
        b=true;
      }
      else if(len==1){
        b=false;
      }
      else{
        for(int j=0;j<len;j++){
          if(ar[j]%2==0){
            b=true;
            break;
          }
        }
      }
      if(b){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}
     
     
