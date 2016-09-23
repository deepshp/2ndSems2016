/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionInterface;

/**
 *
 * @author shk123
 */
public class WrapperClassExample 
{
    public static void main(String[] args) {
       // addWC();
       nullPointer();
    }
public static void addWC()
{
 Integer intVal= new Integer(3);
    intVal=5;
   
     System.out.println(intVal.compareTo(3));
    System.out.println(intVal==5);
    
}
    public static void nullPointer()
    {
        Integer intWC= new Integer(5);
        //intWC=null;
        int val=intWC;
        val=intWC;
        
        System.err.println("--"+intWC);
        
    }
}
