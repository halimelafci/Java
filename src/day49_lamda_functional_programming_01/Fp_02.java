package day49_lamda_functional_programming_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp_02 {

    public static void main(String[] args) {

            /*
      1)  t-> "Logic" , (t, u)-> "Logic"
        Bu yapıya "Lambda Expession"
      2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
       "Lambda Expession" yerine "Method Reference" tercih edilir.
      3) "Method Reference" kullanımı "Class Name :: Method Name"

       Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
       Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
        */



        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listelemanlariniYazdirFunctionel(liste);
        System.out.println();
        ciftElemanlariYzdirFunctionel(liste);
        System.out.println();
        tekelEmanlarınınKareleriniYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);//168
        tekrarsizCiftElemanlarinKuplerininCarpimi(liste);//4096000
        getMaxEleman(liste);//131
        yedidenBuyukCiftMinDeger(liste);//8
        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);




    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional ve method reference)


    public static void listelemanlariniYazdirFunctionel(List<Integer>list){

        list.stream().forEach(Utils::ayniSatirdaBoslukİleYazdir);
    }
     //2)Ardışık çift list elementlerini aynı satırda aralarında
     // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYzdirFunctionel(List<Integer>list){

        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBoslukİleYazdir);
    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void tekelEmanlarınınKareleriniYazdir(List<Integer>list){

    list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBoslukİleYazdir);
    }

      //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.


    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){

  list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBoslukİleYazdir);

    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){

      Integer toplam=  list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Math::addExact);

        System.out.println(toplam);

    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer>list){
      Integer carpma= list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);

        System.out.println(carpma);
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer>list){
       Integer max= list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

     //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMinDeger(List<Integer>list){
     Integer minmum=   list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();
        System.out.println(minmum);

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı
    // değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
   List<Double>sonuc = list.stream().distinct().filter(t->t>5).map(Utils::yarisiniAl)
           .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);//[65.5, 5.0, 4.5, 4.0]

    }
   }
