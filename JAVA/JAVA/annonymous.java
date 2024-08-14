package JAVA;

class K{
    public void test(){
        System.out.println("Jiii K");
    }
}
// class L extends K{
//     public void test(){
//         System.out.println("Jiii L");
//     }
// }

public class annonymous {
    public static void main(String[] args) {
        
        K obj = new K(){
            public void test(){
                System.out.println("Jiii L");
            }
        };
        obj.test();
    }
}
