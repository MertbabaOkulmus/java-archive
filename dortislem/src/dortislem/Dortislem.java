/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dortislem;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Dortislem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a=10,b=20,c=30;
        System.out.println("topplama işlemi :"+(a+b+c));
        System.out.println("carpım işlemi :"+(a*b*c));
        System.out.println("bolme işlemi:"+(a/b/c));
        System.out.println(10>>2);
        System.out.println(a<b);
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        if(x==10){
        System.out.println("a eşittri 10 ");}
        else if(x<10){
        System.out.println("a küçüktür 10 dan");}
        else { 
            System.out.println("a büyüktür 10 dan");}
       int y=s.nextInt();
        if(y>90){
        System.out.print("notunuz AA");
        }
        else if(y>70){
        
        System.out.println("notnuz BB");
        
        }
        else {
        
        System.out.println("notunuz CC");
               
        }
        
        
        
        
        
        
        
        
        
        
        
        
        }
    
}


  /*  private static void elsif(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
 