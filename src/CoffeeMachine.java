import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CoffeeMachine {

    Scanner sc = new Scanner(System.in);

    Ingredients ingredients = new Ingredients();

    public static HashMap<String,Float> invoiceMap = new HashMap<>();
    void checkType(String coffeeType){
        if(coffeeType.equals("Espresso")){
            Espresso espresso = new Espresso();
            if(ingredients.checkIngredient(espresso.getBeans(),espresso.getMilk(),espresso.getWater())){
                System.out.println("You can have your Espresso!");
            }else{
                System.out.println("Please fill the ingredients in machine first");
                ingredients.fillIngredients();
                if(ingredients.checkIngredient(espresso.getBeans(),espresso.getMilk(),espresso.getWater())) {
                    System.out.println("We got all ingredients to make Espresso thanks!");
                    System.out.println("You can have your Espresso!");
                }
            }
            float price = invoiceMap.getOrDefault("Espresso",0.0f)+espresso.getPrice();
            invoiceMap.put("Espresso",price);
        }else if(coffeeType.equals("Latte")){
            Latte latte = new Latte();
            if(ingredients.checkIngredient(latte.getBeans(),latte.getMilk(),latte.getWater())){
                System.out.println("You can have your Latte!");
            }else{
                System.out.println("Please fill the ingredients in machine first");
                ingredients.fillIngredients();
                if(ingredients.checkIngredient(latte.getBeans(),latte.getMilk(),latte.getWater())) {
                    System.out.println("We got all ingredients to make Latte thanks!");
                    System.out.println("You can have your Latte!");
                }
            }
            float price = invoiceMap.getOrDefault("Latte",0.0f)+latte.getPrice();
            invoiceMap.put("Latte",price);
        }else if(coffeeType.equals("Cappuccino")){
            Cappuccino cappuccino = new Cappuccino();
            if(ingredients.checkIngredient(cappuccino.getBeans(),cappuccino.getMilk(),cappuccino.getWater())){
                System.out.println("You can have your Cappuccino!");
            }else{
                System.out.println("Please fill the ingredients in machine first");
                ingredients.fillIngredients();
                if(ingredients.checkIngredient(cappuccino.getBeans(),cappuccino.getMilk(),cappuccino.getWater())) {
                    System.out.println("We got all ingredients to make Cappuccino thanks!");
                    System.out.println("You can have your Cappuccino!");
                }
            }
            float price = invoiceMap.getOrDefault("Cappuccino",0.0f)+cappuccino.getPrice();
            invoiceMap.put("Cappuccino",price);
        }else if (!coffeeType.equals("0")){
            System.out.println("Please enter correct coffee name ");
        }
    }




}
