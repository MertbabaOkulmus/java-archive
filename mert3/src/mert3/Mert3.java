
package mert3;



public class Mert3 {
// 1*1 + 2*2 + 3*3 = toplam 14 
    public static int toplam(int i){
        int top=0;
        for (int j = 0; j <=i; j++) {
            top=(int)Math.pow(j,2)+top;
           
        }
        return top;
    
    
    }
    public static int topla(int i){
        int top=0;
        if (i==0) {
            return 0;
        }
        else if (i==1) {
            return 1;
        }
        return (i*i)+topla(i-1);
    
    }
    public static void main(String[] args) {
        System.out.println("normal");
        System.out.println(toplam(7));
        System.out.println("recursive");
        System.out.println(topla(7));
    }
    
}
