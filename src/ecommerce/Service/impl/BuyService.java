package ecommerce.Service.impl;

import ecommerce.Service.IcompraService;
import ecommerce.model.Address;
import ecommerce.model.Product;
import ecommerce.model.Card;

import java.util.List;

public class BuyService implements IcompraService {

    private Warehouse warehouse;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public BuyService(Warehouse warehouse, PaymentService paymentService, ShippingService shippingService) {
        this.warehouse = warehouse;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    @Override
    public void processPurchase(String productId, Integer amount, Card card, Address address) {
        Product product = warehouse.searchProduct(productId,amount);
        if(product != null){
            //if we have the product, process the payment
            if (paymentService.processPayment(card,String.valueOf(product.getValue() * amount))){
                shippingService.processShipping(List.of(product), address);
            }
        }
    }
}



