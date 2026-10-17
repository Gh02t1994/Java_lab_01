import java.util.Scanner;

public class Monster {
    Scanner scanner = new Scanner(System.in);

    int x;
    int y;
    char dir;

    void read(int N, int M, int number) {

        System.out.println("Введите координату x для монстра " + number + " :");
        while (x <= 0 || x > N) {
            x = scanner.nextInt();

            if (x <= 0 || x > N) {
                System.out.println("Неправильный ввод! Попробуйте еще раз: ");
            }
        }

        System.out.println("Введите координату y для монстра " + number + " :");
        while (y <= 0 || y > M) {
            y = scanner.nextInt();

            if (y <= 0 || y > M) {
                System.out.println("Неправильный ввод! Попробуйте еще раз: ");
            }
        }

        System.out.println("Введите направление (N, E, S, W) для монстра " + number + " :");
        while (dir != 'N' && dir != 'E' &&  dir != 'S' &&  dir != 'W') {
            dir = scanner.next().charAt(0);

            if (dir != 'N' && dir != 'E' &&  dir != 'S' &&  dir != 'W') {
                System.out.println("Неправильный ввод! Попробуйте еще раз: ");
            }
        }

    }
}
