package devenaneanne;

import java.util.Scanner;

public class Devenaneanne {
    /*anne
      nane
      deve */ 
   // 00 01 02 03 ,30 31 32 32 
    
   // 00 10 20 30 ,03 13 23 33 
    public static void bulmaca (String bul[][]){
         
        for (int i = 0; i <4; i++) {
            if (bul[3][i]=="e") {
                if (bul[0][i]=="d" || bul[0][i]=="n" || bul[0][i]=="a") {
                 //  k=("0"+i+" 3"+i)+k;
                   System.out.print(i+"0 "+i+"3");  
                }
            } }
        for (int i = 0; i <4; i++) {
            
        
             if (bul[i][3]=="e") {
                if (bul[i][0]=="a" || bul[i][0]=="d" || bul[i][0]=="n") {
                  System.out.print(i+"0 "+i+"3");  
                }
            }
       
     }
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String [][]bul=new String[4][4];
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                bul[i][j]=sc.nextLine();
            }
        }
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print(bul[i][j]);
            }
            System.out.println();
        }
        
   //  String we=bulmaca(bul);  
     // System.out.println(we);
     
     bulmaca(bul);
    }
    
}
