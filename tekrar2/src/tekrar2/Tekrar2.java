
package tekrar2;

import java.util.Arrays;
import java.util.Scanner;


public class Tekrar2 {
    public static double ornek(double[]x){
        Arrays.sort(x);
        double top=0,ort=0;
        double ary[]=new double[3];
        double diz[]=new double[(int)x[x.length-1]];
        for (int i = 0; i <diz.length; i++) {
            if (x[i]==i) {
                diz[i]=diz[i]+1;
            }
            
        }
        Arrays.sort(diz);
        
           for (int i = 0; i <x.length; i++) {
            top=top+x[i];
        }
        
        ort=top/x.length;
        ary[0]=ort;
        ary[1]=x[x.length/2];
        ary[2]=diz[diz.length-1];
        
        return ary[0]+ary[1]+ary[2];
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           double dz[]=new double[3];
           for (int i = 0; i <3; i++) {
            dz[i]=sc.nextDouble();
        }
          
        double ary=ornek(dz);
           System.out.println(ary);
        
        
    }
    
}
