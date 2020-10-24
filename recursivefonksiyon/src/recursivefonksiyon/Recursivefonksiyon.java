package recursivefonksiyon;

import java.util.Scanner;

public class Recursivefonksiyon {
    
    public static int fak(int a){
        if (a==1) {
            return 1;
        }
        return fak(a-1)*a;
    
    }
    public static String kelime(String x){
        int a=x.length();
        int i=1;
        if (i>=x.charAt(a-1)) {
            return "";
        }
        i++;
        //mert
        String q=x.substring(0,x.length()-i+1);
        return x.charAt(x.length()-1)+kelime(q);
    
    }
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
    /*   System.out.print(fak(5));
       Stri ng a=k.nextLine();
       int x=1;
       String w="";
      /*  for (int i = 0; i <a.length(); i++) {
            if (a[i]==w) { 
                x++;
            } else {
            }
            
        }
        System.out.print(x);
        for (int i =a.length()-1; i>=0; i--) {
            w=w+a.charAt(i);
            
        }
        System.out.println(w);
        
 
      
    System.out.println(kelime(k.nextLine()));*/
    int a=10,b=20;
    System.out.println(Math.abs(a-100));
       
    }

    
}
