public class Comb {
    public static void main(String[] args) {
        Add((byte) 100, 10);
        Add2();
        Sub(1.50, 3.14f);
        Sub2();
        Mul((byte) 51, 2);
        Mul2();
        Div((byte) 6, 2);
        Div2();
    }

    public static void Add(byte a, int b) {
        int c = a + b;
        System.out.println("Combination of byte and int is: " + c);
    }

    public static void Add2() {
        long l = 50000;
        short s = 1;
        long A = l + s;
        System.out.println("Combination of long and short is: " + A);
    }

    public static void Sub(double a, float b) {
        double c = a - b;
        System.out.println("Combination of double and float is: " + c);
    }

    public static void Sub2() {
        long l = 50000;
        short s = 1;
        long A = l - s;
        System.out.println("Combination of long and short is: " + A);
    }

    public static void Mul(byte a, int b) {
        int c = a * b;
        System.out.println("Combination of byte and int is: " + c);
    }

    public static void Mul2() {
        long l = 50000;
        short s = 1;
        long A = l * s;
        System.out.println("Combination of long and short is: " + A);
    }

    public static void Div(byte a, int b) {
        int c = a / b;
        System.out.println("Combination of byte and int is: " + c);
    }

    public static void Div2() {
        long l = 50000;
        short s = 1;
        long A = l / s;
        System.out.println("Combination of long and short is: " + A);
    }
}