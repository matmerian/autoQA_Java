package course.lesson2;
/*
 * 6.Задать пустой целочисленный массив длиной 100.
 * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int arraySize = 100;
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
