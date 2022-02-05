package course.lesson2;
/*
 * 4.Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз;
 *
 * dop: Написать метод, который определяет, является ли год високосным,
 * и возвращает boolean (високосный - true, не високосный - false).
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Task4 {
    public static void main(String[] args) {
        printStringNTimes("DON'T PANIC", 5);
        System.out.println(isLeapYear(800));
    }

    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    //extratask4
    public static boolean isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        else {
            return false;
        }
    }
}
