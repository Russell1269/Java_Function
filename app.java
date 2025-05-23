import java.util.Scanner;
import java.lang.reflect.Array;
import java.lang.*;
import java.util.*;
import java.security.SecureRandom;
// import java.util.Scanner;

import javax.security.sasl.SaslException;

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

    public static void fibonacciSeries(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void leapYear(int n) {
        if (n % 4 == 0) {
            System.out.println("leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    public static void palindrome() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Anything to check palindrome or not :");
        String inp = scn.nextLine();

        inp = inp.replaceAll("\\s+", "");

        char[] arr = inp.toCharArray();
        char array[] = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            array[j] = arr[i];

        }
        String reversed = new String(array);
        System.out.println(reversed.toLowerCase());

        String reversed1 = new StringBuilder().append(inp).reverse().toString().toLowerCase();

        if (inp.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOt Palindrome");
        }

    }

    public static void calculator() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Operator : +, -, *, / :");
        char key = scn.next().charAt(0);

        System.out.println("Enter first num: ");
        float a = scn.nextFloat();

        System.out.println("Enter Second num: ");
        float b = scn.nextFloat();

        switch (key) {
            case '+':
                System.out.println("sum = " + (a + b));
                break;
            case '-':
                System.out.println("Substaction = " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication = " + a * b);
                break;
            case '/':
                System.out.println("Divition = " + (a / b));
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " " + "*" + " " + i + " " + "=" + " " + n * i);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
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

    public static void piramid(int line) {

        for (int i = 1; i <= line; i++) {
            // space
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }
    }

    public static void array() {
        System.out.println("Enter the Array size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // take array input
        System.out.println("Enter the Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // print array element
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Sum of Array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.print("Sum of the array is " + sum);
    }

    public static void largestElement() {
        System.out.println("Enter the Array size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // take array input
        System.out.println("Enter the Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest element is " + largest);
    }

    public static void linearSearch() {
        System.out.println("Enter the Array size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // take array input
        System.out.println("Enter the Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter key");
        int key = scn.nextInt();
        int index = felement(arr, key);

        if (index != -1) {
            System.out.println("Fount element at index " + index);
        } else {
            System.out.println("element not exist");
        }

    }

    public static int felement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void binarySearch() {
        System.out.println("Enter the Array size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // take array input
        System.out.println("Enter the Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter key");
        int key = scn.nextInt();
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index " + mid);
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
    }

    public static void ternaryOperator() {

        int a = 10;
        int b = 22;
        int c = 4;
        int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(result);

    }

    public static int ternaryOperator(int a, int b, int c, String x) {
        if (x == "Max") {
            int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
            return result;

        } else if (x == "Min") {
            int result = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
            return result;
        }
        return 0;
    }

    public static int[] arrayInputFromUser() { // When you want to take array input using function and return it Use
                                               // "int[]" insted only int
        System.out.println("Enter the Array size");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // take array input
        System.out.println("Enter the Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        return arr;
    }

    // Sorting
    public static void bubleSort() {
        int[] arr = arrayInputFromUser();

        for (int turn = 0; turn <= arr.length - 2; turn++) {
            for (int chk = 0; chk <= arr.length - 2 - turn; chk++) {
                if (arr[chk] > arr[chk + 1]) {
                    int temp = arr[chk];
                    arr[chk] = arr[chk + 1];
                    arr[chk + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    public static void selectionSort() {
        int[] arr = arrayInputFromUser();

        for (int i = 0; i <= arr.length - 2; i++) {
            int minPos = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void insertionSort() {
        int[] arr = arrayInputFromUser();

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    public static void countingSort() {
        int[] arr = arrayInputFromUser();

        int largest = Integer.MIN_VALUE;

        // largest value
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    public static void librarySort() {
        int[] arr = arrayInputFromUser();

        Arrays.sort(arr); // Library Sorting Method;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    // java class Library (JCL)
    public static void jcl() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
    }

    // Generating ramdom character
    public static void randomCharacter() {

        char randomChar = (char) ('A' + Math.random() * ('R' - 'A' + 1));
        System.out.println("Random lowercase character: " + randomChar);
    }

    // GEnerating ranmdom Digit
    public static void randomDigit() {
        int num = (int) Math.ceil(Math.random() * 6);
        System.out.println(num);
    }

    // secure random character
    public static void secureRandomCharacter() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom rand = new SecureRandom();
        char randomChar = chars.charAt(rand.nextInt(chars.length()));
        System.out.print(randomChar);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {

            secureRandomCharacter();
        }
    }
}
