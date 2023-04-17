import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String coffee = sc.nextLine();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        while (true) {
            System.out.println("Enter which coffee you want : Espresso | Latte | Cappuccino "+"\n"+"Else enter 0 to exit from machine");
            String coffee = sc.nextLine();
            coffeeMachine.checkType(coffee);
            if(coffee.equals("0")){
                break;
            }
        }
        Analytics analytics = new Analytics();
        analytics.moneyCollection();
        analytics.ingredientConsumed();
    }
}