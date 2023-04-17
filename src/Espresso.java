public class Espresso implements ICoffee {

    private double milk;
    private double water;
    private double beans;
    private int price;

    Espresso() {
        this.milk = 0;
        this.beans = 16;
        this.water = 250;
        this.price = 4;
    }

    public double getMilk() {
        return milk;
    }

    public double getWater() {
        return water;
    }

    public double getBeans() {
        return beans;
    }

    public int getPrice() {
        return price;
    }
}
