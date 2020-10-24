/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

/**
 *
 * @author onura
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    //1 1 2 3 5 8 13 
    public static void main(String[] args) {
        int a=1,b=1;
        
            System.out.println(a);
            System.out.println(b);
        for (int i =3; i < 11; i++) {
            int x=a+b;
            a=b;
            b=x;
            System.out.println(b);
            
           // System.out.println(a);
            
          
             
             /*
             1 1 2 6 14 30
             1 2 3
             3 6 7
             7 14 15
             
             1 1 2 3 5 8 13
            
             1 1 
             2 3
             3
             */
        }      
    }    
}
