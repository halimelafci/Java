package day06_practice;

import java.util.Scanner;

public class C07_Converting {
    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */
    public static void main(String[] args) {
        int gallon=1000;
        double litre=gallon*3.785;
        String sonuc1=gallon + " galon degeri " + litre + " litreye esittir";
        System.out.println(sonuc1);

        int l=1000;
        double g=l/3.785;
        System.out.println(l+" litre degeri "+ g + " gallona esittir");

        Scanner scanner = new Scanner(System.in);
        System.out.print("fahrenheit degerini giriniz : ");
        double fh=scanner.nextInt();

        // c = (f-32)*5/9

        System.out.println("girdiginiz fahrenheit degeri : "+ ((fh-32)*5/9));
    }
}
