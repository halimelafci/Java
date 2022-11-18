package day16_practise3;

import java.util.Scanner;

public class C09_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isim ve soyisim giriniz: ");
        String str1=scanner.nextLine(),
                str2=scanner.nextLine();

       int strLenght=str1.length();
       int strLenght2=str2.length();

       if(strLenght>strLenght2){
           System.out.println(str1);
       }else if (strLenght2>strLenght){
           System.out.println(str2);
       }else System.out.println("ikisi esit uzunlukta");


    }
}
