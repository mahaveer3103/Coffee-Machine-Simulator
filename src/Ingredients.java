import java.util.Scanner;

public class Ingredients {

    private static double milk;
    private static double water;
    private static double beans;

    private static double milkConsumed;
    private static double waterConsumed;
    private static double beansConsumed;

    Ingredients(){
        milk= 0.0f;
        beans= 0.0f;
        water = 0.0f;
    }

    void IngredientsFiller(double m,double b,double w){
        milk += m;
        beans += b;
        water += w;
    }

    boolean checkIngredient(double beansUsed,double milkUsed,double waterUsed){
//        Ingredients ingredients = new Ingredients();
        if(getMilk()<milkUsed){
            System.out.println("Need to refill milk");
        } if (getBeans()<beansUsed) {
            System.out.println("Need to refill beans");
        } if (getWater()<waterUsed) {
            System.out.println("Need to refill water");
        }else {
            milk -= milkUsed;
            water -= waterUsed;
            beans -= beansUsed;
            milkConsumed += milkUsed;
            beansConsumed += beansUsed;
            waterConsumed += waterUsed;
            return true;
        }
        return false;
    }

    public static double getMilkConsumed() {
        return milkConsumed;
    }

    public static double getWaterConsumed() {
        return waterConsumed;
    }

    public static double getBeansConsumed() {
        return beansConsumed;
    }

    Scanner sc = new Scanner(System.in);
    void fillIngredients(){
        System.out.println("Please enter the amount of water you want to add : ");
        int fillWater = sc.nextInt();
        water += (float)fillWater;
        System.out.println("Please enter the amount of milk you want to add : ");
        int fillMilk = sc.nextInt();
        milk += (float)fillMilk;
        System.out.println("Please enter the amount of beans you want to add : ");
        int fillBeans = sc.nextInt();
        beans += (float)fillBeans;
    }

    public static double getMilk() {
        return milk;
    }

    public static double getWater() {
        return water;
    }

    public static double getBeans() {
        return beans;
    }


}
