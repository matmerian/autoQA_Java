package course.lesson6;

public class MySum {
    public static void sumArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int row = array.length;
        int col = array[0].length;
        int sum = 0;
        for (String[] strings : array) {
            for (int j = 0; j < col; j++) {
                System.out.print(strings[j] + "\t");
            }
            System.out.println();
        }
        if (row != 4 || col != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма элементов:" + sum);
    }
}
