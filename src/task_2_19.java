import java.util.Scanner;

public class task_2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырехзначное число:");
        int chetirex = scanner.nextInt();


        int Yxxx = chetirex / 1000;
        int xYxx = chetirex / 100 % 10;
        int xxYx = chetirex % 100 / 10;
        int xxxY = chetirex % 10;

        System.out.print(Yxxx + " ");
        System.out.print(xYxx + " ");
        System.out.print(xxYx + " ");
        System.out.print(xxxY + " \n");

        int sum = Yxxx + xYxx + xxYx + xxxY;
        int multiply = Yxxx * xYxx * xxYx * xxxY;

        System.out.println(String.format("Сумма равна %d ; произведение равно %d", sum, multiply));

    }
}
