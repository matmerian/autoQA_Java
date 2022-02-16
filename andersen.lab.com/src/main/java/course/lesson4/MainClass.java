package course.lesson4;

public class MainClass {
    public static void main(String[] args) {

        //p.1-4
        System.out.println("----Проверка п.1-4----");
        Dog dog1 = new Dog("Шарик");
        Animal animal1 = new Animal("Бобик");
        Cat cat1 = new Cat("Марс");

        dog1.swim(8);
        dog1.run(50);
        animal1.swim(122);
        animal1.run(50);
        cat1.run(150);
        cat1.swim(10);

        System.out.println("Cобак создано: " + Dog.getCount());
        System.out.println("Животных создано: " + Animal.getCount());
        System.out.println("Кошек создано: " + Cat.getCount());

        //p.5
        System.out.println("----Проверка п.5----");
        Plate plate1 = new Plate(20);
        Cat[] hCats = new Cat[4];
        hCats[0] = new Cat("Мурзик", 6);
        hCats[1] = new Cat("Снежок", 20);
        hCats[2] = new Cat("Барсик", 4);
        hCats[3] = new Cat("Томас", 18);

        for (Cat cat : hCats) {
            cat.eat(plate1);
            System.out.println(cat.getName() + "\t" + cat.isSatiety());
        }
        plate1.info();
        plate1.increaseFood(100);
        plate1.info();
        System.out.println("Кошек создано: " + Cat.getCount());
        System.out.println("Животных создано: " + Animal.getCount());

        //p.6
        System.out.println("----Проверка п.6----");
        Payment payment1 = new Payment();
        payment1.addProduct("чай", 79);
        payment1.addProduct("кофе", 50);
        payment1.showProductList();

        //p.7
        System.out.println("----Проверка п.7----");
        Park park1 = new Park();
        park1.addAttraction("Горки", 11, 22, -250);
        park1.addAttraction("Карусель", 11, 24, 300);
        park1.addAttraction("Картинг", -1, 18, 350);
        park1.showParkList();


    }
}
