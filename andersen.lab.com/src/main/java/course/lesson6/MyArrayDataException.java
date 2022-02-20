package course.lesson6;

public class MyArrayDataException extends NumberFormatException {
    int i;
    int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "The value in cell " + "[" + i + "," + j + "] is not a number.";
    }
}
