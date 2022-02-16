package course.lesson4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }



    public boolean decreaseFood(int n) {
        if (food>=n){
            food -= n;
            return true;
        } else {
            return false;
        }

    }

    public void increaseFood(int p) {
        if (p > 0) {
            food += p;
        } else {
            System.out.println("Вы не добавляете еду в тарелку");
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
