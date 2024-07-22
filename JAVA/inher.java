package JAVA;
public class inher{
    public static void main(String[] args) {
        AdvC operCalc = new AdvC();
        int sum = operCalc.add(7 , 3);
        int sub = operCalc.sub(7 , 3);
        int mul = operCalc.mul(7 , 3);
        int div = operCalc.div(7 , 100);
        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Mul: " + mul);
        System.out.println("Div: " + div);
    }
}