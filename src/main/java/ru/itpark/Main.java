package ru.itpark;

import ru.itpark.model.Book;
import ru.itpark.model.Product;
import ru.itpark.model.SmartPhone;
import ru.itpark.service.CartService;

public class Main {
    public static void main(String[] args) {
        CartService service = new CartService();
        service.add(new Book(1, "Karenina", 500, "Tolstoy"));
        service.add(new Book(2, "iPhone User Manual", 500, "Apple"));
        service.add(new SmartPhone(3, "iPhone", 120_000, "Apple"));

        Product[] results = service.search("iPhone");
        for (Product result : results) {
            if (result == null){
                continue;
            }
            System.out.println(result.getName());

        }
        Product[] resultses = service.smartSearch("iPhone");
        for (Product result : resultses) {
            if (result == null){
                continue;
            }
            System.out.println(result.getName());

        }
    }
}
