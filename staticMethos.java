class Mobile{
    String brand;
    static int price;
    static boolean check;

    public void show(){
        System.out.println("Brand :" + brand + "  Price:" + price);
    }
    public static void show1(){
        System.out.println("Inside Static : " + check);
    }
    public static void show2(Mobile obj){
        System.out.println("Brand :" + obj.brand + "  Price:" + price);
    }
}

class staticMethods{
    public static void main(String[] args){
        System.out.println("working");
        Mobile firstMobile = new Mobile();
        Mobile secondMobile = new Mobile();
        firstMobile.brand = "Apple";
        secondMobile.brand = "Samsung";
        Mobile.price = 1000;
        firstMobile.show();
        secondMobile.show();
        Mobile.check = true;
        String bool = Mobile.check ? "Yes Inside" : "Not Inside";
        System.out.println(bool);
        Mobile.show2(secondMobile);

    }
}