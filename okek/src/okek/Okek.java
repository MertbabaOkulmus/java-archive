/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okek;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Okek {

    /**
     * @param args the command line arguments
     */
    //ortak bölenlerin en büyügü 
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int a=k.nextInt();
        int b=k.nextInt();
        int okek=0;
        int obeb=0;
        for (int i =1; i <=b*a; i++) {
            if (i%a==0 && i%b==0) {
                okek=i;
                System.out.println(okek);
                break;
            }
           
        }
        
        for (int i =1; i <=a*b; i++) {
            if (a%i==0 && b%i==0) {
                obeb=i;
                
            
              }
         
        }
        System.out.println(obeb);
    
    }
}
