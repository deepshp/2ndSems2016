/**
 * Created by Andrei on 2/1/2016.
 */
package OtherProject;

public class GroceryItemOrder 
{
    private String item_name;
    private int quantity;
    private double price_unit;

    public GroceryItemOrder(String item_name, int quantity, double price_unit) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.price_unit = price_unit;
    }

    public GroceryItemOrder(String item_name) {
        this.item_name = item_name;
        quantity = 1;
    }

    public double getPrice_unit() {
        return price_unit;

    }

    public void setPrice_unit(double price_unit) {
        this.price_unit = price_unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getCost(String item_name)
    {
      return price_unit*quantity;
    }

    public String toString() {
        return String.format("Item name %s, quantity %d, Total Price %f", getItem_name(),getQuantity(),getCost(getItem_name()));
    }
}