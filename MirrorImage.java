/*
Problem
Print the mirror image of the given lowercase string ayzb should become zbay
Note: mirror image does not mean reverse (The mirror image of a is z, b is y, c is x ...)

*/



int n=s.length();
        StringBuilder sb =new StringBuilder(s);
        String str="";
        for(int i=0;i<n;i++){
            char ch=sb.charAt(i);
            if(ch>=65 && ch<=90){
                int n1=90;
                for(int j=65;j<=90;j++){
                    if(ch==j){
                        sb.setCharAt(i,(char)j);
                        str=str+sb.charAt(i);
                        System.out.println(str);
                    }
                    n1--;
                    System.out.println(n1);
                }
            }else if(ch>=97 && ch<=122){
                int n1=90;
                for(int j=97;j<=122;j++){
                    if(ch==j){
                        sb.setCharAt(i,(char)j);
                        str=str+sb.charAt(i);
                    }
                    n1--;
                }
            }
        }
        System.out.println(str);
