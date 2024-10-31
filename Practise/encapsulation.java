package Practise;

class Encap{
    private int data;

    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Encap object = new Encap();
        object.setData(100);
        int data = object.getData();
        System.out.println(data);
    }

}
