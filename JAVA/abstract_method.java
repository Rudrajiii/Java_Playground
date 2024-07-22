package JAVA;

abstract class Car{
    public abstract void driving();
    public void music(){
        System.out.println("Playing Music");
    }
}

class Lambo extends Car{
    public void driving(){
        System.out.println("Driving Lambo");
    }
}

public class abstract_method {
    public static void main(String[] args) {
        Car obj = new Lambo();
        obj.music();
        obj.driving();
    }
}


