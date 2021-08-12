/*
Description

Generate all valid parenthesis of string length 2n.


Input
1<=T<=10

1<=N<=10


Output
output N, the size of the array

and for the next  N lines all valid parantheses as described

NOTE -> SORT THE LIST BEFORE PRINTING ( print in sorted lexicographical order)


Sample Input 1 

3
3
2
1
Sample Output 1

5
((()))
(()())
(())()
()(())
()()()
2
(())
()()
1
()
*/




import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int testcase=sc.nextInt();
    for(int a=0; a<testcase; a++){
      long n=sc.nextInt();
     System.out.println(fact(2*n)/(fact(n)*fact(n+1)));
      fun("",0,0,n);
    }
  }
    public static void fun(String s, int open, int close,long n){
      if(s.length()==2*n){
        System.out.println(s);
        return;
      }
      if(open<n)  fun(s+"(",open+1,close,n);
      if(open>close) fun(s+")",open, close+1, n);

    }
  
   public static long fact(long n){
    if(n==0) return 1;
    else return n*fact(n-1);
  }
  }
