package pl.gratkowska.alicja;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DatabaseOfProductsTest {
    @Mock
    DatabaseOfProducts databaseOfProductsMock;

    @Test
    public void shouldCreateDatabaseMockInstance(){
        databaseOfProductsMock = Mockito.mock(DatabaseOfProducts.class);
        assertThat(databaseOfProductsMock,is(notNullValue()));
    }



}