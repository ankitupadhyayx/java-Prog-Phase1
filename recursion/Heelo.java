package recursion;

public class Heelo {
    public static void main(String[] args) {
        System.out.println("Hello");
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
        System.out.println(n);
    }
    
}
