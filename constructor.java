import java.util.concurrent.Flow.Publisher;

class Demo{
    int age;
    int money;
    int time;
    public Demo(int time){
        age = 12;
        money = 0;
        this.time = time;
        System.out.println("Constructor called");
    }
}
class Demo2{
    public Demo2(){
        System.out.println("Constructor2 called");
    }
}
public class constructor {
    public static void main(String[] args) {
        Demo a = new Demo(90);
        System.out.println(a);
        System.out.println(a.age);
        System.out.println(a.money);
        System.out.println(a.time);
        // new Demo(90);
        // new Demo(100); --> create a new object 
        //in heap memory each time
        Demo2 b = new Demo2();
        System.out.println(b);
    }
}
