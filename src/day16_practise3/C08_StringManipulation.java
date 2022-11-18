package day16_practise3;

import java.util.Scanner;

public class C08_StringManipulation {
    public static void main(String[] args) {
        /*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kelimeyi giriniz: ");
        String str1=scanner.next();

        char ortancaKrk=str1.charAt((str1.length()-1)/2);

        if(str1.length()%2==1&&str1.length()>=3)
        {
            System.out.println("ortancaKrk = " + ortancaKrk);
        }
    }
}
