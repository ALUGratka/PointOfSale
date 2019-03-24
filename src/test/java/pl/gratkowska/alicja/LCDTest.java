package pl.gratkowska.alicja;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.HashMap;

@RunWith(MockitoJUnitRunner.class)
public class LCDTest {
    @Mock
    DatabaseOfProducts mockedDatabaseOfProducts = Mockito.mock(DatabaseOfProducts.class);


    @Test
    public void shopping(){
        LCD lcd = new LCD();
        lcd.shoppingProcess(mockedDatabaseOfProducts.getProductsInDatabase());
    }


}