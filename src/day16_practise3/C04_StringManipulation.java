package day16_practise3;

import java.util.Scanner;

public class C04_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("iki String giriniz : ");
        String str=scanner.nextLine();

        if(str.length()>=3){
            System.out.println(str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2));
        }else System.out.println(str);
    }
}
