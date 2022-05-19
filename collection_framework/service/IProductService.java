package collection_framework.service;

import collection_framework.Product;

import java.util.List;

public interface IProductService {
    List<Product> printAll();

    void add(Product newProduct);

    void update(Product newProduct);

    boolean existById(int id);

    Product checkById(int id);

    void deleteById(int id);

    boolean seachByName(String name);

    List<Product> findAllByPriceDESC();

    List<Product> findALLByPriceASC();

}
