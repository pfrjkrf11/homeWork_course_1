import java.util.Scanner;

public class task_4_97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите три числа через пробел: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int minChislo = 0;
        int maxChislo = 0;
        int sredChislo = 0;

        if (a > b) {
            maxChislo = a;
        } else {
            maxChislo = b;
        }
        if (c > maxChislo) {
            maxChislo = c;
        }

        if (a < b) {
            minChislo = a;
        } else {
            minChislo = b;
        }
        if (minChislo > c) {
            minChislo = c;
        }

        if (a > minChislo && a < maxChislo) {
            sredChislo = a;
        } else if (b > minChislo && b < maxChislo) {
            sredChislo = b;
        } else if (c > minChislo && c < maxChislo) {
            sredChislo = c;
        }

        System.out.println("Минимальное число:" + " " + minChislo);
        System.out.println("Максимальное число:" + " " + maxChislo);
        System.out.println("Среднее число:" + " " + sredChislo);


    }
}

