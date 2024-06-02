class test {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        char c = '$';
        System.out.println(c);
        float f = 11.56f;
        int converted = (int)f;
        System.out.println(converted);

        //type promotions
        byte first_byte = 12;
        byte second_byte = 13;
        int total_bytes = first_byte * second_byte;
        // int total_bytes = (int)first_byte * (int)second_byte;
        System.out.println(total_bytes);

        int num = 9;
        // int result1 = ++num;
        // int result1 = num++;
        num++;
        // System.out.println(result1);
        // System.out.println(result2);
        System.out.println(num);

        double val = 4;
        System.out.println((int)val);
        System.out.println(val);

        int name = 0;
        int res = 0;
        res = switch(name){
            case 1 -> 1;
            default -> 0;
        };
        System.out.println(res);

    }
}
