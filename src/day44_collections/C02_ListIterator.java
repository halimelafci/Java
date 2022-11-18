package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {


       // Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        ListIterator lis1=liste.listIterator();

        while (lis1.hasNext()){
            lis1.next(); //sondan gelebilmek icin sona gitmek lazim yazdirmadan gitti
        }

        while (lis1.hasPrevious()){ //yaninda eleman varsa devam et ilerle
            System.out.print(lis1.previous()+" ");// her ilerlemede yazir
        }
    }
}
