package testbase;

import pages.*;

public class PageInit extends BaseClass{
    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static InventoryItemPage inventoryItemPage;
    public static CartPage cartPage;
    public static CheckOutOne checkOutOne;
    public static CheckOutTwo checkOutTwo;

    public static void initialize(){
        loginPage = new LoginPage();
        mainPage = new MainPage();
        inventoryItemPage = new InventoryItemPage();
        cartPage = new CartPage();
        checkOutOne = new CheckOutOne();
        checkOutTwo = new CheckOutTwo();
    }
}
