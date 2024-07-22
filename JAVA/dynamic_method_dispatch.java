package JAVA;
class A{
    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
    
}
