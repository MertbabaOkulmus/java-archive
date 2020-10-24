package stringsinifitekrar;

public class Stringsinifitekrar {

    public static void main(String[] args) {
     String k="mErt";
     String l="meRt";
        if (k.equalsIgnoreCase(l)) {
            System.out.println("degerler eşit");
        }
        else
            System.out.println("degerler eşit degil");
        if (k!=l) {
         System.out.println("degerler eşit degil");   
        }
        
        String x="10101";
        int onluk=Integer.parseInt(x,2);
        System.out.println(onluk);
        String q=Integer.toBinaryString(onluk);
        System.out.println(q);
        int qw=Integer.parseInt(x,2);
        int we=142400009;
        String g=Integer.toBinaryString(we);
        System.out.println(g);
        
        String o="   mertbaba";
        String wl="okulmus";
        
        String z= o.concat(""+wl);
        
        System.out.println(o+" "+wl+" : "+z);
        
        System.out.println(o.substring(0,4));
        
        System.out.println(wl.toUpperCase());//toUpperCase buyuk haf cevirir.
        System.out.println(o.trim());//trim cumlenin başındakı ve onunda ki boşlukları siler 
        System.out.println(wl.startsWith(" ok"));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
