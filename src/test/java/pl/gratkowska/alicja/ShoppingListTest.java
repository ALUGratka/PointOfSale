package pl.gratkowska.alicja;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.gratkowska.alicja.ShoppingList;


//trzeba zaimplementowac testy dla metod add i print - print jezeli lista zakupow jest pusta

public class ShoppingListTest {
    private static final Float PRICE_DELAT = 0.01f;

    private ShoppingList shoppingList;
    private Product product;


    @Before
    public void setUp(){
        product = new Product("banan",1.56f);
        shoppingList = new ShoppingList();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldAllowToAddItemToShoppingList() {
        shoppingList.addToShoppingList(product);
    }

    @Test
    public void ifShoppingListIsEmpty() {
        Assert.assertTrue(shoppingList.getShoppingList().isEmpty());
    }
}