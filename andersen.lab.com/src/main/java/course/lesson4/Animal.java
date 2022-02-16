package course.lesson4;

public class Animal {
    private static int count;
    protected String name;


    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }


    public void run(int length) {
        if (length >= 0) {
            System.out.printf("Животное по кличке %s пробежало %d м\n", name, length);
        } else {
            System.out.println("Животное может пробежать от 0 м");
        }

    }

    public void swim(int length) {
        if (length >= 0) {
            System.out.printf("Животное по кличке %s проплыло %d м\n", name, length);
        } else {
            System.out.println("Животное может проплыть от 0 м");
        }
    }
}
