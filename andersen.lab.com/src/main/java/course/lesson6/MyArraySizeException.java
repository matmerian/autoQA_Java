package course.lesson6;

public class MyArraySizeException extends Exception {
    @Override
    public String toString() {
        return "Wrong array size. The size must be 4x4";
    }
}


