/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maas_hesaplama;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Maas_hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner k= new Scanner(System.in);
       
       int satis_miktari = k.nextInt();
       
       int maas=0,bonus=0;
       
       
        if (satis_miktari<50) {
            
            maas=((satis_miktari*15)+(satis_miktari));
        }
        else if (satis_miktari>=50 && satis_miktari<=100) {
            
            maas=((satis_miktari*15)+(2*satis_miktari));
        }
        else {
            
            maas=(satis_miktari*15)+(3*(satis_miktari-100))+200;
        
                  
        }
         
       System.out.println("NetMaas:"+maas);
            
        }
       
        
    }