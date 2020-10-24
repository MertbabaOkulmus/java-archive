package tckimlik_no;

import java.util.Scanner;

public class Tckimlik_no {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int [][]diz=new int[3][3];
        
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                diz[i][j]=t.nextInt();
            }
        }
        if (diz[2][1]>=5) {
        int sut[][]=new int [3][3];
        int sut2[][]=new int [3][3];
        int sut3[][]=new int [3][3];
        sut[0][0]=diz[0][0]+diz[1][0]+diz[2][0];
        sut2[0][1]=diz[0][1]+diz[1][1]+diz[2][1];
        sut3[0][2]=diz[0][2]+diz[1][2]+diz[2][2]; 
            if (sut[0][0]>sut2[0][1] && sut[0][0]>sut3[0][2]) {
                System.out.println("buyuksutun "+sut[0][0]);
            }
            else if (sut2[0][1]>sut3[0][2]) {
                System.out.println("buyuksutun "+sut[0][1]);
            }
            else 
                System.out.println("buyuksutun "+sut[0][2]);
                
        }
        else{
        int sat[][]=new int [3][3];
        int sat2[][]=new int [3][3];
        int sat3[][]=new int [3][3];
        sat[0][0]=diz[0][0]+diz[0][1]+diz[0][2];
        sat2[0][1]=diz[1][0]+diz[1][1]+diz[1][2];
        sat3[0][2]=diz[2][0]+diz[2][1]+diz[2][2];
            
         if (sat[0][0]>sat2[0][1] && sat[0][0]>sat3[0][2]) {
                System.out.println("buyuksatır"+sat[0][0]);
            }
            else if (sat2[0][1]>sat3[0][2]) {
                System.out.println("buyuksatır"+sat[0][1]);
            }
            else 
                System.out.println("buyuksatır"+sat[0][2]);
            
        
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(diz[i][j]);
            }
            System.out.println();
        }
    }
}
