package recursivefonksiyonlar;


 public class Recursivefonksiyonlar {
//toplama
     public static int k(int a){
         if (a==1) {
             return 1;
            }
        else 
            System.out.println(a+"degeri");

             return a+k(a-1);
         
      
     }
     // fibonacci
     public static void fibonacci(int c){
         int a=1;
         int b=1;
         System.out.println(a);
         System.out.println(b);
         for (int i = 2; i <c; i++) {
             int f=a+b;
             a=b;
             b=f;
             System.out.println(b);
             
         }
     
     
     }
     //fibonacci
     public static int fibo(int a){
         //System.out.println("*"+a);
         if (a==1) 
             return 1;
         else if (a==2) {
             return 1;
         }
         else
             
             return fibo(a-1)+fibo(a-2);
         
     
     }
     
     
     
    public static void main(String[] args) {
   System.out.println(k(10));
   fibonacci(8);
   System.out.println(fibo(8));
    
    }
    
}
