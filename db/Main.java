package db;
class Calculator {
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
       
        System.out.println(calc.add(5, 6));           
        System.out.println(calc.add(5, 6, 7));        
        System.out.println(calc.add(5, 6, 7, 8));   
    }
}