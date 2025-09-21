import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть N: ");
        int n = sc.nextInt();

        long a = 1, b = 1;

        System.out.println("Перші " + n + " чисел Фібоначчі:");
        for (int i = 1; i <= n; i++) {
            long fib;
            if (i == 1 || i == 2) fib = 1;
            else {
                fib = a + b;
                a = b;
                b = fib;
            }

            System.out.print("F(" + i + ") = " + fib);

            if (isPrime(fib)) {
                System.out.print(" <-- просте");
            }
            System.out.println();
        }
    }

    static boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
