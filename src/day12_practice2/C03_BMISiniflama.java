package day12_practice2;

import java.util.Scanner;

public class C03_BMISiniflama {
    public static void main(String[] args) {
        /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen kilonuzu kg girin");
        double boy=scan.nextDouble()/100;
        System.out.println("lütfen boyunuzu cm girin");
        double kilo=scan.nextDouble();

        double bmi=kilo/(boy*boy);

        if(bmi<=20){
            System.out.println("bmi+ = " + bmi+"oldukca zayifsiniz");
        }else if(bmi<=25){
            System.out.println("normal sınırlardasınız");
        }else if(bmi<=30){
            System.out.println("sisman kategorisinizdesiniz");
        }else {
            System.out.println("obez grubundasınız");
        }

    }
}
