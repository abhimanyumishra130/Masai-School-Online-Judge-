/*


*/
import java.util.Scanner;
public class ShuffleSentence {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        String[] s=str.split(" ");
        String[] st= new String[s.length];
        for(int k=0;k<s.length;k++) {
            int n=s[k].charAt(s[k].length()-1)-49;
            st[n]=s[k].substring(0,s[k].length()-1);
        }
        for (int i=0;i<s.length;i++){
            System.out.print(st[i]+" ");
        }
    }
}
