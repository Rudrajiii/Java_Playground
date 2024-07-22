package JAVA;

public class wrapper {
    public static void main(String[] args) {
        int num = 7;
        Integer num2 = num; // autoboxing;

        int num3 = num2.intValue(); // autounboxing;
        log(num3);

        String str = "12";
        int convertedNum = Integer.parseInt(str);
        log(convertedNum / 2);
    }

    // Define the log method
    public static void log(Object message) {
        System.out.println(message);
    }
}
