/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vucutkitleendeksi;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Vucutkitleendeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("lütfen boyunuzu giriniz:");
        int boy=x.nextInt();
        System.out.println("lütfen kilonuzu giriniz:");
        int kilo=x.nextInt();
        int oran=boy/kilo;
        if (oran<2) {
            System.out.println("Şişman:(");
        }
        else if (oran<2.5) {
            System.out.println("orta :);)");
            
        }
        else
            System.out.println("zayıf :)");
        
    }
    
}
