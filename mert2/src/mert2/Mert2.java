package mert2;

import java.util.Scanner;

public class Mert2 {
        /*123
          654
          987*/
    public static int kosegen(int diz[][]){
        
        int syc=0;     
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                if (i==j) {
                    syc=diz[i][j]+syc;
                }
            }
        }
        syc=diz[0][2]+diz[1][1]+diz[2][0]+syc;
          return syc;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int diz[][]=new int [3][3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                diz[i][j]=sc.nextInt();
            }
        }
        System.out.println(" ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(diz[i][j]);
            }
            System.out.println();
        }
        
       int ary=kosegen(diz);
          System.out.println(ary);
          
        
        
    }
    
}
