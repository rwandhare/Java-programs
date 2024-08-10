/*2.Create Product class with attribute Product Id,Product name,Product price.
 and using comparable interface arrange Product as per their price.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Create_Product_class_with_attribute {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Product A", 100.5));
        products.add(new Product(2, "Product B", 556.8));
        products.add(new Product(3, "Product C", 788.5));
        products.add(new Product(4, "Product D", 126.5));
        products.add(new Product(5, "Product E", 896.4));

        Collections.sort(products, (p1, p2) -> Double.compare(p1.getProductPrice(), p2.getProductPrice()));

        for (Product product : products) 
        {
            System.out.println(product);
        }
    }
}
class Product {
    int productId;
    String productName;
    double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
