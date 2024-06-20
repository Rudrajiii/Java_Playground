class A_A{
    public void show1(){
        System.out.println("In A");
    }
}
class B_B extends A_A{
    public void show2(){
        System.out.println("In B");
    }
}


public class Upcasting_Downcasting {
    public static void main(String[] args) {
        A_A obj =  new B_B();
        B_B obj1 = (B_B) obj; //?downcasting
        obj1.show2();
    }
}
