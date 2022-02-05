package course.lesson2;
/*
 * 1.Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(isSumWithin10and20(0, 5));
    }

    public static boolean isSumWithin10and20(int a, int b) {
        int sum = a + b;
        boolean result = sum >= 10 && sum <= 20 ? true : false;
        return result;
    }
}
