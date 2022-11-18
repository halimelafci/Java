package day42_abstractClass_interfaces;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces  {

    /*
      Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
      implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI); //20 iki tane sayi oldugu icin class ismi ile sout yapilir
        System.out.println(I02_Interfaces.SAYI);//30
        System.out.println(ISIM);//HALİME bir tane isim oldugundan class ismi yazmaya gerek yok
    }
}
