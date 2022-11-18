package day16_practise3;

import java.util.Scanner;

public class C06_StringManipulation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scanner.nextLine().toLowerCase();

        xyzVarmi(str);
        Boolean sonuc=xyzVarmi(str);
        System.out.println(sonuc);
    }

    private static boolean xyzVarmi(String str) {
       if(str.contains("xyz")){
           return true;
       }else
           return false;


    }
}
