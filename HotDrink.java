// HotDrink.java
public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Горячий напиток: " + super.toString() + ", Температура: " + temperature + " °C";
    }
}

