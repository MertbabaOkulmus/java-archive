package metodlar;

import java.util.Scanner;

public class Metodlar {
    public static void k(){
    System.out.println("meraaba");
    System.out.println("merabana meraba kardeş");
    }
    public static int fak(int a){
        int top=1;
        for (int i =1; i <=a; i++) {
            top=top*i;
          
        }
        return top;
    }
    public static void fakt(){
    Scanner a=new Scanner(System.in);
    System.out.println("sayı:");
    int fak=a.nextInt();
    int carp=1;
        for (int i =fak; i >0; i--) {
            carp=carp*i;
        } 
    System.out.println("deger"+carp);
    }
    
    public static String selam(String k){
    
      System.out.println(k);
    
    return k;
    }
    public static void carp(int a,int c,int d){
    System.out.println("carpım: "+(a*c*d));
    
    }
    
    
    
    public static void main(String[] args) {
       System.out.println(fak(9));
       fakt();
       System.out.println(selam("mert"));
       carp(3,2,1);
    }
    
}
