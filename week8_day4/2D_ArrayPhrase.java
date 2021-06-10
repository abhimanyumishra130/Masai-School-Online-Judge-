/*
Description

You are given an array of n rows and m columns which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?

OJ2.png


Input
Input Format

First line: Two integer n and m, where n denotes the number of rows and m denotes the number of columns in the grid

Next n lines: Each line contains m characters which contains lower-case English letters only

Constraints

1 <= n,m <= 100


Output
Output Format

Print the number of times the word “saba” appears in the grid.


Sample Input 1 

5 5
safer
amjad
babol
aaron
songs
Sample Output 1

2
*/

//Enter code here
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    String[] ar= new String[row];
    String s="saba";
    for(int i=0;i<row;i++){
     ar[i]=sc.next();
     // sc.nextLine();
    }
    int count=0;
    for(int i=0;i<row;i++){
     for(int j=0;j<col-3;j++){
       String st="";
       st=st+ar[i].charAt(j)+ar[i].charAt(j+1)+ar[i].charAt(j+2)+ar[i].charAt(j+3);
        if(st.equals(s)){
          count++;
        }
       
     }
    }
    for(int i=0;i<col;i++){
      for(int j=0;j<row-3;j++){
        String str="";
       str=str+ar[j].charAt(i)+ar[j+1].charAt(i)+ar[j+2].charAt(i)+ar[j+3].charAt(i);
       //System.out.println(str);
        if(str.equals(s)){
          count++;
        }
      }
    }
    
    for(int i=0;i<row-3;i++){
      for(int j=0;j<col-3;j++){
        String st="";
       st=st+ar[i].charAt(j)+ar[i+1].charAt(j+1)+ar[i+2].charAt(j+2)+ar[i+3].charAt(j+3); 
        if(st.equals(s)){
          count++;
        }
      }
      for(int j=col-1;j>=3;j--){
        String st="";
       st=st+ar[i+3].charAt(j-3)+ar[i+2].charAt(j-2)+ar[i+1].charAt(j-1)+ar[i].charAt(j); 
        if(st.equals(s)){
          count++;
        }
      }
    }
    System.out.print(count);
  }
}
        
