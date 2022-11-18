package day09_ternaryOperator;

import java.util.Scanner;

public class C01_TernaryOperator {
    public static void main(String[] args) {
        // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        System.out.println("Girdiginiz sayinin mutlak degeri : "+ (sayi>=0 ? sayi : (-1 * sayi)));


    }
}
