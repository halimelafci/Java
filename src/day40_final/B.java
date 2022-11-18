package day40_final;

    public class B extends A{
    public static void main(String[] args) {

        B obj=new B();
        obj.isim="burak";

        System.out.println(A.OKUL);

        obj.finalMethod(); //final methodlar overide olmaz



         /*
        bir class final olarak belirlenirse,
        o class inherit edilemez
         */

    }
}
