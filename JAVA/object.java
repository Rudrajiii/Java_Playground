package JAVA;
class calculate {
    public int add(int n1 , int n2) {
        int fetch_value = n1 + n2;
        return fetch_value;
    }
}

class object {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;
        calculate res = new calculate();
        int store = res.add(num1, num2);
        System.out.println(store);
    }
}

