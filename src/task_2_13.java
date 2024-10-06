import java.util.Scanner;

public class task_2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехначное число:");
        int trex = scanner.nextInt();

        int Yxx = trex / 100;
        int xYx = trex % 100 / 10;
        int xxY = trex % 10;

        System.out.print(Yxx + " ");
        System.out.print(xYx + " ");
        System.out.print(xxY + " \n");

        System.out.println(xxY + "" + xYx + "" + Yxx);


    }
}
