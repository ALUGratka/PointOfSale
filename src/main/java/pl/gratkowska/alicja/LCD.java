package pl.gratkowska.alicja;

import java.util.HashMap;
import java.util.Scanner;

public class LCD {
    private ShoppingList shoppingList;

    LCD() {
        this.shoppingList = new ShoppingList();
    }

    private String insertBareCode(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz kod kreskowy: ");
        return scanner.nextLine();
    }

    public void shoppingProcess(HashMap<String, Product>productHashMap){
        String barcode;
        while(true) {
            barcode = insertBareCode();
            if (productHashMap.containsKey(barcode) == true) {
                shoppingList.addToShoppingList(productHashMap.get(barcode));
            }
            else if(barcode.length()==0) {System.out.println("Invalid bar-code");}
            else if(barcode.equals("exit")) break;
            else  System.out.println("Product not found");
        }
        printShoppingList();
    }
    private void whenExitCommand(){
        this.shoppingList.printShoppingList();
    }

    private void printShoppingList(){
        whenExitCommand();
    }

}
