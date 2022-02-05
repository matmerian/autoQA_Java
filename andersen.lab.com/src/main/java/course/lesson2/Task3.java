package course.lesson2;
/*
 * 3.Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 * Замечание: ноль считаем положительным числом.*
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(isNegative(-6));
    }

    public static boolean isNegative(int a) {
        boolean result = a < 0 ? true : false;
        return result;
    }
}
