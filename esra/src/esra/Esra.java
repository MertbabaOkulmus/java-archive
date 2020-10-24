package esra;
import java.util.Scanner;
public class Esra {
    public static void main(String[] args) {
   Scanner a = new Scanner(System.in);
   int ary[][]=new int[3][3];
        for (int i = 0; i <3; i++) {
             for (int j = 0; j <3; j++) {
                ary[i][j]=a.nextInt();
            }
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(ary[i][j]);
            }
            System.out.println();
        }
        System.out.println("****************************");
        
        for (int i = 0; i < 3; i++) {
            int buffer=0;
            for (int j = 0; j < 3; j++) {
                for (int k = j+ 1; k < 3; k++) {
                    if (ary[i][j] > ary[i][k]){
                       buffer = ary[i][j];
                       ary[i][j] = ary[i][k];
                       ary[i][k] = buffer;       
                    }
                }
            }
            
        }
        for (int i = 0; i <3; i++) {
            for (int j = 2; j >=0 ; j--) {
                System.out.print(ary[i][j]);
            }
            System.out.println();
        }
        
        
//        
//        for (int i = 0; i <2; i++) {
//            
//            if (ary[0][i]<=ary[0][i+1]) {
//                
//                ary[0][i]=ary[0][i+1];
//              // ary[0][i+2]=ary[0][i];
//            }
//        }
//        for (int j =0; j <2; j++) {
//            
//            if (ary[1][j]<ary[1][j+1]) {
//                
//                ary[1][j]=ary[1][j+1];
//               // ary[1][j+2]=ary[1][j];
//            }
//       
//        }
//        for (int j =0; j <2; j++) {
//            
//            if (ary[2][j]<ary[2][j+1]) {
//                
//                ary[2][j]=ary[2][j+1];
//               // ary[2][j+2]=ary[2][j];
//            }
//       
//        }
//        
        
        
        
        
        
//        
//         for (int i =0; i <3; i++) {
//            for (int j = 0; j <3; j++) {
//                System.out.print(ary[i][j]);
//            }
//            System.out.println();
//        }
//       
//        
       
    
    }
    
}
