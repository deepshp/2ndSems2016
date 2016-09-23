/**
 * Created by Andrei on 2/1/2016.
 */
package OtherProject;

import java.util.Scanner;

public class GroceryExercise
{
   // GroceryItemOrder goi = new GroceryItemOrder();
    //GroceryList list = new GroceryList();
    GroceryItemOrder[] arrayOfGrocery = new GroceryItemOrder[10];
    Scanner x = new Scanner(System.in);
    
    //System.out.println("How man");
  //  for (int i=0;i<=array.length ;i++)
    for(int i=0;i<= 10;i++)

    public GroceryExercise() {
    }
    {
     if (arrayOfGrocery[i]==null)
     {
      System.out.println("Write, in this order, the name,quantity and price for an item");
      String name = x.next();
      int quantity = x.nextInt();
      double price = x.nextDouble();
     arrayOfGrocery[i]=new GroceryItemOrder(name,quantity,price);
     }
    }
}





