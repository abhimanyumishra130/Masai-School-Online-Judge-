/*
*/
package optional;

import java.util.Scanner;

public class RelativeOrder {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scanner.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(ar[i]==0){
                for(int j=i;j<n-1;j++){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }

//        ArrayList<Integer> a=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            a.add(ar[i]);
//        }
//
//        int j=0;
//        while(j<n){
//            if(a.get(j)==0){
//                a.add(a.remove(j));
//
//            }
//            System.out.println(a);
//            j++;
//        }
//        System.out.println(a);
    }
}
