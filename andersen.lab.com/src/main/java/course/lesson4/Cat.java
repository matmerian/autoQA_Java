package course.lesson4;

public class Cat extends Animal {
    private static int count;
    private int appetite;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        count++;
    }

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        satiety = false;
        count++;
    }

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int length) {
        int RUN_MAX = 200;
        if (length >= 0 && length <= RUN_MAX) {
            System.out.printf("%s пробежал %d м\n", name, length);
        } else {
            System.out.printf("%s может пробежать от 0 до %d м\n", name, RUN_MAX);
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кошки не умеют плавать");
    }


}

