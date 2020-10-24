package mathkutuphanesi;

import java.util.*;

public class Mathkutuphanesi {
       
    public static double k(double[]x){
       double top=0;
       double dizi[]= new double[3];
       //ORTALAMA
       for (int i = 0; i <=x.length-1; i++) {
            top=top+x[i];
            }
       dizi[0]=top/(x.length);
       
        //MEDYAN
        // 1 2 3 4 5
        Arrays.sort(x);
        if (x.length%2==0) {
            dizi[1]=x[((x.length)/2)-1];
        }
        else   
            dizi[1]=x[(x.length)/2+ 1/2];
     
        //MODALMA
        int a=(int) (x[x.length-1])+1;
        double mod[]=new double[a];
      //1 5 3 4 5 
      //0 1 0 1 0 2 
       for (int i = 0; i <mod.length; i++) {
           if (x[i]==i) {
               mod[i]=mod[i]+1;
           }
           
        }
        Arrays.sort(mod); 
        dizi[2]=mod[mod.length-1];
        String s[]=new String[3];
        return dizi[2];
     
  }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double []arry=new double[9];
        for (int i = 0; i <arry.length; i++) {
            arry[i]=sc.nextDouble();
        }
        
        System.out.println(k(arry));
    }
    
}
