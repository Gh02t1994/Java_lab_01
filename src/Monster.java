import java.util.Scanner;

public class Monster {
    Scanner scanner = new Scanner(System.in);

    int x;
    int y;
    char dir;

    void read(int N, int M, int number) {

        System.out.print("Введите координату x для монстра " + (number + 1) + ": ");
        while (x <= 0 || x > N) {
            x = scanner.nextInt();

            if (x <= 0 || x > N) {
                System.out.print("Неправильный ввод! Попробуйте еще раз: ");
            }
        }

        System.out.print("Введите координату y для монстра " + (number + 1) + ": ");
        while (y <= 0 || y > M) {
            y = scanner.nextInt();

            if (y <= 0 || y > M) {
                System.out.print("Неправильный ввод! Попробуйте еще раз: ");
            }
        }

        System.out.print("Введите направление (N, E, S, W) для монстра " + (number + 1) + ": ");
        while (dir != 'N' && dir != 'E' &&  dir != 'S' &&  dir != 'W') {
            dir = scanner.next().charAt(0);

            if (dir != 'N' && dir != 'E' &&  dir != 'S' &&  dir != 'W') {
                System.out.print("Неправильный ввод! Попробуйте еще раз: ");
            }
        }

    }
}
