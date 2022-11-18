package day28_staticBlock;

public class Counter {
    int count;
    static int stCount;
    public Counter(){  //3.satir     //8.satir  //13.satir
        count++;  //4.satir count 0+1=1 olur /9.satir cs2= 0+1=1 /14.satir cs3=0+1=1 ayni sekilde devam eder 6'yakadar sonuc 1 olur
        stCount++;//5.satir 0+1=1 olur  //10.satir 1+1=2 //cs3=2+1=3 ayni sekilde devam eder 6'ya kadar souc 6 olur
    }          //6.satir geldigin yere git//11.satir
    public int getCount(){
        return count;
    }
    public static int getStCount(){
        return stCount;
    }

    public static void main(String[] args) { //1.satir
        Counter cs1=new Counter();        //2.satir
        Counter cs2=new Counter();     //7.satir
        Counter cs3=new Counter();  //12.satir
        Counter cs4=new Counter();
        Counter cs5=new Counter();
        Counter cs6=new Counter();
        System.out.println("count is: "+ cs6.getCount()); //1
        System.out.println("stCount is:"+ cs6.getStCount());//6 olur
    }
}
