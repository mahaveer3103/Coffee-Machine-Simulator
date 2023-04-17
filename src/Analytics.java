import java.util.HashMap;
import java.util.Map;

public class Analytics {

    void moneyCollection(){
        HashMap<String, Float> invoiceMap = CoffeeMachine.invoiceMap;
        System.out.println("Total coffees consumed and their price");
        for(Map.Entry<String,Float> map:invoiceMap.entrySet()){
            System.out.println(map.getKey()+"\n"+map.getValue()+"$ collected from "+map.getKey()+" coffee");
        }
    }

    void ingredientConsumed(){
        System.out.println("Analysis of ingredients used : ");
        System.out.println("Total milk consumed "+ Ingredients.getMilkConsumed()+" ml");
        System.out.println("Total water consumed "+ Ingredients.getWaterConsumed()+" ml");
        System.out.println("Total beans consumed "+ Ingredients.getBeansConsumed());
    }
}
