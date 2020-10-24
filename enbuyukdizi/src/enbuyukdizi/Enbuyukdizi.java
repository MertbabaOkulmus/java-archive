/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enbuyukdizi;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Enbuyukdizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int diz[]={91,4,5,9,7,80,76};
        /* int en_buyuk[]=new int [1];
         en_buyuk [0]=diz[0];
        for (int i=1; i <diz.length; i++) {
            if (en_buyuk[0]<diz[i]) {
               en_buyuk[0]=diz[i];
               
            }
            else 
                System.out.println(en_buyuk[0]);
                
     }  
        System.out.println(en_buyuk[0]);
        
        
       int a=0;
        for (int i =0; i <diz.length; i++) {
            a=diz[i]+a;
        }
        System.out.println(a/7);
        System.out.println(a/diz.length);*/
        
        Scanner k=new Scanner(System.in);
        int a[][]=new int [3][3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                a[i][j]=k.nextInt();
            }
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int top[][]=new int [3][3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                top[i][j]=a[i][j]+b[i][j];
            }
        }
        
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(top[i][j]);
            }
            System.out.println();
        }
        
  
        
    
}
}