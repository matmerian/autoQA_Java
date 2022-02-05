package course.lesson2;
/*
 * 2.Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 * Замечание: ноль считаем положительным числом.
 */
public class Task2 {
    public static void main(String[] args) {
        isPositiveOrNegative(0);
    }

    public static void isPositiveOrNegative(int a) {
        String result = a >= 0 ? "Число положительное" : "Число отрицательное";
        System.out.println(result);
    }
}
