/**
 * This class represents inventory (stock) of coffee items.
 * @author syedusman
 * @version 1.0
 */

public class Inventory
{
    /**
     * This represents the number of items stored in the inventory
     */
    private int items;

    /**
     * Assigns a default value of 15 to the items.
     * i.e...., items will be 15 at the start.
     */
    public Inventory()
    {
        items = 15;
    }

    /**
     * gets the number of coffee items.
     * @return items
     */

    public int getItems() {
        return items;
    }

    /**
     * ets the number of items.
     * @param i number of items to stored
     */

    public void setItems(int i) {
        this.items = i;
    }
}
