/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListExpAndLinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author shk123
 */
public class ArrayListExp
{
    static ArrayList<Integer> arrL =new ArrayList<>();
    
    public static void main(String[] args) 
    {
        removeMethodsConcurrent();
       
           
    }
    public static void mainMethod()
    {
    
        int[] arr=new int[]{5,4,6,4,6,8,9};
        
        ArrayList<Integer> arrL ;
         //  arrL =  Arrays.asList(intArray);
           
           int[] ints = {1,2,3};
           List<Integer> list = IntStream.of(ints).boxed().collect(Collectors.toList());
           
           for(int i : list)
               System.out.println(i);
           
   //2nd methods        
   removeMethods();
    }
    public void addArrayIntergersToAL()
    {
     Integer[] intArray = {1, 2, 3, 42};
     ArrayList<Integer> intArr=new ArrayList<>(Arrays.asList(intArray));
          List<Integer> list2=  Arrays.asList(intArray);
          list2.contains(2);
    }
     public void addArrayIntToAL()
    {
      int[] ints = {1,2,3};
           List<Integer> list = IntStream.of(ints).boxed().collect(Collectors.toList());
           
           for(int i : list)
               System.out.println(i);
           
    }
     
      public static void equalsArrayMethods()
         {
             
              List<Integer> lst1 = new ArrayList<Integer>();
          lst1.add(4);
          lst1.add(5);
         
          
            List<Integer> lst2 = new ArrayList<Integer>();
          lst2.add(5);
          lst2.add(4);
        
       
 
  
         
        
        
         boolean result= lst1.equals(lst2);
         System.out.println("EqualsMethodsArrayList=--  "+result);
         
         
         }
      
       public static void removeMethods()
         {
             
              List<Integer> lst1 = new ArrayList<Integer>();
          lst1.add(4);
          lst1.add(5);
          lst1.add(8);
          lst1.add(9);
          for(int i=0;i<lst1.size();i++)
              lst1.remove(i);
          
             System.out.println("--");
             System.out.println("--"+lst1);
         }
         public static void removeMethodsConcurrent()
         {
             
              //Collection<Integer> lst1 = new TreeSet<Integer>();
                Collection<Integer> lst1 = new ArrayList<>();
          lst1.add(4);
          lst1.add(5);
          lst1.add(8);
          lst1.add(9);
          for (int val :lst1)
              if (val==8)
                  lst1.remove(val);
          
             System.out.println("--");
             System.out.println("--"+lst1);
         }
    
}
