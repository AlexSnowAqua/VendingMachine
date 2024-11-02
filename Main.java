// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Инициализация продуктов
        List<Product> products = new ArrayList<>();
        products.add(new WaterBottle("AquaMinerale", 50, 500));
        products.add(new WaterBottle("Evian", 120, 750));
        products.add(new HotDrink("Чай", 100, 300, 80));
        products.add(new HotDrink("Кофе", 150, 250, 90));

        // Инициализация торговых автоматов
        WaterBottleVendingMachine waterMachine = new WaterBottleVendingMachine();
        waterMachine.initProducts(products);

        HotDrinkVendingMachine hotDrinkMachine = new HotDrinkVendingMachine();
        hotDrinkMachine.initProducts(products);

        // Получение товаров
        Product water = waterMachine.getProduct("AquaMinerale");
        System.out.println(water);

        Product tea = hotDrinkMachine.getProduct("Чай", 300, 80);
        System.out.println(tea);
    }
}

