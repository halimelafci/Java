package day16_practise3;

import java.util.Scanner;

public class C05_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümle olusturmak icin birinci kelimeyi giriniz: ");
        String str1=scanner.next().toLowerCase();
        System.out.println("Cümle olusturmak icin birinci kelimeyi giriniz: ");
        String str2=scanner.next().toLowerCase();
        System.out.println("Cümle olusturmak icin birinci kelimeyi giriniz: ");
        String str3=scanner.next().toLowerCase();
        System.out.println("Cümle olusturmak icin birinci kelimeyi giriniz: ");
        String str4=scanner.next().toLowerCase();

        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1)+
               " " + str2 +" "+ str3 + " " + str4+".");


    }
}
