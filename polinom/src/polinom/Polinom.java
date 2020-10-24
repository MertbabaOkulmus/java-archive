/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinom;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Polinom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
       System.out.println("lütfen x degeri girin");
       double x=a.nextInt();
       double y=0;
       System.out.println("lütfen polinom katsayı degerlerinin adedini giriniz");
       int k=a.nextInt();
       System.out.println("lütfen polinom katsayı degerlerinin giriniz");
       double diz[]=new double[k];
        for (int i = 0; i <k; i++) {
            diz[i]=a.nextInt();
        }
        for (int i = 0; i <k; i++) {
            
         y = y+(diz[i]*Math.pow(x,i));

        }
        System.out.println(y);
    
    
    }
    
}
