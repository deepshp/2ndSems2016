/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author shk123
 */
public class CollectionInterface 
{
    
    public static void main(String[] args) 
    {
        
        //Collection<String> coll1=new TreeSet<>();
       Collection<String> coll1=new LinkedList<>();
         coll1.add("9");
         coll1.add("2");
         coll1.add("3");
       // Collection<String> coll2=new TreeSet<>(); 
        Collection<String> coll2=new LinkedList<>();
         coll2.add("9");
         coll2.add("2");
         coll2.add("3");  
         coll1.addAll(coll2);
         System.out.println(coll1);
         
        //Collection r2=addObj();
        ///addColl(r2);
        //addTwoColl(r2);
        
       // clearColl(getColl());
       // containColl(getColl(),"99");
      
        
        //containALLColl(getColl(),getColl__2());
        //removeColl(getColl());
       
    }
    /*
    public static void  
    {
    } 
    */
    
     public static void removeColl(Collection<String> coll)
    {
        System.out.println("Before --"+coll);
       // coll.remove("2");
  
        
        for (String val:coll )
        {
          if (val.equalsIgnoreCase("2"))
              //  System.out.println("----");
              coll.remove(val);
        }
        
              System.out.println("After--"+coll);
    }
    public static void clearColl(Collection<String> coll)
    {
        coll.clear();
        System.out.println(coll);
    } 
     public static void containColl(Collection<String> coll,String val)
    {
   
        System.out.println("contain:--"+coll.contains(val));
              
    }
      public static void containALLColl(Collection<String> coll1,Collection<String> coll2)
    {
   
        System.out.println("ContainAll :--"+coll1.containsAll(coll2));
              
    }
      
    public static Collection<String>  getColl()
    {
         Collection<String> coll=new LinkedList<>();
         coll.add("5");
         coll.add("2");
         coll.add("2");
         coll.add("4");
         return  coll;
    }
     public static Collection<String>  getColl__2()
    {
         Collection<String> coll2=new LinkedList<>();
         coll2.add("9");
         coll2.add("2");
         coll2.add("3");
      
         return  coll2;
    }
    
    public static Collection<String> addObj()
    {
      Collection<String> a2=new LinkedList<>();
      Collection<String> a3=new ArrayList<>();
      Collection<String> a4=new TreeSet<>();
      Collection<String> a5=new HashSet<>();
      return a2;
      //Collection<String,Integer> a5=new TreeMap<String,Integer>();
    }
    public  static void addColl(Collection<String> coll)
    {
        
        // read data from file and put into 
         coll.add("2");
         coll.add("3");
        System.out.println("Print collection"+coll);
        
        for (String val : coll)
            System.out.println(val);
    
    }
     public  static void addTwoColl(Collection<String> coll)
    {
          List<String> a3=new ArrayList<String>();
           a3.add("5");
           a3.add("1");
           
             //coll.add("2");
             //coll.add("3");
        System.out.println("Print collection before add a3"+coll);      
         
         coll.addAll(a3);
         System.out.println("Print collection before add a3"+coll); 
    
     
    
    }
    
}
