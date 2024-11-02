// WaterBottle.java
public class WaterBottle extends Product {
    public WaterBottle(String name, int price, int volume) {
        super(name, price, volume);
    }

    @Override
    public String toString() {
        return "Бутылка воды: " + super.toString();
    }
}

