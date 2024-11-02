// Product.java
public abstract class Product {
    private String name;
    private int price;
    private int volume;

    public Product(String name, int price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Продукт: " + name + ", Цена: " + price + " руб., Объем: " + volume + " мл.";
    }
}
