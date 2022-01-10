package ecommerce.Service.impl;

import ecommerce.model.Address;
import ecommerce.model.Product;

import java.util.List;

public class ShippingService {

    public void processShipping(List<Product> products, Address adress){
        System.out.println("Enviando productos a " + adress.getStreet() + " " + adress.getNumber() + "," + adress.getNeighborhood());
    }
}
