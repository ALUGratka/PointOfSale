package pl.gratkowska.alicja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingList {
    private ArrayList<Product>shoppingList;

    ShoppingList(){
        shoppingList = new ArrayList<>();
    }

    public void addToShoppingList(Product newProduct){
        this.shoppingList.add(newProduct);
    }

    public void printShoppingList() {
        if(this.shoppingList.size()==0) System.out.println("Brak produktow na liscie zakupow");
        else {
            for (int i = 0; i < this.shoppingList.size(); i++) {
                System.out.println(this.shoppingList.get(i).getName() + " - " + this.shoppingList.get(i).getPrice().toString() + " zl");
            }
            System.out.println("Calkowity koszt: "+ String.format("%.2f zl",countShoppingPrice()));
        }
    }

    private Float countShoppingPrice(){
        Float totalShoppingPrice = 0f;
        for(int i = 0;i<shoppingList.size();i++){
            totalShoppingPrice+=shoppingList.get(i).getPrice();
        }
        return totalShoppingPrice;
    }
}
