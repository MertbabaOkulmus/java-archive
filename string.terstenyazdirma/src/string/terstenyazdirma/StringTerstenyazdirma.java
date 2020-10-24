
package string.terstenyazdirma;

import java.util.Scanner;


public class StringTerstenyazdirma {

    public static String[] ters(String k ){
        String ary[]=new String[k.length()];
        for (int i = 0; i <k.length(); i++) {
            int a=k.length()-1-i;
            ary[i]=String.valueOf(k.charAt(a));
        }
       /// String l=String.valueOf(ary);
    return ary;
    }
    public static String ters2(String l){
       String k="";
        for (int i =l.length()-1; i>=0; i--) {
            k=k+l.charAt(i);
        }
        
    return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
       // String q[]=ters(a);
       // System.out.println(q);
       System.out.println(ters2(a));
    }
    
}
