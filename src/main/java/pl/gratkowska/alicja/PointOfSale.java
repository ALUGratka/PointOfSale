package pl.gratkowska.alicja;

/**
 * main function
 *
 */
public class PointOfSale
{
    static public LCD lcd = new LCD();
    public static void main( String[] args )
    {
        DatabaseOfProducts databaseOfProducts = new DatabaseOfProducts();

        lcd.shoppingProcess(databaseOfProducts.getProductsInDatabase());
    }
}
