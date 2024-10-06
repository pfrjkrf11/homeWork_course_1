import java.util.Scanner;

public class zp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите три зарплаты через пробел: ");
        int zp1 = scanner.nextInt();
        int zp2 = scanner.nextInt();
        int zp3 = scanner.nextInt();

        int minZp = 0;
        int maxZp = 0;

        if (zp1 > zp2) {
            maxZp = zp1;
        } else {
            maxZp = zp2;
        }

        if (maxZp < zp3) {
            maxZp = zp3;
        }

        if (zp1 < zp2) {
            minZp = zp1;
        } else {
            minZp = zp2;
        }

        if (minZp > zp3) {
            minZp = zp3;
        }
        System.out.println(maxZp - minZp);

    }
}
