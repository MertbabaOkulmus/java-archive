/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int deger=1;
        Scanner k=new Scanner(System.in);
            System.out.println("lütfen bir deger giriniz");
            int a=k.nextInt();
            
                    
                    while(a>=10){
                      a=a/10;
                      deger=deger+1;
                       
                 }
                 System.out.println(deger);
               
         }
                
}    
            
                     
            /*String a=k.next();
            int b=a.length();
           System.out.println(b);*/
 
    
    
