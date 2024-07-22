package JAVA;
class Human{
    private int age;
    private String name;
    public String getName(String n) {
        return n;
    }
    public void setPrivateName(String name){
         this.name = name;
    }
    public String getPrivateName(){
         return name;
    }
    public void setPrivateAge(int age){
        this.age = age;
   }
    public int getPrivateAge(){
        return age;
   }
}


public class encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setPrivateName("Anish");
        h1.setPrivateAge(20);
        String Boy = h1.getPrivateName();
        int Boy_Age = h1.getPrivateAge();
        String girl = h1.getName("Anika");
        System.out.println(girl);
        System.out.println(Boy + " : " + Boy_Age);
    }
}
