/*

Alan & Christopher -16:27:14
Description

Its the year 1940, and the British along with the Allied forces, are being brutally assaulted on the battle field, by Hitler's Nazi Germany. The Britishers need to crack the secret communication that takes place between the German troops, with the help of their encryption device "Enigma". Alan Turing, the famous Mathematician, is assigned the task, to break the German encryption code, with his computer device "Christopher".

The communication happens in the form of strings, and the strings are organized such that, given a string "S", when fed into a text editor "#" means backspace, on a conventional keyboard. Since, everyday, Britain is getting more behind in the war, Alan asks for your help. Help Alan, break the secret communication between German Troops.

Note that after backspacing an empty text, the text will continue empty.


Input
The first line of the input contains T, the number of test cases. Each test case consists of a single line, which contains the encrypted string S.



0 <= length of string <= 100
1 <= T <= 200
Sonly contain lowercase letters and'#'characters.

Output
The output for each test case, is the decrypted string, on a new line.


Sample Input 1 

2
ab#d
a#bc
Sample Output 1

ad
bc
*/


import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            String str = sc.next();
            ArrayList<Character> arr = new ArrayList<>();
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '#'){
                    if(arr.size() !=0) arr.remove(arr.size()-1);
                }else arr.add(str.charAt(i));
            }
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i));
            }
            System.out.println();
        }
    }
}