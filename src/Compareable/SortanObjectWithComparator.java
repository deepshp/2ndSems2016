/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compareable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author shk123
 */
public class SortanObjectWithComparator
{
    
    public static void main(String[] args) {
        sortObject_WithOUT__Comparable();
    }
    
       public static void sortObject_WithOUT__Comparable()
        {
            
             //List<Fruit> Fruits2 = new ArrayList<>();
        
             List<Fruit> Fruits = new ArrayList<>();
		
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
		Fruit apple = new Fruit("Apple", "Apple description",60); 
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		Fruit banana = new Fruit("Banana", "Banana description",90); 
		
		Fruits.add(pineappale);
		Fruits.add(apple);
		Fruits.add(orange);
		Fruits.add(banana);
		
		//Collections.sort(Fruits); //*******problem
                //Collections.sort(Comparator.comparing(Fruit::getFruitName));//problem
              Fruits.sort(Comparator.comparing(Fruit::getFruitName));
                // Fruits.sort(Comparator.comparing(Fruit::getQuantity));

		int i=0;
		for(Fruit temp: Fruits)
                {
		   System.out.println("Fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
                   if (temp.getFruitDesc().equalsIgnoreCase("sammy"))
		}
        
        
        }
    
}
