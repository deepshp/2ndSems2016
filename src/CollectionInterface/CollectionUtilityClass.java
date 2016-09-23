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

/**
 *
 * @author shk123
 */
public class CollectionUtilityClass 
{
    public static void main(String[] args) {
       // sortMethods(getColl());
       // reverceMethods(getColl());
       sortHashSet();
       
    }
    public static Collection<String>  getColl()
    {
         Collection<String> coll=new LinkedList<>();
         coll.add("5");
         coll.add("2");
         coll.add("1");
         coll.add("4");
         return  coll;
    }
     public static Collection<String>  getColl__2()
    {
         Collection<String> coll=new LinkedList<>();
         LinkedList colllsis=new LinkedList<>();
         coll.add("9");
         coll.add("2");
         coll.add("3");
         
        
        
         
      
         return  coll;
    }
    
    public static void sortMethods(Collection<String> coll) 
    {
       
         //coll.addAll(a3);/***************/
         List lstObj=  (List)coll;
         Collections.sort(lstObj);
         System.out.println(lstObj);
         
         Collection<String> treeObj= new HashSet<>();
         treeObj.add("5");
         treeObj.add("2");
          Collections.sort((List)treeObj);
         
         
         
        
    }
     public static void reverceMethods(Collection<String> coll) 
    {
       
         //coll.addAll(a3);/***************/
         List lstObj=  (List)coll;
         Collections.reverse(lstObj);
         
         System.out.println(lstObj);
        
    }
     public static void sortHashSet()
     {
            Collection collection=new HashSet();
                collection.add("zebra");
                collection.add("frog");
                collection.add("bison");
                collection.add("puma");
                ArrayList<String> temp = new ArrayList<String>(collection);
                Collections.sort(temp);
                
                collection = new HashSet(temp);   
                System.out.println(temp);
    }
    
}
