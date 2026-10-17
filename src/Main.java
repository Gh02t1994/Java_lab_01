import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер стола N x M (N - x направление, M - y направление): ");
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Monster monster_a = new Monster();
        monster_a.read(N, M, 5);

        System.out.println("X: " + monster_a.x + ", Y: " + monster_a.y + ", Direction: " + monster_a.dir);
    }
}