package ecommerce.Service.impl;

import ecommerce.model.Card;

public class PaymentService {

    public Boolean processPayment(Card card, String amountToCollect){
        Boolean paymentChecked = Boolean.FALSE;
        if (card != null && card.getFrontNumbers() != null && card.getSecurityCode() != null)
            System.out.println("processing the payment for " + amountToCollect);
            paymentChecked = Boolean.TRUE;

            return paymentChecked;
    }
}
