import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введити число:");
        int num = scanner.nextInt();

        int desiat = 9 - num;
        int result = (num * 100) + (9 * 10) + desiat;
        System.out.println(result);


    }
}
