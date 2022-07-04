package demo.qlsp;

import java.util.ArrayList;

public class ProManager {
    public final ArrayList<Product> productList;

    public ProManager() {
        this.productList = new ArrayList<>();
        productList.add(new Product(1, "Nokia", 150000));
        productList.add(new Product(2, "SAMSUNG", 13000));
        productList.add(new Product(3, "Iphone", 250000));

    }

    public void addProduct() {
        productList.add(new Product());
    }
}
