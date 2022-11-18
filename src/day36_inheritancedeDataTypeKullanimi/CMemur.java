package day36_inheritancedeDataTypeKullanimi;

public class CMemur extends BMuhasebe{

   protected int saatUcreti=12;
     protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("memurlar %60 indirimli ozel sigirta yapilir");
    }

    public static void main(String[] args) {


        CMemur memur1=new CMemur();
        System.out.println(memur1.gunlukMesai);//9
        System.out.println(memur1.saatUcreti);//12
        memur1.maas();          //memurlar : 3240 maas alir
        memur1.ozelSigorta();   //memurlar %60 indirimli ozel sigirta yapilir
        memur1.sigirta();       //tum personelmize sigirta yapilir //personelden aldi
        System.out.println(memur1.isim);//isim belirtilmedi
        System.out.println(memur1.soyİsim); //soyisim belirtilmedi
        System.out.println(memur1.depertman);//depertman belirtilmedi

        BMuhasebe mhsb1= new BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */
        System.out.println(mhsb1.gunlukMesai); // 8  Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Muhasebe Personel minumum : 2400 maas alir
        mhsb1.ozelSigorta(); // Muhasebe Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigirta(); // Personel Tum personelimiz sigorta yapilir
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyİsim); // Personel
        System.out.println(mhsb1.depertman);//Personel
    }




    }



