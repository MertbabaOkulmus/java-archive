package metodlar2;

public class Metodlar2 {
    public static double besilebolum(double x){
    return 5/x;
    }
    public static double dortilecarpim(double d){
    return besilebolum(4*d);
    }
    public static double uciletoplam(double a){
    return dortilecarpim(3+a);
    }
    public static void yaz (){
        for (int i = 0; i <41; i++) {
            System.out.println("bu dersi geçecegim.");
        }
    }
    //substring kullanmak serbest 
    public static String odev(String g , String m, int a,int b){
        String x=g.substring(0,a);
        String y=m.substring(m.length()-b-1,m.length());
          return (x+y);
    }
    //substring kullanmak yasak 
    public static String odev2(String a,String b,int c,int d){
        String q="";
        for (int i = 0; i <c; i++) {
            q=q+a.charAt(i);
        }
        String w ="";
        for (int i =d; i <b.length(); i++) {
             w=w + b.charAt(i);
        }
        return (q+w);
    }
    public static String terstenyazma(String a){
    String k="";
        for (int i =a.length()-1; i >-1; i--) {
            k = k+ a.charAt(i);
        }
        return k;
    }
    public static int uzunlukbulma(String diz[]){
         int uzunluk=0;
         int i = 0;
         while(true) {
             uzunluk=uzunluk+1;
             if (diz[i]==" ") {
                 break;
             }
           i++;  
        }
    return uzunluk;
    }
            
            
    public static void main(String[] args) {
        System.out.println(uciletoplam(5));
        yaz();
        System.out.println(odev("mert","okulmus",2,3));
        System.out.println(odev2("mert","okulmus",2,3));
        System.out.println(terstenyazma("mert"));
        String d[]={"mertbaba"};
       // System.out.println(d[]);
       String a="mert";
       String l="baba";
       String b="Mert";
       String c =new String("Mert");
       System.out.println(b.equals(c));
       System.out.println(a.equalsIgnoreCase(c));
       System.out.println(a!=b);
       System.out.println(a.compareTo(l));
       System.out.println(b.compareToIgnoreCase(c));
       
    }
    
}
