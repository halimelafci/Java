package day49_lamda_functional_programming_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp_03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

        buyukHarfleYazdir(liste);//ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN
        System.out.println();
        uzunlugaGoreYazdir(liste);//Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher
        System.out.println();
        uzunlugaGoreTersYazdir(liste);//Christopher Benjamin Jackson Mariano Alberto Amanda Tucker Mark Ali Ali
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);//Amanda Ali Mark Jackson Benjamin Mariano Alberto Christopher Tucker
        System.out.println();
        uzunlukdaİlkHarfineGoreSiralaYazdir(liste);
        System.out.println();
       // bestenBuyukleriSil(liste);//[Ali, Ali, Mark]
       // uzunluguSekizİleOnArasiveOileBiteniSil(liste);
        System.out.println(uzunlugu12denAzMi(liste));
        System.out.println(xİleBaslamiyorMu(liste));
        System.out.println(rİleBitiyorMu(liste));



    }
    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    //1.yol
    public static void buyukHarfleYazdir(List<String>list){

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBoslukİleYazdir);
        //ayniSatirdaBoslukİleYazdir methodu iceriginde sout oldugu icin tekrar sout yapamay gerk yok
    }

      /*
       2.yol
       public static void buyukHarfleYazdir1(List<String>list){
       list.replaceAll(String::toUpperCase);
        System.out.println(list);

       */

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreYazdir(List<String>list){
         list.stream().
        sorted(Comparator.comparing(String::length)).
        forEach(Utils::ayniSatirdaBoslukİleYazdir);
        //Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher
    }
    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String>list){
        list.stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBoslukİleYazdir);
    }
    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreTekrarsizSirala(List<String>list){
               list.stream().
                distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).
                forEach(Utils::ayniSatirdaBoslukİleYazdir);
    }
    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlukdaİlkHarfineGoreSiralaYazdir(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).
                thenComparing(Utils::ilkKarakteriAl)).forEach(Utils::ayniSatirdaBoslukİleYazdir);
    }
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

   /* public static void bestenBuyukleriSil(List<String>list){
        list.removeIf(t->t.length()>5);
        System.out.println(list);
    }
     */
    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

   /* public static void baslangiciAYadaSonuNOlaniSil(List<String>list){
 list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1=='N'||t.charAt(t.length()-1=='n'));
    }

    */

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.

   /* public static void uzunluguSekizİleOnArasiveOileBiteniSil(List<String>list){
        list.removeIf(t->(t.length()>7&&t.length()<11)||t.endsWith("o"));
        System.out.println(list);
    }

    */
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean uzunlugu12denAzMi(List<String>list){
        return list.stream().allMatch(t->t.length()<12);

    }
    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xİleBaslamiyorMu(List<String>list){
        return list.stream().noneMatch(t->t.startsWith("x"));
    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

    public static boolean rİleBitiyorMu(List<String>list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }
}

