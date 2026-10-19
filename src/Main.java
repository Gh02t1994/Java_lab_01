import java.util.Scanner;

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Table table = new Table();
        table.read_N_M();

        int k = 0;
        System.out.print("Введите количество монстров: ");
        while (k <= 0 || k > table.N * table.M) {
            k = scanner.nextInt();

            if (k <= 0 || k > table.N * table.M) {
                System.out.print("Неправильный ввод! Попробуйте еще раз: ");
            }
        }

        Monster[] monster_arr = new Monster[k];
        for (int i = 0; i < k; i++) {
            monster_arr[i] = new Monster();
            monster_arr[i].read(table.N, table.M, i);
        }

        table.create_grid();
        table.put_monsters(k, monster_arr);

        int sum_with_one = table.sum_cells();
        System.out.println("Сумма клеток, где побывал 1 монстр: " + sum_with_one);
}
