/*



*/
import java.util.Scanner;

public class NiceString {
    public static boolean stringPresent(String str , int i) {
        boolean b = false;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == str.charAt(i) + 32) {
                b = true;
                break;
            }
        }
        return b;
    }
    public static boolean niceString(String str){
        boolean b=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<=90 && str.charAt(i)>=65) {
                b = stringPresent(str,i);
                if(b==false){
                    b=false;
                    break;
                }
            }
        }
        return b;
    }
    public static boolean stringPresentLo(String str , int i) {
        boolean b = false;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == str.charAt(i) - 32) {
                b = true;
                break;
            }
        }
        return b;
    }
    public static boolean niceString2(String str){
        boolean b=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<=122 && str.charAt(i)>=97) {
                b = stringPresentLo(str,i);
                if(b==false){
                    b=false;
                    break;
                }
            }
        }
        return b;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean b=false;
        boolean B=false;
        int count =0;
        int max=0;
        String new_str="";
        String s= scanner.next();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                String str="";
                for(int k=i;k<=j;k++){
                    str=str+s.charAt(k);
                }
                 b=niceString(str);
                 B=niceString2(str);

                if(b && B){
                    count=str.length();

                   // System.out.println(str);
                    if(count>max){
                        max=count;
                        new_str=str;

                    }
                }
            }
        }
        System.out.println(new_str);
    }
}
