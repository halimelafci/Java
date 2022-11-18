package day21_practise4;

import java.util.Scanner;

public class C09_ {
    public static void main(String[] args) {
        //kullanicidan 4 harfli bir kelime isteyin ve tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime girin");
        String kelime=scan.next();
        for (int i =kelime.length()-1 ; i >= 0; i--) {
            System.out.print(kelime.substring(i,i+1));

        }
    }
}
