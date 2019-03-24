package pl.gratkowska.alicja;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DatabaseOfProducts {
    private static HashMap<String, Product>productsInDatabase;

    DatabaseOfProducts(){
        productsInDatabase = new HashMap<>();
        Product p1 = new Product("banan",1.4f);
        Product p2 = new Product("jogurt",2.4f);
        Product p3 = new Product("musli",6.99f);
        Product p4 = new Product("orzechy",12.99f);

        productsInDatabase.put("1",p1);
        productsInDatabase.put("2",p2);
        productsInDatabase.put("3",p3);
        productsInDatabase.put("4",p4);
    }

    public static HashMap<String, Product> getProductsInDatabase() {
        return productsInDatabase;
    }
}
