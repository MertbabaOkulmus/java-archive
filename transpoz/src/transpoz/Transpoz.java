package transpoz;

import java.util.Scanner;

public class Transpoz {
     //101
     //010
     //101
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int aryy[][]=new int[3][3];
      int traspoz[][]=new int[3][3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                aryy[i][j]=sc.nextInt();
                traspoz[i][j]=aryy[i][j];
            }
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(aryy[i][j]);
            }
            System.out.println();
        }
      /*  for (int i = 0; i <3; i++) {
            traspoz[0][i]=aryy[i][0];
            traspoz[i][0]=aryy[0][i];
        }*/
      System.out.println("***************************");
        for (int i =0; i <3; i++) {
            for (int j =0; j<3 ; j++) {
                System.out.print(traspoz[j][i]);
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 
        

    }
    
}
