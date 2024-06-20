
class A{
    public A(){
        System.out.println("Inside A");
    }
    public A(int n){
        System.out.println("Inside A Int"); 
    }
}
class B extends A{
    public B(){
        super(7);
        System.out.println("Inside B");
    }
    public B(int n){
        
        System.out.println("Inside B Int"); 
    }
}

public class This_Super {
    public static void main(String[] args){
        B obj = new B();
    }
}
