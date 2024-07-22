package JAVA;

interface Computer{
    void code();
}


class Laptop implements Computer{
    public void code(){
        System.out.println("Code Compile Run...");
    }
}
class Dekstop implements Computer{
    public void code(){
        System.out.println("Code Compile Run Faster...");
    }
}
class Developer{
    public void buildApps(Computer lap){
        lap.code();
    }
}


public class in{
    public static void main(String[] args) {
        Developer Rudra = new Developer();
        Developer Sakshi = new Developer();
        Computer obj = new Laptop();
        Computer obj1 = new Dekstop();
        Sakshi.buildApps(obj);
        Rudra.buildApps(obj1);
    }
}
