/*
Description

You are given an array of n rows and m columns which contains positive integers and sum s

You need to find occurrences of the sum of three consecutive numbers (i.e x,y, and z ) whose sum is equal to s appear horizontally, vertically and diagonally in the given matrix.

Image


Input
Input Format

First line: Three integers n, m and s, where n denotes the number of rows, m denotes the number of columns in the matrix and s is the sum.

Next n lines: Each line contains m characters which contain positive integers only.

Constraints

1 <= n,m < 10

1 <= s <= 50


Output
Print the number of times the sum s appear in the matrix.


Sample Input 1 

3 3 6
3 2 1
2 2 2
1 5 1
Sample Output 1

4
Hint

Sample 1 Explanation

here s is 6 presents 4 times( 2 Horizontal + 1 Vertical + 1 Diagonal)


*/

//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int sum = sc.nextInt();
    int[][] ar= new int[row][col];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        ar[i][j]=sc.nextInt();
      }
    }
    int count=0;
    for(int i=0;i<row;i++){
      for(int j=0;j<col-2;j++){
        if(ar[i][j]+ar[i][j+1]+ar[i][j+2]==sum){
          count++;
         // System.out.println(i+" "+j);
        }
        if(ar[j][i]+ar[j+1][i]+ar[j+2][i]==sum){
          count++;
          //System.out.println(i+" "+j);
        }
      }
    }
    for(int i=0;i<row-2;i++){
      for(int j=0;j<col-2;j++){
        if(ar[i][j]+ar[i+1][j+1]+ar[i+2][j+2]==sum){
          count++;
         // System.out.println(i+" "+j);
        }
      }
      for(int k=col-1;k>=2;k--){
        if(ar[i][k]+ar[i+1][k-1]+ar[i+2][k-2]==sum){
          count++;
         // System.out.println(i+" "+j);
        }
      }
    }
   
    System.out.print(count);
  }
}
    
        
