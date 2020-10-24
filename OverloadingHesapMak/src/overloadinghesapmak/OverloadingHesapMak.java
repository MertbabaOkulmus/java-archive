package overloadinghesapmak;

import java.util.Scanner;

public class OverloadingHesapMak {
    public static int toplama(int a, int b){
        return (a+b);
    }
    public static int toplama(int a, int b, int c){
        return (a+b+c);
    }
    public static int cikarma(int a, int b){
        return (a-b);
    }
    public static int carpma(int a, int b){
        return (a*b);
    }
    public static int carpma(int a, int b, int c){
        return (a*b*c);
    }
    public static double bolme (int a, int b){
        return ((double) a/b);
    }
    
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        String islemler = "1. Toplama İşlemi\n" + "2. Çıkarma İşlemi\n" + "3. Çarpma İşlemi\n" + "4. Bölme İşlemi\n" + "Çıkmak İçin 'q' Basın ";
        
        System.out.println("------------------------------");
        System.out.println(islemler);
        System.out.println("------------------------------");
        
        while(true){
            
            System.out.print("İşlem Seçiniz: ");
            String islem = gir.nextLine();
            
            if (islem.equals("1")) {
                
                System.out.print("Kaç Değer Toplayacaksınız ? (2 veya 3): ");
                int kacsayi = gir.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = gir.nextInt();
                    System.out.print("b: ");
                    int b = gir.nextInt();
                    gir.nextLine();
                    
                    System.out.println("Girilen sayıların toplamları: " + toplama(a,b));
                }
                
                else if (kacsayi == 3) {
                    
                    System.out.print("a: ");
                    int a = gir.nextInt();
                    System.out.print("b: ");
                    int b = gir.nextInt();
                    System.out.print("c: ");
                    int c = gir.nextInt();
                    gir.nextLine();
                    
                    System.out.println("Girilen sayıların toplamı: " + toplama(a,b,c));
                }
                
                else {
                    
                    System.err.println("Lütfen Belirtilen Koşulları Giriniz..");
                    
                }
            }
            
            
            else if (islem.equals("2")) {
            
                System.out.print("a: ");
                int a = gir.nextInt();
                System.out.print("b: ");
                int b = gir.nextInt();
                gir.nextLine();
                
                System.out.println("Girilen sayıların farkı: " + cikarma(a, b));
            }
            
            
            else if (islem.equals("3")) {
                
                System.out.print("Kaç değer çarpacaksınız ? (2 veya 3): ");
                int kacsayi = gir.nextInt();
                
                if (kacsayi == 2) {
                    
                    System.out.print("a: ");
                    int a = gir.nextInt();
                    System.out.print("b: ");
                    int b = gir.nextInt();
                    gir.nextLine();
                    
                    System.out.println("Girilen sayıların çarpımı: " + carpma(a, b));
                    
                }
                
                else if (kacsayi == 3) {
                    
                    System.out.print("a: ");
                    int a = gir.nextInt();
                    System.out.print("b: ");
                    int b = gir.nextInt();
                    System.out.print("c: ");
                    int c = gir.nextInt();
                    gir.nextLine();
                    
                    System.out.println("Girilen sayıların çarpımı : " + carpma(a, b, c));
                }
                
                else {
                    
                    System.err.println("Lütfen Belirtilen Koşulları Giriniz..");
                    
                }
            }
            
            else if (islem.equals("4")) {
                
                System.out.print("a: ");
                int a = gir.nextInt();
                System.out.print("b: ");
                int b = gir.nextInt();
                gir.nextLine();
                
                System.out.println("Girilen sayıların bölümü: " + bolme(a, b));
                
            }
            
            else if (islem.equals("q")) {
                
                System.out.println("Çıkış Yapılıyor...");
                break;
                
                
                
            }
            
            else {
                    
                    System.err.println("Geçersiz İşlem..");
                    
                }
        }
    }
    
}
