package course.lesson4;

public class Dog extends Animal {

    private static int count;


    public Dog(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int length) {
        int RUN_MAX = 500;
        if (length >= 0 && length <= RUN_MAX) {
            System.out.printf("%s пробежал %d м\n", name, length);
        } else {
            System.out.printf("%s может пробежать от 0 до %d м\n", name, RUN_MAX);
        }

    }

    @Override
    public void swim(int length) {
        int SWIM_MAX = 10;
        if (length >= 0 && length <= SWIM_MAX) {
            System.out.printf("%s пробежал %d м\n", name, length);
        } else {
            System.out.printf("%s может проплыть от 0 до %d м\n", name, SWIM_MAX);
        }

    }
}
