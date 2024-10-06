import java.util.Scanner;

public class task_4_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите время в минутах:");
        int time = scanner.nextInt();

        int timeMonent = time % 5;

        if (timeMonent >= 3) {
            System.out.println("идти нельзя!");
        } else {
            System.out.println("Идти можно!");
        }


    }
}
