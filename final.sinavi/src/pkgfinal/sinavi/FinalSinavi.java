package pkgfinal.sinavi;

import java.util.Scanner;

public class FinalSinavi {
    // 1 1  2 3 5 8 13 
    // 0 1  2 3 4 5 6
     public static int recursive (int a){
         if (a==1) {
             return 1;
         }
         else if(a==0)
             return 1;
         
         
      return recursive(a-2)+recursive(a-1);
     
     }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println(recursive(sc.nextInt()));
      System.out.println("***********************");
      int k=sc.nextInt();
      int a=0;
      int b=1,c=1;
      System.out.println(b);
    //  System.out.println(c);
      
        for (int i =2; i <k; i++) {
           
            b=c;
            c=c+1;
            c=a+b; 
           
            
           // System.out.println(b);
 
            System.out.println(c);
  
        }
              
    }
    
}
