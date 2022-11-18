package day36_inheritancedeDataTypeKullanimi;

public class BMuhasebe extends APersonel{

    protected int saatUcreti=10;
    protected int gunlukMesai=8;



    protected void maas(){
        System.out.println("personel min : "+(30*gunlukMesai*saatUcreti)+" maas alir");

    }
    protected void ozelSigorta(){
        System.out.println("isteyen calisanlara %50 indirimli sigorta yapilir");
    }



}
