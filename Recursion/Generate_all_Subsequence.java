/*
Description

A String is a subsequence of a given String, that is generated by deleting some character of a given string without changing its order.

You are given a string S. You have to generate all the subsequences of the string S using a recursive approach (duplicates allowed)


Input
Input Format :

First line of the input contains length of the string S

Second line of the test case contains the string S

Constraints :

n <= 18




Output
Output all the substring in a particular order. To understand the order of printing, see the sample test case explanation


Sample Input 1 

4
abcd
Sample Output 1

a
ab
abc
abcd
abd
ac
acd
ad
b
bc
bcd
bd
c
cd
d
Hint

Output Explanation :

First output all the subsequences starting with first character. When all such subsequences got printed, then move to print all such starting with second chars, and so on.
*/





import java.util.Scanner;

//time = 0(n)
//space = 0(1)

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int length = sc.nextInt();
        String str = sc.next();
        subString(str, "", count);
    }

    public static void subString(String beforeAdding, String afterAdding, int count) {
        if (count != 0) {
            System.out.print(afterAdding + " " + "\n");
        }
        for (int i = 0; i < beforeAdding.length(); i++) {
            subString(beforeAdding.substring(i + 1), afterAdding + beforeAdding.charAt(i), count + 1);
        }
    }
}
