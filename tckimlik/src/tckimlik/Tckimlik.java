
package tckimlik;

import java.util.Scanner;


public class Tckimlik {

    public static void tc(int[] t){
      int diz[][]=new int[3][3];
       int x=0;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                diz[i][j]=t[x];
                x++;
            }
        }
        int st=0;
        int st2=0;
        int st3=0;
        int su=0;
        int su2=0;
        int su3=0;
            for (int i = 0; i <3; i++) {
               st=diz[0][i]+st; 
               st2=diz[1][i]+st2;
               st3=diz[2][i]+st3;
               su=diz[i][0]+su;
               su2=diz[i][1]+su2;
               su3=diz[i][2]+su3;
               
            }
        if (t[10]>=5) {
            if (su>=su2 && su>=su3) {
                System.out.println(su);
            }
            else if (su2>su3) {
                 System.out.println(su2);
            }
            else 
                 System.out.println(su3);
        }
        else{
             if (st<=st2 && st<=st3) {
                 System.out.println(st);
            }
            else if (st2<st3) {
                 System.out.println(st2);
            }
            else 
                 System.out.println(st3);
            
    
    
    }
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("lütfen tc giriniz");
         int tcno[]=new int[11];
         for (int i = 0; i < 11; i++) {
            tcno[i]=sc.nextInt();
        }
         tc(tcno);
         
    }
        
         
    
}