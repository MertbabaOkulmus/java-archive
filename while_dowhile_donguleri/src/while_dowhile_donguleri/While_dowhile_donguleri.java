/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_dowhile_donguleri;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class While_dowhile_donguleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
      int x=giris.nextInt();
        while(x<23){
             
        System.out.println("bitti");
          x++; 
                  
                  }
         int y=giris.nextInt();
            do {
                System.out.println("mrb");
                y++;                        
            } while (y<10);
            
        
    }
    
}
