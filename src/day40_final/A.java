package day40_final;

public class A {

       protected  String isim="halime";
       final   static String OKUL="yildiz okulu";

        /*
     Bir variable final olarak tanimlandiysa
     baska class'lardan veya icinde oldugumuz class'dan
     bu variable'a baska deger atanmasi mumkun degildir.
     Madem ki degeri degistirilemiyor
     genelde static de yaparak
     bu variable'a erisim kolaylastirilabilir
     ve genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir
     */


       final void finalMethod(){
              System.out.println("final methodlar overide olmaz");

               /*
          bir method'u final olarak isaretlerseniz
          bu method degistirilemez demektir
          (override edilemez)
         */
       }
}
