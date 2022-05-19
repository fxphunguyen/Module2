package collection_framework;

import java.util.Comparator;

public class SortByPriceDESC implements Comparator<Product> {
    @Override
    public int compare(Product productOne, Product productTwo) {
        if (productOne.getPrice() > productTwo.getPrice()) {
            return -1;
        } else if (productOne.getPrice() == productTwo.getPrice()) {
            return 0;
        }else {
            return 1;
        }
    }
}
