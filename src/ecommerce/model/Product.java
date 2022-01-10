package ecommerce.model;

public class Product {
    private String productId;
    private Integer amount;
    private Integer value;
    private String name;

    public Product(String productId, Integer amount, Integer value, String name) {
        this.productId = productId;
        this.amount = amount;
        this.value = value;
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", amount=" + amount +
                ", value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
