package day21_practise4;

import java.util.Scanner;

public class C11_ {
    public static void main(String[] args) {
     //Bir string icindeki tum karakterleri en fazla bir kere yazdiran parametreli method yazdirin
        //input="assdasaghdsghgdf"
        //output=asdghf

        Scanner scan=new Scanner(System.in);
        System.out.println("tekrar eden bir cumle girin");
        String tekrarEden=scan.nextLine();
        String tekrarEtmeyen="";
        for (int i = 0; i <tekrarEden.length()-1 ; i++) {
            if (!tekrarEtmeyen.contains(tekrarEden.substring(i,i+1))){
                tekrarEtmeyen+=tekrarEden.substring(i,i+1);
            }
            
        }
        System.out.println("tekrarEtmeyen = " + tekrarEtmeyen);
    }
}
