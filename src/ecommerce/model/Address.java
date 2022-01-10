package ecommerce.model;

public class Address {
    private String street;
    private String number;
    private String postalCode;
    private String neighborhood;
    private String city;

    public Address(String street, String number, String postalCode, String neighborhood, String city) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.neighborhood = neighborhood;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    @Override
    public String toString() {
        return "adress{" +
                "string='" + street + '\'' +
                ", number='" + number + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", neightborhood='" + neighborhood + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
