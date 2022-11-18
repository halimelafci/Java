package day21_practise4;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class C10_ {
    public static void main(String[] args) {
        // basit 4 islem yapan bir hesap makinesi kodlayiniz
        //kullanicidan yapacagi islemin sembolunu ile secmesini saglayin
        //kullanicidan iki sayı girmesini isteyin
        //girilen sayilar ve isleme gore dogru islemi ekrana yazdirin bu islemi method ile yapin

       hesapMakinesi2();


    }

    public static void hesapMakinesi2() {
        Scanner scan =new Scanner(System.in);
        System.out.println("yapacaginiz islemi secin: *,+,-,/");
        char yapilacakİslem=scan.next().charAt(0);
        System.out.println("birinci sayiyi girin");
        double sayi1=scan.nextDouble();
        System.out.println("ikinci sayiyi girin");
        double sayi2=scan.nextDouble();

        switch (yapilacakİslem){
            case '*':{
                System.out.println( "iki sayinin carpimi : "+ (sayi1*sayi2));
                break;}
            case '+':{
                System.out.println( "iki sayinin toplami : "+ (sayi1+sayi2));
                break;
            }
            case '-':{
                System.out.println( "iki sayinin cikarmasi : "+ ( sayi1-sayi2));
                break;
            }
            case '/':{
                System.out.println("iki sayinin bolumu: "+(sayi1/sayi2));
                break;
            }
            default: {
                System.out.println("gecerli bir islem girin");
            }
        }

    }
}
