package org.cloud.panzer.model;

public class Goods {
    private Long id;
    private String name;
    private String image;
    private double price;
    private String origin;
    private int count;

    public Goods() {
    }

    public Goods(Long id, String name, String image, double price, String origin, int count) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.origin = origin;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
