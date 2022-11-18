package day12_practice2;

public class C05_NestedTernary {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
        char finalNotu='B';

        String result=finalNotu=='A'?"Gayet Basarili":finalNotu=='B'?"Basarili":
                finalNotu=='C'?"Ha gayret":"Digerleri..";
        System.out.println("result = " + result);
    }
}
