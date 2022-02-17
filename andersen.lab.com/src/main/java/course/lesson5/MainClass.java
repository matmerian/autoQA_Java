package course.lesson5;

public class MainClass {
    public static void main(String[] args) {

        //Task1
        System.out.println("~~~~Task1~~~~");
        Task1<String> array1 = new Task1<>("one", "two", "five");
        Task1<Integer> array2 = new Task1<>(1, 2, 3, 5, 6);
        Task1<Double> array3 = new Task1<>(34.6, 12.0, 88.99, 0.325, 45.1);

        array1.swapElem(0, array1.getLength() - 1);
        array2.swapElem(2, array2.getLength() - 1);
        array3.swapElem(2, 3);

        //Task2
        System.out.println("~~~~Task2~~~~");
        Box<Apple> box1 = new Box<>("Box1 of apples");
        Box<Orange> box2 = new Box<>("Box1 of oranges");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();

        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box2.addFruit(orange1);
        System.out.println(box1.getName() + " weight: " + box1.getWeight());
        System.out.println(box2.getName() + " weight: " + box2.getWeight());

        System.out.println(box1.compare(box2));
        Orange orange2 = new Orange();
        Apple apple3 = new Apple();
        box2.addFruit(orange2);
        box1.addFruit(apple3);
        System.out.println(box1.getName() + " weight: " + box1.getWeight());
        System.out.println(box2.getName() + " weight: " + box2.getWeight());
        System.out.println(box1.compare(box2));

        Box<Apple> box3 = new Box<>("Box2 of apples");
        box1.moveToBox(box3);
        System.out.println(box3.getName() + " weight: " + box3.getWeight());
        System.out.println(box1.getName() + " weight: " + box1.getWeight());

        System.out.println(box3.getName() + " number of items: " + box3.countFruits());
        System.out.println(box1.getName() + " number of items: " + box1.countFruits());

        box3.moveToBox(box1);
        System.out.println(box3.getName() + " weight: " + box3.getWeight());
        System.out.println(box1.getName() + " weight: " + box1.getWeight());

        System.out.println(box3.getName() + " number of items: " + box3.countFruits());
        System.out.println(box1.getName() + " number of items: " + box1.countFruits());


    }
}
