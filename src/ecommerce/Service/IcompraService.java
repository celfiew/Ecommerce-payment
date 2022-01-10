package ecommerce.Service;


import ecommerce.model.Address;
import ecommerce.model.Card;

public interface IcompraService {

    void processPurchase(String productId, Integer amount, Card card, Address address);

}
