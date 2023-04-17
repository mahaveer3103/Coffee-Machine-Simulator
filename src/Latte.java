public class Latte implements ICoffee{

    private double milk;
    private double water;
    private double beans;
    private int price;

    Latte() {
        this.milk = 75;
        this.beans = 20;
        this.water = 350;
        this.price = 7;
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
