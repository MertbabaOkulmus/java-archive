/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denem;

import java.util.*;

/**
 *
 * @author onura
 */
public class Denem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int adet = k.nextInt();
        int netmaas=0,kommaas=0;
        if(adet<50)
        {
            netmaas=(adet*15)+adet;
        }
        else if(adet >= 50 && adet<=100)
        {
            netmaas=(adet*15)+(adet*2);
        }
        else
        {
            kommaas=adet-100;
            netmaas = (adet*15)+(kommaas*3)+200;
        }
        System.out.println(netmaas);
    }
    
}
