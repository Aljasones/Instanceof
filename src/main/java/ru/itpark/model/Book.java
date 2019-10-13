package ru.itpark.model;

public class Book extends Product {
    private String author;

    public Book(long id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean match(String text) {
        return super.match(text) || author.toLowerCase().contains(text.toLowerCase());
    }
}
