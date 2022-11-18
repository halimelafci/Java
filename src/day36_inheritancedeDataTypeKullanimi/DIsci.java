package day36_inheritancedeDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends CMemur {

    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;
    protected void maasIsci(){
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }
    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci();
        /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk
          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */
        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // M Personel minumum : 2400 maas alir
        isc1.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigirta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyİsim); // P
        System.out.println(isc1.depertman);// P
        APersonel isc2 = new DIsci();
        //System.out.println(isc2.gunlukMesai); // M 8
        //System.out.println(isc2.saatUcreti); // M 10
        //isc2.ozelSigorta(); // M Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.sigirta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyİsim); // P
        System.out.println(isc2.depertman);// P
        /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */
        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */
    }
}
