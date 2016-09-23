/**
 * Created by Andrei on 2/1/2016.
 */
package OtherProject;

import java.util.*;
public class GroceryList {
    GroceryItemOrder[] item = new GroceryItemOrder[10];

    public GroceryList(GroceryItemOrder[] item) {
        this.item = item;
    }

    public void add()
    {
         for (int i=0;i<=9;i++) {
             Scanner console = new Scanner(System.in);
             if (item[i] == null) {
                 System.out.println("You are about to add a new item to the shopping list!");
                 System.out.printf("Write, in this order, the item name, quantity, and price ");
                 String item = console.next();
                 int q = console.nextInt();
                 double p = console.nextDouble();
                this.item[i] = new GroceryItemOrder(item, q, p);
             }
         }
    }

    public double getTotalCost() {
        item[1]= new GroceryItemOrder();
        int sum = 0;
        for (int i=0;i<=item.length;i++)
         sum+=item[i].getQuantity();
        
         return sum;
    }

    public String toString() 
    {
        for (int j=0;j<=item.length;j++)
        return "";
        return "";
    }
}
