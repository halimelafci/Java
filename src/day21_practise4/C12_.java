package day21_practise4;

public class C12_ {
    public static void main(String[] args) {
        //cm olarak verilen bir sayiyi metre ve kilometreye donusturen bir method yaziniz

        double cm=100;
        double m=0;
        double km=0;

        String sonuc = cmDondurenMethod(cm,m,km);

        System.out.println(sonuc);

    }

    private static String cmDondurenMethod(double cm, double m, double km) {
        String sonuc="";
       m=cm/100;            //100 000cm 1000 m ye esit 2 sifir sil 100'e bol
       km=cm/100000;       // 1000 m esittir 1 km yani cm'yi km'ye cevirmek icin 5 sifir silmek lazim
        sonuc="metre degeri : "+m+ "\n"+ "km degeri : "+km;


        return sonuc;
    }


}

