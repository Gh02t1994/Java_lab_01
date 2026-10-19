import java.util.Scanner;

public class Table {
    Scanner scanner = new Scanner(System.in);

    int N;
    int M;
    int[][] grid;

    void read_N_M() {
        System.out.print("Введите размер стола N (x направление): ");
        while (N <= 0) {
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.print("Неправильный ввод! Попробуйте еще раз: ");
            }
        }

        System.out.print("Введите размер стола M (y направление): ");
        while (M <= 0) {
            M = scanner.nextInt();

            if (M <= 0) {
                System.out.print("Неправильный ввод! Попробуйте еще раз: ");
            }
        }
    }

    void create_grid() {
        grid = new int[N][M];

        for (int n = 0; n < N; n++) {
            for (int m = 0; m < M; m++) {
                grid[n][m] = 0;
            }
        }
    }

    private void calculation_moves(Monster monster) {
        int x_cor = monster.x - 1;
        int y_cor = monster.y - 1;

        if (monster.dir == 'N') {
            for (y_cor = monster.y - 1; y_cor < M; y_cor++)
                grid[x_cor][y_cor]++;
        } else if (monster.dir == 'E') {
            for (x_cor = monster.x - 1; x_cor < N; x_cor++)
                grid[x_cor][y_cor]++;
        } else if (monster.dir == 'S') {
            for (y_cor = monster.y - 1; y_cor >= 0; y_cor--)
                grid[x_cor][y_cor]++;
        } else if (monster.dir == 'W') {
            for (x_cor = monster.x - 1; x_cor >= 0; x_cor--)
                grid[x_cor][y_cor]++;
        }
    }

    void put_monsters(int k, Monster[] monster_arr) {
        for (int i = 0; i < k; i++) {
            calculation_moves(monster_arr[i]);
        }
    }

    int sum_cells() {
        int sum = 0;

        for (int n = 0; n < N; n++) {
            for (int m = 0; m < M; m++) {
                if (grid[n][m] == 1)
                    sum++;
            }
        }

        return sum;
    }
}
