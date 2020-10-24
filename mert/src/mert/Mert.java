package mert;

import java.util.Arrays;

public class Mert {
    public static void yaz(boolean kontrol){
        if (kontrol==true) {
             for (int i =12; i <57; i=i+11) {
                
                System.out.print(i+" ");
              }
        }
        else 
            for (int i =97; i <102; i++) {
                char a=(char) (i);
                char b=(char) (i+1);
                System.out.print(a);
                System.out.print(b+" ");
              }
       }
    public static int[] ortakbul( int diz[], int ary[]){
        int ortak[]=new int[diz.length];
        int inds=0;
         for (int i = 0; i <diz.length; i++) {
             if (diz[i]==ary[i]) {
               ortak[inds]=diz[i];  
               inds++;
             }
        }
         return ortak;
    }
    public static double[] bul(double[] veriler){
       Arrays.sort(veriler);
       double sonc[]=new double [3];
       sonc[0]=Integer.MIN_VALUE;
       sonc[1]=Integer.MAX_VALUE;
       sonc[2]=0;
       double top=0;
       sonc[0]=veriler[veriler.length-1];
       sonc[1]=veriler[0];
        for (int i = 0; i <veriler.length; i++) {
            top=veriler[i]+top;
        }
        sonc[2]=top/veriler.length;
        
       return sonc;
    }
    public static double[] bul2(double[] veriler ){
    double sonc[]=new double[3];
    double buyuk=Integer.MIN_VALUE;        
    double kucuk=Integer.MAX_VALUE;
    double ort=0,top=0;                       
        for (int i = 0; i <veriler.length; i++) {
            top=top+veriler[i];
            if (buyuk<=veriler[i]) {
                buyuk=veriler[i];
            }
            if (kucuk>veriler[i]) {
                kucuk=veriler[i];
            }
                
        }
        ort=top/veriler.length;
        sonc[0]=buyuk;
        sonc[1]=kucuk;
        sonc[2]=ort;
        return sonc;
     
    }//  double dze[]={13,2,3,4,5,6,9,8,7};
    public static double[] asal(double[] veriler){
        double sayilar2[]=new double[veriler.length];
        int sayc=0;
        boolean asal=true;
         for (int i = 0; i <veriler.length; i++) {
             for (int j =2; j <veriler[i]/2; j++) {
                 if (veriler[i]%j==0) {
                     asal=false;
                     break;
                 }
                 else {
                 sayilar2[sayc]=veriler[i];
                 sayc++;
                 break;
                 }
             }
            
        }
         return sayilar2;
    }
   
    public static void main(String[] args) {
            yaz(true);   
          System.out.println("\n***");
            yaz(false);
          System.out.println("\n***");
          int dizi[]={1,2,34,56,9,8,7,23}; 
          int aryy[]={1,2,3,4,5,6,7,23};   
          int ort[]=ortakbul(dizi,aryy);
          for (int i = 0; i <ort.length; i++) {
            System.out.print(ort[i]+" ");
        }
        System.out.println("\n***");
        double dz[]={1,2,3,4,5,6,9,8,7};
        double as[]=bul(dz);
        for (int i = 0; i <as.length; i++) {
            System.out.print(as[i]+" ");
        }
        System.out.println("\n***");
        double dze[]={13,2,3,4,5,6,9,8,7};
        double se[]=bul2(dze);
        for (int i = 0; i <se.length; i++) {
            System.out.println(se[i]+" ");
        }
        System.out.println("**asal**");
        double swe[]=asal(dze);
        for (int i = 0; i <swe.length; i++) {
            System.out.println(swe[i]);
        }
 
        
     
    }
    
}
