package math.kutuphane;

import java.util.*;

public class MathKutuphane {
  public static String verim(String [][]veriler){
      
      for (int i =1; i <5; i++) {
          int enb[]=new int[5];
          int c;
          int a=Integer.parseInt(veriler[i][3]);
          int b=Integer.parseInt(veriler[i+1][3]);
          if (a>b) {
              c=a;
              a=b;
              b=c;
          }
           String w=String.valueOf(b);
        } 
      
      
     return "";
      }
    
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
       String veri[][] =new String[6][4];
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <4; j++) {
                veri[i][j]=a.nextLine();
            }
        }
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print(veri[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i <5; i++) {
          Arrays.sort(veri);
      }
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print(veri[i][j]);
            }
            System.out.println();
        }
      
        
     //   System.out.println("\n " +verim(veri));
        
    }
    
}
