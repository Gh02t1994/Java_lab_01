import java.util.Scanner;

public class Table {
    Scanner scanner = new Scanner(System.in);

    int N;
    int M;

    void set_N(int N) {
        this.N = N;
    }

    void set_M(int M) {
        this.M = M;
    }

    void put_monsters(int k) {

        System.out.println("Введите координату x для монстра " + number + " :");
        while (x <= 0 || x > N) {
            x = scanner.nextInt();

            if (x <= 0 || x > N) {
                System.out.println("Неправильный ввод! Попробуйте еще раз: ");
            }
        }
    }
}
