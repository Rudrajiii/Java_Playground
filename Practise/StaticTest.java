package Practise;


class Math{
    static int count; //? Static Variable
    static{
        count = 0;
        System.out.println("Static Block Initiated :)");
    }
    int t = 0; //? Non Static Variable
    static int add(int a , int b){
        return a + b;
    }
    //? Static Method
    static void increment(){
        count++; 
    }
    //? Non Static Method
    public void count(){
        t++;
    }
}

public class StaticTest {
    public static void main(String[] args) {
        int r = Math.add(9, 1);
        System.out.println(r);
        Math object = new Math();

        for(int i = 0 ; i < 5 ; i++){
            Math.increment();
            object.count();
        }
        System.out.println(Math.count);
        System.out.println(object.t);
    }
}

