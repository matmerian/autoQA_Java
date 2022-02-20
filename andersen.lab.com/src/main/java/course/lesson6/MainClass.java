package course.lesson6;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: row x col ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        String[][] arr = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //количество символов в строке, есть латинница да/нет, есть цифры да/нет.  (на все false веселые символы)
                arr[i][j] = RandomStringUtils.random(1, false, true);
            }
        }
        try {
            MySum.sumArray(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("ERROR! " + e);
        }
    }

}

