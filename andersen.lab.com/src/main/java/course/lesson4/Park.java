package course.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Park {
    List<Attraction> attractList = new ArrayList<>();

    public void addAttraction(String name, int openTime, int closeTime, int price) {
        if (openTime == 24) {
            openTime = 0;
        }
        if (closeTime == 24) {
            closeTime = 0;
        }
        if (price >= 0) {
            if (openTime >= 0 && openTime < 24) {
                if (closeTime >= 0 && closeTime < 24) {
                    attractList.add(new Attraction(name, openTime, closeTime, price));
                } else {
                    System.out.println("Некорректное время закрытия");
                }
            } else {
                System.out.println("Некорректное время открытия");
            }
        } else {
            System.out.println("Цена не может быть отрицательной");
        }
    }

    public void showParkList() {
        for (Attraction item : attractList) {
            String name = item.getName();
            int open = item.getOpenTime();
            int close = item.getCloseTime();
            int price = item.getPrice();
            System.out.printf("Аттракцион: %s \tВремя работы: %d:00 - %d:00 \tЦена: %d\n", name, open, close, price);
        }
    }

    private class Attraction {
        private String name;
        private int openTime;
        private int closeTime;
        private int price;

        public Attraction(String name, int openTime, int closeTime, int price) {
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getOpenTime() {
            return openTime;
        }

        public int getCloseTime() {
            return closeTime;
        }

        public int getPrice() {
            return price;
        }
    }

}
