/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stingsinifitekrar;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Stingsinifitekrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println();
        int x=sc.nextInt();
        for (int i =1; i <=x; i++) {
            for (int j =1; j <11; j++) {
                int carp=i*j;
                System.out.println(" "+carp+" ");
            }
            System.out.println(" ");
           
        }
    }
    
}
