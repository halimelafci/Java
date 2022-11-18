package day28_staticBlock;

public class Student {
    int number;
    String name;
    static String college="ITS";

    Student(int r,String n,String college){ //3.satir      /9.satir
        this.number=r;    //4.satir r=111                /10.satir r=222
        this.name=n;  //5.satir n=karan                 /11.satir n=aryan
        this.college=college;//6.satir college=MIT     /12.satir college=harvard
    } //7.satir geldigin yere geri git

    public static void main(String[] args) { //1.satir
        Student s1=new Student(111,"karan","MIT");//2.satir
        Student s2=new Student(222,"aryan","harvard"); //8.satir

        System.out.println(s1.number); //111
        System.out.println(s2.number); //222

        System.out.println(s1.name);//karan
        System.out.println(s2.name); //aryan

        System.out.println(s1.college); //harvard
        System.out.println(s2.college); //harvard static oldugu icin s1 de degisen ne ise o oldu yeni hali
    }
}
