package javaapplication51m;

import java.util.*;

public class JavaApplication51m {

    public static void main(String[] args) {
      Scanner k =new Scanner(System.in);
      String a=k.nextLine();
      int b=k.nextInt();
      System.out.println(Integer.parseInt(a,2));
      System.out.println(Integer.parseInt(a,11));
      System.out.println(Integer.toBinaryString(b));
        if (a.equalsIgnoreCase(String.valueOf(b))) {
            System.out.println("mey biter saki kalır her renk solar haki kalır ,ilim cahilligi alsada eşeklik baki kalır !!!");
        }
      System.out.println("  mert".compareTo("mert "));
        
      char []l={'k','a','d','e','r'};
      String qw=new String(l);
      System.out.println(l);
      System.out.println(qw);
      a=a.concat(qw);
       System.out.println(a);
       StringBuffer d=new StringBuffer("jdkshfjr");
       
       String m="mert";
       
       String e="Mert";
       String r="mert";
       String t =new String("Mert");
       String o=new String("Mert");
       System.out.println(m==r);
       System.out.println(e==t);
       System.out.println(m.equals(t));
        System.out.println(t.equalsIgnoreCase(r));
       System.out.println(m.compareTo(t));
       System.out.println(m.equals(r));
       System.out.println(t==o);
       m=m.concat(qw);
       System.out.println(m);
       
       String h="hak bana bir ömur vermiş boşu boşuna boşu boşuna ";
       String p=h.substring(0,24);
       System.out.println(p);
       System.out.println(p.substring(4,9));
       System.out.println(h.toUpperCase());
       System.out.println(h.trim());
       System.out.println(m.charAt(0));
       d.append("mert");
       System.out.println(d);
       d.insert(0,"baba");
       System.out.println(d);
       d.replace(0,5,"degişti");
       System.out.println(d);
       d.reverse();
       System.out.println(d);
       StringBuffer x=new StringBuffer();
       System.out.println(x.capacity());
       StringBuilder op=new  StringBuilder();
       int sw=20;
       String qwe=String.valueOf(sw+"ckdmdl");
       
       
       StringTokenizer stokenizer =new StringTokenizer("mey,biter,saki,kalır,her,renk,solar,haki,kalır!",",");
       
      
       while(stokenizer.hasMoreTokens()){
       
        System.out.println("sonraki parça: "+stokenizer.nextToken());
       
       }
         String sp="mert baba okulmus ";
        String spArray[]=sp.split(" ");
        /*for (int i = 0; i <spArray.length; i++) {
            System.out.println(spArray[i]);
            
        }*/
        for (String string:spArray) {
              System.out.println(string);
        }
        String mn="mert.baba.okulmus.....";
        int q=mn.indexOf(".");
        System.out.println(q);
     
    
    }   
}