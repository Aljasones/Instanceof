package ru.itpark.service;

import ru.itpark.model.Book;
import ru.itpark.model.Product;
import ru.itpark.model.SmartPhone;

public class CartService {
    private Product[] products = new Product[10];
    private int nextIndex = 0;

    public void add(Product product) {
        //FIXME: не следим за границами
        products[nextIndex++] = product;
    }


    public  Product[] smartSearch(String text) {
        Product[] results = new Product[10];
        int nextIndex = 0;

        for (Product product : products) {
            if (product == null) {
                continue;
            }

            if (product.match(text)) {
                results[nextIndex++] = product;
            }

        }

        return results;
    }



    public Product[] search(String text) {

        Product[] results = new Product[10];
        int nextIndex = 0;

        for (Product product : products) {
            if (product == null) {
                continue;
            }
            if (product.getName().toLowerCase().contains(text.toLowerCase())) {
                results[nextIndex++] = product;
                continue;
            }
            if (product instanceof Book) {
                Book book = (Book) product;

                if (book.getAuthor().toLowerCase().contains(text.toLowerCase())) {
                    results[nextIndex++] = product;
                    continue;
                }
            }
            if (product instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) product;

                if (smartPhone.getManufacturer().toLowerCase().contains(text.toLowerCase())) {
                    results[nextIndex++] = product;
                    continue;
                }
            }
        }


            return results;

    }


}
