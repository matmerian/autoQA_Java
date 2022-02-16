package course.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Payment {


    List<Product> prodList = new ArrayList<>(); //да, еще не изучали на курсе, но такой вариант проще

    public void addProduct(String productName, int productCost) {
        if(productCost>=0) {
            prodList.add(new Product(productName, productCost));
        } else {
            System.out.println("Цена товара не может быть отрицательной");
        }
    }

    public void showProductList() {
        for(Product item: prodList){
            String name = item.getProductName(); //работает и item.productName, но что из этого корректно?
            int price = item.getProductCost();
            System.out.printf("Название товара: %s \t Цена: %d\n", name, price);
        }
    }

    //inner class
    private class Product {
        private final String productName;
        private final int productCost;

        public Product(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return productName;
        }

        public int getProductCost() {
            return productCost;
        }
    }//end of inner class


}



