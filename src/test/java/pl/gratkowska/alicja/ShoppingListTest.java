package pl.gratkowska.alicja;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class ShoppingListTest  {
    @Mock
    ShoppingList shoppingListMock;
    @InjectMocks
    Product productMock;

    @Before
    public void setUp(){
        productMock = new Product("banan",1.23f);
        shoppingListMock = Mockito.mock(ShoppingList.class);
    }

    @Test
    public void shouldCreateMockInstance(){
        Assert.assertThat(shoppingListMock,is(notNullValue()));
    }

    @Test
    public void shouldAllowToAddItemToShoppingListWhenEmpty() {
        shoppingListMock.addToShoppingList(productMock);

        Mockito.verify(shoppingListMock).addToShoppingList(productMock);
    }

    @Test
    public void shouldAllowToAddItemToShoppingList() {
        shoppingListMock.addToShoppingList(productMock);
        shoppingListMock.addToShoppingList(productMock);

        Mockito.verify(shoppingListMock,Mockito.times(2)).addToShoppingList(productMock);
    }

    @Test
    public void checkIfPrintingWhenShoppingListEmptyWorks(){
        shoppingListMock.printShoppingList();

        Mockito.verify(shoppingListMock).printShoppingList();
    }

    @Test
    public void checkIfPrintingWhenShoppingListNotEmptyWorks(){
        shoppingListMock.printShoppingList();
        shoppingListMock.addToShoppingList(productMock);

        Mockito.verify(shoppingListMock).printShoppingList();
    }

}