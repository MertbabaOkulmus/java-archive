package basamaksayisirecursive;
import java.util.Scanner;
public class BasamakSayisiRecursive {
    public static int basamak(int n){
        if ((-1<n) && n<10) {
            return 1;
        }
        else {
            return 1+basamak(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = gir.nextInt();
        System.out.println("Sayının Basamak Sayısı: " + basamak(n));
    }
    
}
