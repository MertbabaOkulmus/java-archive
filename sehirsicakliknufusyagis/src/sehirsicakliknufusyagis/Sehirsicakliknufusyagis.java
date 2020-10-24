package sehirsicakliknufusyagis;

import java.util.Arrays;

public class Sehirsicakliknufusyagis {
    public static String k(String[][]veriler){
        int yagis[]=new int[5];
        int sicaklik[]=new int[5];
        int nufusfark[]=new int [5];
        int buyuk=Integer.MIN_VALUE;
        int x=0;
        int nufusfarki=0;
        for (int i = 1; i <5; i++) {
            int a=Integer.parseInt(veriler[i][3]);
            yagis[i]=a;
            if (buyuk<a) {
                buyuk=a;
                x=i;
            }
        }
        for (int i =1; i <5; i++) {
            if ((veriler[0][i].charAt(0))==(veriler[0][i].charAt(veriler[0][i].length()))) {
                nufusfark[i]=Integer.parseInt(veriler[i][2]);
            }
        }
        for (int i = 0; i <5; i++) {
            x=nufusfark[i]-x;
        }
        x=Math.abs(x);
        
        for (int i = 1; i <5; i++) {
             sicaklik[i]=Integer.parseInt(veriler[i][1]);
        }
        Arrays.sort(sicaklik);
        for (int i =5; i>0; i--) {
            if (sicaklik[i]==Integer.parseInt(veriler[i][1])) {
                System.out.println(veriler[i][0]);
            }
        }
  
        
    
    return veriler[x][1]+x;
    }
    public static void main(String[] args) {
     String[][]n=new String[5][3];
     String w=k(n);
     System.out.println(w);
   // System.out.println(k(n));
    }
    
}
