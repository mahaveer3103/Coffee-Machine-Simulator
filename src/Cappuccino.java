public class Cappuccino implements ICoffee{

    private double milk;
    private double water;
    private double beans;
    private int price;

    Cappuccino() {
        this.milk = 100;
        this.beans = 12;
        this.water = 200;
        this.price = 6;
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
