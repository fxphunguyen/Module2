package collection_framework.views;

import collection_framework.Product;
import collection_framework.service.IProductService;
import collection_framework.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductViews {
    IProductService productService = new ProductService();
    public Scanner scanner = new Scanner(System.in);
    private String name;

    public void addProduct() {
        System.out.println("Nhập id: ");
        System.out.print(" + ");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)) {
            System.out.println("id đã tồn tại!");
        }else {
            System.out.println("Nhập tên sản phẩm: ");
            System.out.print(" + ");
            String  name= scanner.nextLine();
            System.out.println("Nhập giá của sản phẩm: ");
            System.out.print(" + ");
            double price = Double.parseDouble(scanner.nextLine());
            
            Product product = new Product(id, name, price);
            productService.add(product);
        }
    }

    public void updateProduct() {
        System.out.println("Sửa thông tin sản phẩm theo id: ");
        System.out.println("Nhập id sản phẩm cần thay đổi: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)) {
            System.out.println("Cập nhật lại tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("Cập nhật lại giá tiền: ");
            double price = Double.parseDouble(scanner.nextLine());
            Product product = new Product(id, name, price);
            productService.update(product);
            System.out.println("Cập nhật thành công");
        }else {
            System.out.println("Sản phẩm không có!");
        }
    }

    public void removeProduct() {
        System.out.println("Nhập id sản phẩm cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)) {
            productService.deleteById(id);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không có sản phẩm cần tìm");
        }
    }

    public void seachProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        if (productService.seachByName(name)) {
            System.out.println();
        }

    }
    public void displayProduct(List<Product> productList){
        System.out.println("----------------ProductList------------------");
        System.out.printf("%-10s %-20s %-20s\n", "ID", "Tên sản phẩm", "Giá sản phẩm");
        for (Product product : productList) {
            System.out.printf("%-10d %-20s %-20s\n", product.getId(), product.getName(), product.getPrice());
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    public void menuManager() {
        int choice = 0;
        do {
            System.out.println("Menu Product Manager!!");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo tên");
            System.out.println("4. Xóa sản phẩm theo id");
            System.out.println("5. Hiển thị toàn bộ sản phẩm");
            System.out.println("6. Hiển thị sản phẩm theo giá tiền cao den thap");
            System.out.println("7. Hiển thị sản phẩm theo giá tiền thap den cao ");
            System.out.println("0. Để thoát chương trình");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    seachProduct();
                    break;
                case 4:
                       removeProduct();
                    break;
                case 5:
                    displayProduct(productService.printAll());
                    break;
                case 6:
                    displayProduct(productService.findAllByPriceDESC());
                    break;
                case 7:
                    displayProduct(productService.findALLByPriceASC());
                    break;
                case 0:
                    System.out.println("0. để thoát chương trình ");
                    break;
                default:
            }
        } while (choice != 0);
    }

}
