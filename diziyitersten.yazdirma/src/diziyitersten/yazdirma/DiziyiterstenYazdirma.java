package diziyitersten.yazdirma;

import java.util.Scanner;

public class DiziyiterstenYazdirma {
    
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("lütfen dizinin uznlugunu giriniz: ");
    int dz[]=new int [sc.nextInt()];
    int ary[]=new int[dz.length];
        for (int i = 0; i <dz.length; i++) {
            dz[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i <dz.length; i++) {
            ary[i]=dz[dz.length-1-i];
        }
        System.out.println();
        for (int i = 0; i <dz.length; i++) {
            System.out.print(dz[i]);
        }
        System.out.println();
        for (int i = 0; i <ary.length; i++) {
            System.out.print(ary[i]);
        }
        
    
    
    
    
    }
    
}
