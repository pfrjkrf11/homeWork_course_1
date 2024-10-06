import java.util.Scanner;

public class task_2_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество секунд:");
        int seconds = scanner.nextInt();

        int fullHours = seconds / 3600;
        int fullMinutes = (seconds % 3600) / 60;
        int fullSeconds = seconds % 60;

        System.out.println(String.format(" %d полных часов прошло с начала суток", fullHours));
        System.out.println(String.format(" %d полных полных минут прошло с начала очередного часа", fullMinutes));
        System.out.println(String.format(" %d полных полных секунд прошло с начала очередной минуты", fullSeconds));

    }
}

