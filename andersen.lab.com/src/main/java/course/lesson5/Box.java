package course.lesson5;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class Box<T extends Fruit> {
    private final String name;
    ArrayList<T> fruits = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float boxWeight = 0;
        for (T fruit : fruits) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public boolean compare(@NotNull Box box) {  //идея сама попросила notnull вставить
        return this.getWeight() == box.getWeight();
    }

    public void moveToBox(@NotNull Box<T> box) {
        box.fruits.addAll(fruits);
        fruits.clear();
    }

    //для проверки количества на всякий случай
    public int countFruits() {
        return fruits.size();
    }


}
