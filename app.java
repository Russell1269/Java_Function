import java.util.Scanner;
// import java.util.Scanner;

public class app {

    public static void printName() { // function
        System.out.println("Hello Bangladesh");
    }

    public static int sum(int a, int b) {// parameter
        a = a + 5;
        b = b - 10;
        int result = a + b;
        return result;
    }

    public static float sum(float a, float b) { // method overloading //datatype overloading
        float result = a + b;
        return result;
    }

    public static int product(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomealcoeficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);
        int result = n_fact / (r_fact * n_r_fact);
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if ((n % i == 0)) {
                return false;

            }
        }
        return true;
    }

    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int toDec(int binN) {
        int dec = 0;
        int pow = 0;
        while (binN > 0) {
            int lastDigit = binN % 10;
            dec = dec + lastDigit * (int) Math.pow(2, pow);
            pow++;
            binN /= 10;
        }
        return dec;
    }

    public static int toBin(int decN) {
        int bin = 0;
        for (int pow = 0; decN > 0; pow++) {
            int remainder = decN % 2;
            bin += remainder * (int) Math.pow(10, pow);
            decN /= 2;
        }
        return bin;
    }

    public static void holloRectangle(int row, int col) {
        // outer loop
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // inner lopp a(i,j)
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void RotedHalfPiramid() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPirmid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int row) {
        int r = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(r + " ");
                r++;
            }
            System.out.println();
        }
    }

    public static void halfPiramid01(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }

    public static void invertedRotedHalfPiramid(int row) {
        for (int i = 1; i <= row; i++) { // line
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printButterflyPattern() {
        int line = 4;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int k = 1; k <= 2 * (line - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // 2nd half
        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int k = 1; k <= 2 * (line - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void solidRhombus() {
        int line = 5;
        for (int i = 1; i <= line; i++) {
            // space
            for (int j = 1; j <= line - i; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= line; j++) {

                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void hollowRhomnus() {
        int line = 5;
        for (int i = 1; i <= line; i++) {
            // space
            for (int j = 1; j <= line - i; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= line; j++) {
                if (i == 1 || i == line || j == 1 || j == line) {

                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        // printButterflyPattern();
        solidRhombus();
        hollowRhomnus();
        // System.out.println(isPrime(5));
    }
}
