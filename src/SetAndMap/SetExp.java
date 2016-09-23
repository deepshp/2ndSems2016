/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author shk123
 */
public class SetExp 
{
    public static void main(String[] args) {
        //addArrayToSet();
        //addMethods();
//        addAllMethods(); //union
        // containsMethods();
        //containsAllMethods();
     
       // equalsMethods();
       //equalsArrayMethods();
       
      // clearMethods();
      
      //removeMethods();
      
     //removeAllMethods(); // difference 
     
     //retailAll()//intersection
     hashOrdersMethods();
     treeSetMethods();
    }
    
     public static void addArrayToSet()
    {
        Integer count[] = {34, 22,10,60,30,22};
         Set<Integer> set = new HashSet<Integer>(Arrays.asList(count));
         for(int val:set)
             System.out.println(val);
          
        
    }
    public static void addMethods()
    {
        
          Set<Integer> set = new HashSet<Integer>();
          set.add(2);
          set.add(2);
          set.add(2);
          set.add(2);
          set.add(2);
          for(int val:set)
             System.out.println(val);
        
    }
    public static void addAllMethods()
    {
        //union
        System.out.println(" addAllMethods()");
         Set<Integer> set1 = new HashSet<Integer>();
          set1.add(4);
          set1.add(5);
          set1.add(5);
        
          System.out.println("Set-1"+set1);
            Set<Integer> set2 = new HashSet<Integer>();
             set2.add(2);
            set2.add(6);
            set2.add(7);
        System.out.println("Set-2"+set2);
          
          set1.addAll(set2);
         
          System.out.println("Set-1 after addall funtion"+set1); 
         System.out.println("Set-2 after addall funtion"+set2); 
          
        
    }
    
      public static void containsMethods()
    {
         Set<Integer> set1 = new HashSet<Integer>();
          set1.add(4);
          set1.add(5);
         
          
         
        
        
         boolean result= set1.contains(2);
         System.out.println("Contains == "+result);
          for(int val:set1)
             System.out.println(val);
        
    }
      public static void containsAllMethods()
    {
         Set<Integer> set1 = new HashSet<Integer>();
          set1.add(4);
          set1.add(5);
         
          
          Set<Integer> set2 = new HashSet<Integer>();
          set2.add(5);
          set2.add(4);
 
  
         
        
        
         boolean result= set1.containsAll(set2);
         System.out.println("containsAllMethods==  "+result);
          for(int val:set1)
             System.out.println(val);
        
    }
      
      
         public static void equalsMethods()
         {
             
               Set<Integer> set1 = new HashSet<Integer>();
          set1.add(4);
          set1.add(5);
         
          
          Set<Integer> set2 = new HashSet<Integer>();
          set2.add(5);
          set2.add(4);
       
 
  
         
        
        
         boolean result= set1.equals(set2);
         System.out.println("EqualsMethods=--  "+result);
         
         
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
         
         public static void clearMethods()
         {     

            // it clear all methods
                  Set<Integer> set1 = new HashSet<Integer>();
                    set1.add(4);
                    set1.add(6);
                    
                    
                    
                    System.out.println("Lenth of set before clear"+set1.size());
                      set1.clear();
                     System.out.println("Lenth of set before clear"+set1.size());
                    
                    
         }
          
         public static void removeMethods()
         {     

            // it clear all methods
                  Set<Integer> set1 = new HashSet<Integer>();
                    set1.add(4);
                    set1.add(6);
                    
                    System.out.println("RemoveMethods==Lenth of set before clear"+set1.size());
                      set1.remove(4);
                     System.out.println("RemoveMethods==Lenth of set before clear"+set1.size());
                    
                    
         }
          public static void removeAllMethods()
         {     
             
             // difference set
            // it clear all methods
                  Set<Integer> set1 = new HashSet<Integer>();
                    set1.add(4);
                    set1.add(6);
                    
                     Set<Integer> set2 = new HashSet<Integer>();
                        set2.add(5);
                        set2.add(7);
               
                            System.out.println("Before"+set1);
                     
                    
                    System.out.println("RemoveMethods==Lenth of set before clear"+set1.size());
                      set1.removeAll(set2);
                     System.out.println("RemoveMethods==Lenth of set before clear"+set1.size());
                   
                        System.out.println("After"+set1);
                     
                        
                    
         }
          
            public static void toArrayMethods()
         { 
             
               Set<Integer> set1 = new HashSet<Integer>();
                    set1.add(4);
                    set1.add(6);
                    
                    Object[] arr=set1.toArray();
                    
                    for(Object i: arr  )
                        System.out.println(i);
             
             
         }
            public static void   hashOrdersMethods()
         { 
             //hash set order
             System.out.println("hashOrdersMethods()");
           
                Set<String> names = new HashSet<String>();
                names.add("Jake");
                names.add("Robert");
                names.add("Marisa");
                names.add("Kasey");
                
                System.out.println("TreeSet --" +names);
                
                
                
                
         }
            
          public static void   treeSetMethods()
         { 
             //hash set order
             System.out.println(" treeSetMethods()");
           
                Set<String> names = new TreeSet<String>();
                names.add("Jake");
                names.add("Robert");
                names.add("Marisa");
                names.add("Kasey");
                
                System.out.println("TreeSet --" +names);
                
                
                
                
         }


}
