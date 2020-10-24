/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fordongusu;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Fordongusu {

    /**
     * @param args the command line arguments
     */
    //faktöiyel hesaplama programı yapılmıştır. 
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int son=x.nextInt();
        long top=1;
        for (int i = 1; i <=son ; i++) {
           top=i*top;
            
           }
        System.out.println(top);
    }
    
}
