import java.util.Scanner;

public class task_4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа а b и c через пробел: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double Dis = Math.pow(b, 2) - 4 * a * c;

        if (Dis > 0) {
            System.out.println("Уравнение имеет 2 корня");
        } else if (Dis == 0) {
            System.out.println("Уравнение имеет 1 корень");
        } else {
            System.out.println("Уравнение не имеет решений");
        }
    }
}
