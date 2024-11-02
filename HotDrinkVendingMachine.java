// HotDrinkVendingMachine.java
import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void initProducts(List<Product> products) {
        this.productList = products;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, int volume) {
        for (Product product : productList) {
            if (product instanceof HotDrink && product.getName().equalsIgnoreCase(name) && product.getVolume() == volume) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof HotDrink && product.getName().equalsIgnoreCase(name) &&
                    product.getVolume() == volume && ((HotDrink) product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}

