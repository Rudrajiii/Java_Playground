package JAVA;

abstract class N{
    public abstract void show();
    public abstract void show1();
}

public class abstract_annonomous {
    public static void main(String[] args) {
        N obj = new N(){
            public void show() {
                System.out.println("in inner show");
            }
            public void show1() {
                System.out.println("in inner show1");
            }
        };
        obj.show();
        obj.show1();
    }
}
