package day16_practise3;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi ve soyisminizi girin");
        String isim=scanner.nextLine(),
                soyisim=scanner.nextLine();  //multiple decleration

        String fullname=isim.concat(" "+soyisim).toUpperCase();
        System.out.println("fullname = " + fullname);
    }
}
