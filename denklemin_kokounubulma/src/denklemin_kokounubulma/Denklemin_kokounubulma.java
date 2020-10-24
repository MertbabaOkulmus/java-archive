/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denklemin_kokounubulma;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Denklemin_kokounubulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
       double a= x.nextInt(),b= x.nextInt(),c= x.nextInt();
       double delta=(b*b) - (4*a*c);
       double x1=0,x2=0;
        if (delta<0) {
            System.out.println("reel kök yoktur!!!");
        }
        else if (delta>0) {
           x1= (-b-Math.sqrt(delta)) /2*a ;
           x2= (+b-Math.sqrt(delta)) /2*a ;
           
           System.out.println(x1);
           System.out.println(x1);
            
        }
        else {
           x1=(-b-Math.sqrt(delta)) /2*a;
           
           System.out.print(x1);
        
        }
    }

}      
       
        
    
