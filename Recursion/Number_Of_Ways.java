/*
Number of ways problems
Description

Sandhya is running up a staircase with N steps, and can hop(jump) either 1 step, 2 steps or 3 steps at a time. You have to count, how many possible ways Sandhya can run up to the stairs.


Input
input Format

Input contains integer N that is number of steps

Constraints

N <= 30


Output
Output Format

Output for each integer N the no of possible ways w.


Sample Input 1 

4
Sample Output 1

7
Hint

No of the ways for n=4 are:-

1 1 1 1

1 1 2

2 1 1

1 2 1

1 3

3 1

2 2


*/


import java.util.Scanner;r
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int stairs = sc.nextInt();
    System.out.print(count(stairs));
  }
  public static int count(int stairs){
    if(stairs==0) return 1;
    if(stairs==1) return 1;
    if(stairs==2) return 2;
    return count(stairs-3)+count(stairs-2)+count(stairs-1);  }
}
