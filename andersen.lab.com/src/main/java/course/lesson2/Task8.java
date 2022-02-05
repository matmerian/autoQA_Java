package course.lesson2;
/*
 * 8.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */
import org.apache.commons.lang3.RandomUtils;

public class Task8 {
    public static void main(String[] args) {
        fillDiagonal();
    }

    public static void fillDiagonal() {
        int n = RandomUtils.nextInt(3, 10);
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
