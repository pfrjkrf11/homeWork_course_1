import java.util.Scanner;

public class Guliver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите K и М: ");
        int K = scanner.nextInt();
        int M = scanner.nextInt();

        int S = K * K;
        System.out.println(S * M);

    }
}
