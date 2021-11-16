/*
Description

Given n strings S1, S2, ... , Sn. Find the number of pairs i,j where i<j and i and j both range from 1 to n such that Si is an anagram of Sj.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 100000).

The next n lines of each test case contain a string Si whose length is 10.


Output
For each test case, print the answer: The number of pairs.


Sample Input 1 

2
5
aaaaabbbbb
baabbbbaaa
aaaabbbbba
xxxxxxxxxy
yxxxxxxxxx
2
abcdefghij
jighdefabc


Sample Output 1

4
1
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests--!=0) {
            int n = sc.nextInt();
            String[] ar = new String[n];
            for(int i=0; i<n; i++) {
                ar[i] = sc.next();
            }
            System.out.println(pairs(ar));
        }
    }
    public static int pairs(String[] ar) {
        HashMap<String, Integer> hash = new HashMap<>();
        int pairCount = 0;
        for(int i=0; i<ar.length; i++) {
            char[] ch = ar[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(hash.containsKey(str)) {
                hash.put(str, hash.get(str)+1);
            } else {
                hash.put(str, 1);
            }
        }
        for(Map.Entry<String, Integer> map: hash.entrySet()) {
            pairCount = pairCount + (map.getValue()*(map.getValue()-1))/2;
        }
        return pairCount;
    }
}
