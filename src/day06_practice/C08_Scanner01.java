package day06_practice;

import java.util.Scanner;

public class C08_Scanner01 {

    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("lütfen birinci tam sayı giriniz : ");
         int sayi1=scanner.nextInt();
         System.out.print("lütfen ikinci tam sayı giriniz : ");
         int sayi2=scanner.nextInt();

         System.out.println("sayiların toplamı = " + (sayi1 +sayi2));

    }
}
