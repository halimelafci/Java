package day21_practise4;

import java.util.Scanner;

public class C08_ {
    public static void main(String[] args) {
        //kullanıcıdan alacaginiz bir Stringde bosluk larakterinin olup olmadigini kontrol ediniz.
        //kullanicidan alacginiz bir stringin bos olup olmadigini kontrol ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.contains(" ")){
                System.out.println("cumle bosluk iceriyor");
                break;
            }else {
                System.out.println("cumle bosluk icermiyor");
                break;

            }

        } if (cumle.isEmpty()){
            System.out.println("bos cumle");

        }else {
            System.out.println("bos degil");
        }
    }
}
