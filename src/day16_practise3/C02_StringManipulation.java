package day16_practise3;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki String deger giriniz : ");
        String str1=scanner.nextLine(),
                str2=scanner.nextLine();

        System.out.println("1.yöntem :"+ str1+ " "+str2);
        System.out.println("2.yöntem :"+ str1.concat(" "+str2));
       //2.soru
        System.out.println("1.yöntem :"+ str1.substring(1)+str2.substring(1));
        System.out.println("1.yöntem :"+ str1.substring(1).concat(str2.substring(1)));
    }
}
