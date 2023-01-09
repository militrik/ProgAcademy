package homework.food;

public class Food {
    private String name;
    private int price;
    private String unit;
    private String expiry;

    public Food(String name, int price, String unit, String expiry) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.expiry = expiry;
    }

    public Food() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", expiry='" + expiry + '\'' +
                '}';
    }
}