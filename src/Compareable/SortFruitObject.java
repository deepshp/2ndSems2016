/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compareable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author shk123
 */
public class SortFruitObject{
	
	public static void main(String args[]){

		sortObject_1();

                //sortObject_WithComparable();
                
               //sortObject_WithOUT__Comparable();
		
	}	
        public static void sortObject_1()
        {
            Fruit[] fruits = new Fruit[4];
		
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
		Fruit apple = new Fruit("Apple", "Apple description",100); 
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		Fruit banana = new Fruit("Banana", "Banana description",90); 
		
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		
		Arrays.sort(fruits);

		int i=0;
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
        
        }
         public static void sortObject_WithComparable()
        {
        
            FruitComparble[] FruitComparbles = new FruitComparble[4];
		
		FruitComparble pineappale = new FruitComparble("Pineapple", "Pineapple description",70); 
		FruitComparble apple = new FruitComparble("Apple", "Apple description",100); 
		FruitComparble orange = new FruitComparble("Orange", "Orange description",80); 
		FruitComparble banana = new FruitComparble("Banana", "Banana description",90); 
		
		FruitComparbles[0]=pineappale;
		FruitComparbles[1]=apple;
		FruitComparbles[2]=orange;
		FruitComparbles[3]=banana;
		
		Arrays.sort(FruitComparbles);

		int i=0;
		for(FruitComparble temp: FruitComparbles)
                {
		   System.out.println("FruitComparbles " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
        
        }
        public static void sortObject_WithOUT__Comparable()
        {
        
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
                                    /*
                                                Fruits 1 : Apple, Quantity : 60
                                                Fruits 2 : Banana, Quantity : 90
                                                Fruits 3 : Orange, Quantity : 80
                                                Fruits 4 : Pineapple, Quantity : 70
                                    */
                // Fruits.sort(Comparator.comparing(Fruit::getQuantity));
                 
                                    /*
                                       Fruits 1 : Apple, Quantity : 60
                                       Fruits 2 : Pineapple, Quantity : 70
                                       Fruits 3 : Orange, Quantity : 80
                                       Fruits 4 : Banana, Quantity : 90
                                    */

		int i=0;
		for(Fruit temp: Fruits)
                {
		   System.out.println("Fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
        
        
        }
        
}
