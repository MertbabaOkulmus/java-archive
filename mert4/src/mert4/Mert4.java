package mert4;


public class Mert4 {
    public static int okek(int a, int b){
        int okek=0;
        for (int i =1; i <=a*b; i++) {
            if (i%a==0 && i%b==0) {
                okek=i;
                break;
            }
        }
        return okek;
    
    }//24=1,24,12,2,3,8.
     //60=1,60,2,30,20,3,6,10.
    public static int obeb(int a, int b){
      int obeb=0;
        for (int i = 2; i <a*b; i++) {
            if (a%i==0 && b%i==0) {
                obeb=i;
                break;
            }
 
        }
    return obeb;
    }
    
    public static void main(String[] args) {
       System.out.println(okek(24,60));
    }
    
}
