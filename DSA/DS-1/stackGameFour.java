/*
Stack game IV Ended
Description

Given a string S having characters '(', ')' with '(' occurring N times and ')' occurring M times, inside the strings. Let us traverse the given string S using a stack, as per the following rule:

If a character '(' is encountered while traversal, push it inside the stack.
If ')' is encountered while traversal, then:
If the stack is empty, the game ends with a score of -1.
Else, delete the top element of the stack.
At last, the score of the game is the number of characters that remained inside the stack.
Check whether the final score of the game is odd or not.

Note - If the final score is -1, print "no" (without quotes).


Input
First line: Single integer denoting the value of T - the number of test cases.

For each test case:

First line: Two single space-separated integers denoting the value of N and M.

Next line: Single string of length N+M, denoting string S.

Constraints:

1 <= T <= 100
1 <= N,M<= 100


Output
For each test case, print in a new line, "yes" (without quotes) if the score is odd, otherwise print "no" (without quotes).


Sample Input 1 

3
4 3
()(())(
1 1
()
1 2
())
Sample Output 1

yes
no
no
Hint

Given test cases,

Test 1:
N = 4, M = 3.
S = ()(())(.
Let stk be the stack. Let's start the traversal:
Index 1 - '(' --> Push inside stk, stk = { '(' }.
Index 2 - ')' --> Delete the top element. Present stack stk = { '(' }. Hence after deletions, stack will be: stk = { }, i.e. it wil bcome empty.
Index 3 - '(' --> Push inside stk, stk = { '(' }.
Index 4 - '(' --> Push inside stk, stk = { '(', '(' }.
Index 5 - ')' -->Delete the top element. Present stack stk = { '(' , '(' }.Hence after deletion, stack will be: stk = { '(' }, i.e. one '(' will be deleted.
Index 6 - ')' -->Delete the top element. Present stack stk = { '(' }. Hence after deletions, stack will be: stk = { }, i.e. it wil bcome empty.
Index 7 -'(' --> Push inside stk, stk = { '(' }.

After this, there is no character to traverse. Since only one character remains inside the stack stk, the final game of the score is 1, which is odd. Hence the answer is "yes".

Test 2:
N = 1, M = 1.
S = ().

Let stk be the stack. Let's start the traversal:
Index 1 - '(' --> Push inside stk, stk = { '(' }.
Index 2 - ')' -->Delete the top element. Present stack stk = { '(' }. Hence after deletions, stack will be: stk = { }, i.e. it wil bcome empty.
Since the stack is empty after the last character the final score is 0. Hence the answer is "no".

Test 3:
N = 1, M = 2.
S = ()).

Let stk be the stack. Let's start the traversal:
Index 1 - '(' --> Push inside stk, stk = { '(' }.
Index 2 - ')' -->Delete the top element. Present stack stk = { '(' }. Hence after deletions, stack will be: stk = { }, i.e. it wil bcome empty.
Index 3 - ')' -->Delete the top element. Present stack stk = { }. Since the stack is empty, the game will end with a score of -1.
Since the final score is -1. Hence the answer is "no".
*/

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String ch = sc.next();
            
            Stack<Character> stack = new Stack<>();
            int score = 0;
            for(int i=0; i<ch.length(); i++){
                if(ch.charAt(i)== '('){
                    stack.push(ch.charAt(i));
                    score = score+1;
                } 
                else{
                    if(stack.isEmpty()){
                        score = -1;
                        break;
                    }else{
                        stack.pop();
                        score = score-1;
                    }
                }
            }
            if(score == -1) System.out.println("no");
            else if(score%2 == 0) System.out.println("no");
            else System.out.println("yes");
        }
    }
}
