/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffer;

/**
 *
 * @author onura
 */
public class Stringbuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StringBuffer k=new StringBuffer("hello");
      //k.append(" world");
   //    k.insert(2,"ll");
       //k.replace(2,4,"a");
      // k.delete(0,5);
       System.out.println(k);
       k.reverse();
         System.out.println(k);
      // System.out.println(k.capacity());
    }
    
}
