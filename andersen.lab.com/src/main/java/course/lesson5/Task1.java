package course.lesson5;

public class Task1<T> {
    private T[] array;

    public Task1(T... array) {
        this.array = array;
    }

    public int getLength() {
        return array.length;
    }

    public void swapElem(int m, int n) {
        T buf;
        System.out.println("Иcходный массив: ");
        for (T elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("Замена элементов: " + m + ";" + n);
        for (int i = 0; i < array.length; i++) {
            buf = array[m];
            array[m] = array[n];
            array[n] = buf;
        }
        System.out.println("Измененный массив: ");
        for (T elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();


    }
}
