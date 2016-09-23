/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compareable;

/**
 *
 * @author shk123
 */

public class  FruitComparble implements Comparable< FruitComparble>{
	
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	public FruitComparble(String fruitName, String fruitDesc, int quantity) 
        {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
@Override
	public int compareTo(FruitComparble compareFruit) {
	
		int compareQuantity = ((FruitComparble) compareFruit).getQuantity(); 
               
		//ascending order
		//return this.quantity - compareQuantity;
		
		//descending order
		return compareQuantity - this.quantity;
		
	}	

   
}
