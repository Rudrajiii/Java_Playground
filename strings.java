public class strings{
    public static void main(String[] args){
        //Strings are not mutable in java
        String a = "Navin";
        a += " Reddy";
        System.out.println("Hello " + a);

        String str1 = "Rudra";
        String str2 = "Rudra";
        //same memory address has assigned 
        System.out.println(str1 == str2);

        //StringBuffer and StringBuilder's are mutable
        StringBuffer buffer = new StringBuffer("Rudra");
        System.out.println(buffer);
        buffer.append(" Saha");
        System.out.println(buffer);
        buffer.deleteCharAt(0);
        System.out.println(buffer);
    }
}

