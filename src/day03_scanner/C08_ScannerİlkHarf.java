package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_ScannerİlkHarf {
    public static void main(String[] args) {
        // kullanicidan ismini alip, ilk harfini buyuk harf olarak yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        /*
          Java Scanner class'inda nextChar() method'u yoktur
          bunun yerine String olarak ilk kelimeyi alip
          onun da ilk harfini alabiliriz
         */
        char ilkHarf= scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Ismin ilk harfi : " + ilkHarf);
    }
}
