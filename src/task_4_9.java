import java.util.Scanner;

public class task_4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость в км/ч: ");
        float speedKmPerHour = scanner.nextFloat();

        System.out.print("Введите скорость в м/с:");
        float speedMetresPerSec = scanner.nextFloat();

        float speedKmPerHour1 = speedMetresPerSec * 3.6f;


        if (speedKmPerHour1 > speedKmPerHour) {
            System.out.print(String.format("Скорость %.3f м/с больше скорости %.3f км/ч", speedMetresPerSec, speedKmPerHour));
        } else {
            System.out.print(String.format("Скорость %.3f км/ч больше скорости %.3f м/с", speedKmPerHour, speedMetresPerSec));
        }

    }
}
