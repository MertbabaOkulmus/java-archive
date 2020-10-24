package atm;

import java.util.*;


public class ATM {
    public static void atm(int a){
   
    Scanner sc=new Scanner(System.in);
    double b=10000;
    while(true){
       
        if (a==1) {
            System.out.println(" Kullanıla bilir bakiye! :"+b);
            System.out.println("Lütfen çekmek istediginiz tutarı giriniz : ");
            double c=sc.nextDouble ();
            if (c>b) {
                System.out.println("Hesabınızda yeterli bakiye bulunmamakta dır !");
                break ;
            }
            b=b-c;
            break ;
        }
        else if (a==2) {
            System.out.println("Lütfen yatırmak istediginiz tutarı giriniz : ");
            double c=sc.nextDouble ();
            b=b+c;
            System.out.println(" Güncel bakiye! :"+b);
            break ;
        }
        else if (a==3) {
            System.out.println("Güncel kullanıla bilir bakiye! :"+b);
            break ;
        }
        else 
            break;
        
    
     
    
    }
    }
    
  
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("lütfen yapmak istediginiz işlem türünü belirlemek için tuşlama yapınız!!");
        System.out.println("Para Çekme: 1       Para Yatırma: 2 \nBakiye sorgulama: 3        Çıkış: 4");
       int x=sc.nextInt();
       atm(x);
    }
    
}
