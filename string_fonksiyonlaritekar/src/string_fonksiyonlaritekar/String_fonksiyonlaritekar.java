package string_fonksiyonlaritekar;
 
import java.util.*;

public class String_fonksiyonlaritekar {
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    //dışarıdan girilen ikilik tabanda iki adet sayının 10'luk tabana cevrilip karekök icindeki degerini ikilik tabana çevirip ekrana yadıran java kodu   
      String x=sc.nextLine();
      String y=sc.nextLine();
      int a=Integer.parseInt(x,2);
      int b=Integer.parseInt(y,2);
      double kok=Math.sqrt(a+b);
      System.out.println(a);
      System.out.println(b);
      System.out.println(kok);
      System.out.println("*******************************************************");
      System.out.println(Integer.toBinaryString((int)kok));
      
      
      String s="mert baba okulmus";
      String st="   yazılım.müh.lab.   ";
      System.out.println(s.substring(0,4));
      String c=s.substring(5,10);
      System.out.println(c.toUpperCase());
      System.out.println(st.trim());
      System.out.println(s.startsWith("baba"));
      System.out.println(st.endsWith("   "));//endsWith cumlenin hangı ekle bitip bitmedigini koturol eder;
      System.out.println(st.charAt(9));
      System.out.println(s.length());
      String cev=String.valueOf(a);
      System.out.println(a);
      System.out.println(s.replace("mert","fıratmurat"));
      
      
      StringBuffer sbf=new StringBuffer("inşallah olucak");
      StringBuilder sbl=new StringBuilder("allah alllah şükrenlilah ya kerim allah"); 
      System.out.println(sbf.append(sbl));
      System.out.println(sbf.insert(0,"inanırsan "));
      System.out.println(sbf.replace(0,9,"Allah izin verirse "));
      System.out.println(sbl.delete(2,8));
      System.out.println(sbl.reverse());
      System.out.println(sbl.capacity());
      
    }
    
}
