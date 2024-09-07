package ZOHO;

public class Prob {

    public static void main(String[] args) {
        double x = combo(4, 3);
        System.out.printf("%.6f%n", x);
    }

    public static double combo(int n, int r) {
        int f1 = fact(n);
        int f2 = fact(r);
        int f3 = fact(n - r);
        System.out.println(f1);
        double m = (f1 / (f2 * f3)) / Math.pow(2, n);
        return m;
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
