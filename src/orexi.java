import java.util.Scanner;

public class orexi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N M K, через пробел: ");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if (N * M >= K) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
