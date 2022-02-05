package course.lesson2;

import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
/*
 * 5.Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public class Task5 {
    public static void main(String[] args) {
        invertArray();
    }

    public static void invertArray() {
        int arraySize = RandomUtils.nextInt(2, 15);
        int[] arr = new int[arraySize];
        //System.out.println(arraySize);
        for (int i = 0; i < arraySize; i++) {
            arr[i] = RandomUtils.nextInt(0, 2);  //(inclusive, exclusive)
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
