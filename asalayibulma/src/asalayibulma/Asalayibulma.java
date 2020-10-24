/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalayibulma;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Asalayibulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner a=new Scanner(System.in);
            int asal=a.nextInt();
            int i=2;
            while(i<asal/2){
                if (asal%i==0) {
                    System.out.println(asal+"sayı asal degildir"); 
                    break;
                }
                System.out.println(asal+"sayı asal ");
                i++;
            }
            
            
            
         /*   for (int i =2; i <(asal/2); i++) {
                if (asal%i==0) {
                    System.out.println(asal+"sayısı asal degildir");
                    
                }
                
           }*/
    }
    
}
