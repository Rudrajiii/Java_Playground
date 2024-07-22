package JAVA;

class Akta{
    int num = 999;
    public int setNum(){
        return num;
    }
    static class Arakta{
        public void print(){
            System.out.println("Arakta Hello");
        }
    }
}

public class inner_class {
    public static void main(String[] args) {
        Akta a = new Akta();
        int res = a.setNum();
        System.out.println(res);
        Akta.Arakta b = new Akta.Arakta();
        // Akta.Arakta b = a.new Arakta();
        b.print();
    }
}
