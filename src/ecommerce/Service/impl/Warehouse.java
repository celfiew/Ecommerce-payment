package ecommerce.Service.impl;

import ecommerce.model.Product;

import java.util.List;

public class Warehouse {
    private List<Product> products;

    public Warehouse(List<Product> products) {
        this.products = products;
    }

    public Product searchProduct(String productId, Integer amount){
        Product product = null;
        for (Product p: this.products){
            if(p.getProductId().equals(productId) && p.getAmount() >= (amount))
                product = p;
            p.setAmount(p.getAmount() - amount);
            product.setAmount(amount);
        }
        return product;
    }
}
