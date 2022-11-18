package day12_practice2;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
    hesaplayan kodu yazınız.
    Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
    Buna göre 2 işçi aynı işi kaç günde yapar?

    Örnek Ekran Çıktısı
     Bir işçi işi kaç günde bitirmektedir? 10
     Toplam kaç işçi çalışacak? 2
    İşin bitme süresi 5 gündür.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir isci isi kac günde bitirmektedir :");
        double birIsciBitirmeSuresi=scanner.nextDouble();
        System.out.println("toplam kaç işçi çalışacak");
        double isci_Sayisi=scanner.nextDouble();
        
        double cokluBitirmeSuresi=birIsciBitirmeSuresi/isci_Sayisi;

        System.out.println("cokluBitirmeSuresi = " + cokluBitirmeSuresi);
        
    }
}
