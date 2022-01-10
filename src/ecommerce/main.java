package ecommerce;

import ecommerce.Service.IcompraService;
import ecommerce.Service.impl.Warehouse;
import ecommerce.Service.impl.BuyService;
import ecommerce.Service.impl.ShippingService;
import ecommerce.Service.impl.PaymentService;
import ecommerce.model.Address;
import ecommerce.model.Product;
import ecommerce.model.Card;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Product productOne = new Product("AB23",3,50000,"Book");
        Product productTwo = new Product("CC23",10,1000,"art");
        Card card = new Card("25634560945","023","2026/07");

        Address address = new Address("avenue monster","12","00100","forward","NewYork");
        IcompraService buyService = new BuyService(new Warehouse(Arrays.asList(productOne, productTwo)),new PaymentService(),new ShippingService());

        buyService.processPurchase("1",2, card,address);

    }
}
