import java.util.Scanner;

public class Arifmetika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа A,B,C: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A * B == C) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
