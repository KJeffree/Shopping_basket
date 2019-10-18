import items.Item;

import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item> items;

    public ShoppingBasket(){
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int getItemsLength(){
        return this.items.size();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void emptyBasket(){
        this.items.clear();
    }
}
