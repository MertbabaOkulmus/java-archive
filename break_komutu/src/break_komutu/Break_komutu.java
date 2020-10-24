/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_komutu;

/**
 *
 * @author onura
 */
public class Break_komutu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aa:
        for (int i = 1; i <=4; i++) {
            bb:
            for (int j =1; j <=4; j++) {
                if (i==2 && j==2) {
                    break bb; 
                }
                System.out.println(i+ " "+j);
            }
        }
        
        
        for (int x = 1; x < 10; x++) {
            cc:
            if (x==5) {
               /* x++;
               break cc;*/
               continue ;   
            }
            System.out.println(x);
        }
        
       /*
        1 1 
        1 2
        1 3 
        1 4
        2 1 
        
        3 1
        3 2
        3 3
        3 4
        
         
        
        
        
        
        */ 
        
        
    }
    
}
