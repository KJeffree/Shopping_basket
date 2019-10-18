import items.Bread;
import items.Cheese;
import items.Chicken;
import items.Wine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Wine wine;
    Bread bread;
    Cheese cheese;
    Chicken chicken;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        wine = new Wine(15);
        bread = new Bread(3);
        cheese = new Cheese(2);
        chicken = new Chicken(5);
    }

    @Test
    public void shoppingBasketStartsEmpty(){
        assertEquals(0, shoppingBasket.getItemsLength());
    }

    @Test
    public void canAddItemToShoppingBasket(){
        shoppingBasket.addItem(cheese);
        assertEquals(1, shoppingBasket.getItemsLength());
    }

    @Test
    public void canRemoveItemFromShoppingBasket(){
        shoppingBasket.addItem(cheese);
        shoppingBasket.addItem(bread);
        shoppingBasket.removeItem(cheese);
        assertEquals(1, shoppingBasket.getItemsLength());
    }

    @Test
    public void canEmptyShoppingBasket(){
        shoppingBasket.addItem(cheese);
        shoppingBasket.addItem(bread);
        shoppingBasket.emptyBasket();
        assertEquals(0, shoppingBasket.getItemsLength());
    }
}
