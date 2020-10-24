
package pkgtry.catch_finally;

public class TryCatch_finally {

    public static void main(String[] args) {
       try{
       int data=25/0;
       System.out.println(data);
       
       
       
       }
       catch(ArithmeticException e){
           
           
           System.out.println(e);      
       
       }
       finally {
       System.out.println("finally blogu daima yürütülür");
       
       System.out.println("kodun geri kalan kısmı");
       
       
       }
    }
    
}
