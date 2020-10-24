/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cok_boyutlu_diziler;

/**
 *
 * @author onura
 */
public class Cok_boyutlu_diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // iki boyutlu bir dizi hazırlama
      int arr[][]={{1,0,1},{0,1,0},{1,0,1}};
      //iki boyutlu bir diziyi yazdırma
        for (int i = 0; i <3; i++) {
            for (int j =0; j <3; j++) {
                System.out.print(arr[i][j]+"");
            }
         System.out.println();
        }
        
      
      
    }
    
}
