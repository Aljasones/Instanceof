package ru.itpark.model;

public class SmartPhone extends Product {
    private  String manufacturer;

    public SmartPhone(long id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean match(String text) {
        return super.match(text) || manufacturer.toLowerCase().contains(text.toLowerCase());
    }
}
