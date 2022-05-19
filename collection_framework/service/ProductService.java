package collection_framework.service;

import collection_framework.Product;
import collection_framework.SortByPriceASC;
import collection_framework.SortByPriceDESC;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    public final ArrayList<Product> productList;
    private String name;

    public ProductService() {
        this.productList = new ArrayList<>();
        productList.add(new Product(1, "Nokia", 150000));
        productList.add(new Product(2, "Iphone", 4000000));
        productList.add(new Product(3, "SamSung", 3000000));
    }

    @Override
    public List<Product> printAll() {
        productList.toString();

        return productList;
    }

    @Override
    public void add(Product newProduct) {
        productList.add(newProduct);
    }

    @Override
    public void update(Product newProduct) {
//ong co viet gi trong nay đâu
        //em có viết mà viết không được :))
        for (Product p : productList) {
            if (p.getId() == newProduct.getId()) {
                String name = newProduct.getName();
                if(name!=null && !name.isEmpty())
                    p.setName(name);

                if (newProduct.getPrice() != 0) {
                    double price = newProduct.getPrice();
                    p.setPrice(price);
                }
                //tu cap nhat vo di
                //ook anh em cam on ajjjjj
            }
        }
    }

    @Override
    public boolean existById(int id) {
        return checkById(id) != null;
    }

    @Override
    public Product checkById(int id) {
        for (Product product : productList) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
            }
        }
    }

    @Override
    public boolean seachByName(String name) {
        this.name = name;
        List<Product> product = new ArrayList<>();
        for (Product pro : productList) {
            if (pro.getName().contains(name))
                product.add(pro);
        }
        return false;
    }

    @Override
    public List<Product> findALLByPriceASC() {
        List<Product> sortPriceASC = new ArrayList<>(productList);
        sortPriceASC.sort(new SortByPriceASC());
        return sortPriceASC;
    }

    @Override
    public List<Product> findAllByPriceDESC() {
        List<Product> sortPriceDESC = new ArrayList<>(productList);
        sortPriceDESC.sort(new SortByPriceDESC());
        return sortPriceDESC;
    }
}
