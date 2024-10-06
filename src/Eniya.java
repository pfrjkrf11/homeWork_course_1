import java.util.Scanner;

public class Eniya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N A B:");
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int S = A * B * 2;


        System.out.println(S * N);
    }
}