package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf); //10a değil 107 oldu  'a' ASCII değeri=97
        System.out.println(sayi*harf);  //970
        System.out.println(str+harf);   //String güçlü olunca yanına yazılanları yanına alır
        System.out.println(harf+2);   //97+2=99
        System.out.println(str+sayi+harf);   //String diğerini yanına alır
        // char yeniHarf = harf+2;
        /*
        1- char data turu isleme girdigi degiskenin turune gore farkli davranabilir
           eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir
            sayi+harf  sayi variable'i int oldugundan harf variable'i asci tablosundan 97 degerini kullanir
            char yeniHarf = harf+2;  java once sagdaki islemi yapar, sagda int + char gorunce asccii degerini alir ve sonucu 99
                                     sonra atama islemi yapmaya calisir
                                     char yeniHarf=99;
                                     bu atama java acisindan kabul edilebilir degildir
         2- str+harf); // banana String variable cok gucludur, hangi data turu ile isleme
                          girerse girsin diger data turunu kendine benzetir
         */
        // peki... konsolda verilen variable'lari kullanarak 10a gormek istersek nasil yazdirmaliyiz ?
        System.out.println(""+sayi+harf); //10a  ("")-->String ifade olunca diğerini yanına aldı
        char deger='1';                             //ASCII '1'+'a'
        System.out.println(deger + harf); // '1' + 'a' -->  49 + 97 =146

        System.out.println(sayi+" "+harf);  //10 a

    }
}
