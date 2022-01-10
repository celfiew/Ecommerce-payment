package ecommerce.model;

public class Card {

    private String frontNumbers;
    private String securityCode;
    private String expirationDate;

    public Card(String frontNumbers, String securityCode, String expirationDate) {
        this.frontNumbers = frontNumbers;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }

    public String getFrontNumbers() {
        return frontNumbers;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    @Override
    public String toString() {
        return "Card{" +
                "frontNumbers='" + frontNumbers + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
