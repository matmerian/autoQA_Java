package course.lesson2;
/*
 * Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
 * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
 */

import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;

public class TaskExtra {
    public static void main(String[] args) {
        int arraySize = 8;
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = RandomUtils.nextInt(0, 20);
        }
        int n = -11;
        moveArray(arr, n);
    }

    public static void moveArray(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));
        int size = arr.length;
        // a mod b modular arithmetic
        int t = n % size;
        if (t < 0) {
            t += size;
        }
        //rotate
        for (int i = 0; i < t; i++) {
            int buf = arr[size - 1];
            for (int j = size - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = buf;
        }
        System.out.println(Arrays.toString(arr));
    }
}
