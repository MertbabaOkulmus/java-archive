/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilenkesrinturune;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Girilenkesrinturune {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner g=new Scanner(System.in);
        System.out.println("lütfen pay degerini giriniz:");
        int pay=g.nextInt();
        System.out.println("lütfen payda degerini giriniz:");
        int payda=g.nextInt();
        if (payda>pay) {
            System.out.println("Basit Kesir!!!");
        }
        else if (pay>payda) {
            int a = pay/payda;
            int b=pay%payda;
            if (b==0) {
            System.out.println("bileşik bir kesir girdiniz, kesirn degeri "+a);
            }
            else
            System.out.println("bileşik bir kesir girdiniz, kesirn degeri "+a+"+"+b+"/"+payda);
        }
        else 
            System.out.println("girdiginiz deger bir tamsayıdır");
    }
    
}
