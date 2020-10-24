/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karakkokbulma;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Karakkokbulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner a=new Scanner(System.in);
        
       double b=a.nextInt();
        if (b<0) {
            System.out.println("Lutfen pozitif bir sayı giiniz!!");
            
        }
        else{
        
        System.out.println(b+"  nin kara köku  "+ Math.sqrt(b));
        
        }
        
    }
    
}
