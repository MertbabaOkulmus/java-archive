/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swichcase;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Swichcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a=  new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz1!!");
        int x=a.nextInt();
        
        switch(x){
            case 10:System.out.println("10");
            break;
            case 20:System.out.println("20");
            break;  
            default: System.out.println("yanlış sayı!!");
        
        
        }
        
    }
    
}
