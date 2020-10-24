/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizideki_enbuyuk_elamani_bulma;

import java.util.Scanner;

/**
 *
 * @author onura
 */
public class Dizideki_enbuyuk_elamani_bulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // DİZİ DEGERLERİ VE DİZİ BOYUTU DISARDAN GİRİLİYOR
    
    Scanner x=new Scanner(System.in);
    
    int en_kucuk;
       System.out.println("Lütfen dizi boyutunu belirleyiniz!!:");  
       int z=x.nextInt();  
       int [] dizi =new int[z];
       
       System.out.println("Lütfen " +z+ " adet dizi degeri belirleyiniz!!:");
       for (int i = 0; i <z; i++) {
           
          dizi[i]=x.nextInt();
          
        }
        System.out.println("dizi degerleri sıralanıyor");
        for (int j = 0; j <z; j++) {
           
            System.out.print(" "+dizi[j]+",");
           
        }
      
       en_kucuk=dizi[0];
        for (int y =1; y <z; y++) {
            if (en_kucuk>dizi[y]) {
                en_kucuk=dizi[y];
            }
        }
        System.out.println(" ");
        System.out.println("dizinin en küçük elamanı:"+en_kucuk);
        
        
        
    
        
        
        
    // DİZİ DEGERLERİ DIŞARDAN , DİZİ BOYUTU İÇERDEN GİRİLİYOR  
    /*   Scanner x=new Scanner(System.in);
       int en_buyuk;
       
       int [] diz =new int[4];
       System.out.println("lütfen 4 adet dizi degeri giriniz!:");
       for (int i = 0; i <4; i++) {
           
          diz[i]=x.nextInt();
          
        }
       System.out.println("girilen degelerin liste hali");
        for (int z = 0; z < 4; z++) {
           System.out.print(diz[z]);
          
        }
       en_buyuk=diz[0];
        for (int y = 1; y <4; y++) {
            if (en_buyuk<diz[y]) {
                en_buyuk=diz[y];
            }
            
        }
       
        System.out.println("");
        System.out.println("enbüyük dizi degeri:"+en_buyuk);
    */
        
       
       
         
    }
    
}
