package day12_practice2;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        //Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen  3 basamakli bir sayi girin");
        int sayi = scan.nextInt();

        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yüzlerBasamagi = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yüzlerBasamagi) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("yuz");
                    break;
                case 2:
                    System.out.print("ikiyuz");
                    break;
                case 3:
                    System.out.print("ücyuz");
                    break;
                case 4:
                    System.out.print("dörtyuz");
                    break;
                case 5:
                    System.out.print("besyuz");
                    break;
                case 6:
                    System.out.print("altiyuz");
                    break;
                case 7:
                    System.out.print("yediyuz");
                    break;
                case 8:
                    System.out.print("sekizyuz");
                    break;
                case 9:
                    System.out.print("dokuzyuz");
                    break;
            }
            switch (onlarBasamagi) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;


            }
            switch (birlerBasamagi) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("üc");
                    break;
                case 4:
                    System.out.print("dört");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;

            }
        }else {
            System.out.println("lütfen 3 basamakli sayi girin");
        }
    }}