import java.util.Scanner;

public class task_4_96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа а b и c через пробел: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double Dis = Math.pow(b, 2) - 4 * a * c;

        if (Dis > 0) {

            System.out.println("Уравнение имеет 2 корня");

            double x1 = ((-b + Math.sqrt(Dis)) / (2 * a));
            double x2 = ((-b - Math.sqrt(Dis)) / (2 * a));

            System.out.println(String.format("x1 = %.2f ; x2 = %.2f", x1, x2));

        } else if (Dis == 0) {

            System.out.println("Уравнение имеет 1 корень");

            int x = (-b / (2 * a));
            System.out.println(String.format("x= %d", x));
        } else {
            System.out.println("Уравнение не имеет решений");
        }
    }
}
