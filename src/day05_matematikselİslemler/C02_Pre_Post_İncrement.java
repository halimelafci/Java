package day05_matematikselİslemler;

public class C02_Pre_Post_İncrement {
    public static void main(String[] args) {
        int sayi=10;
        System.out.println("pre-increment : " +  ++sayi); //11
        System.out.println("post-increment : " +  sayi++); // 11
        System.out.println("post-increment'den sonra : " + sayi); // 12
        sayi++; // 13
        ++sayi; // 14
    }
}
