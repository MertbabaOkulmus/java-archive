/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xgunsonrahaftaninhangigunu;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Xgunsonrahaftaninhangigunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       System.out.println("lüfen 1 ile 365 rası bir sayı giriniz:");
       Scanner x=new Scanner(System.in);
       
       int a=x.nextInt();
       
       while (a<1 || a>365) {
            
           System.err.println("lütfen kriterlere uygun sayı giriniz");
           a=x.nextInt();
        }
         if (a%7==0) {
             System.out.println("Bugun cumartesi "+a+" gün sonra haftanın cumartesi günü dür");  
           }
           else if (a%7==1) {
              System.out.println("Bugun cumartesi "+a+" gün sonra haftanın pazar günü dür");  
           }
           else if (a%7==2) {
               System.out.println("Bugun cumartesi "+a+" gün sonra haftanın pazartesi günü dür"); 
           }
           else if (a%7==3) {
                System.out.println("Bugun cumartesi "+a+" gün sonra haftanın salı günü dür");
           }
           else if (a%7==4) {
                System.out.println("Bugun cumartesi "+a+" gün sonra haftanın çarsamba günü dür");
           }
           else if (a%7==5) {
                System.out.println("Bugun cumartesi "+a+" gün sonra haftanın perşembe günü dür");
           }
           else 
                System.out.println("Bugun cumartesi "+a+" gün sonra haftanın cuma günü dür");
       
       
      
    }
    
}
