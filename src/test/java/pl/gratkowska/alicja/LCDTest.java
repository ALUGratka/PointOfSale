package pl.gratkowska.alicja;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LCDTest {
    @Mock
    LCD lcdMock;
    @InjectMocks
    DatabaseOfProducts databaseOfProductsMock;


    @Test
    public void shouldCreateLCDMockInstance(){
        Assert.assertThat(databaseOfProductsMock,is(notNullValue()));
    }

    @Test
    public void verifyIfShoppingProcessWorks(){
        databaseOfProductsMock = Mockito.mock(DatabaseOfProducts.class);
        lcdMock = Mockito.mock(LCD.class);

        lcdMock.shoppingProcess(databaseOfProductsMock.getProductsInDatabase());

        verify(lcdMock).shoppingProcess(databaseOfProductsMock.getProductsInDatabase());
    }


}