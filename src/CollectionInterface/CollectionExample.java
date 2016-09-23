/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author shk123
 */
public class CollectionExample {
    public static void main(String[] args) {
        firstExp();
        List<String> a1 = new ArrayList<>();
        Collection<String> a2=new LinkedList<>();
        
        
      a1.add("MZara");
      a1.add("ZMahnaz");
      a1.add("Ayan");
      Collections.addAll(a1, "1","2","3");
      
     // Collections.addAll(a2, a2)
        printsData((Collection) a1);
        
    }
    
    public  static void firstExp()
    {
        Collections att;
      List<String> a1 = new ArrayList<String>();
      a1.add("MZara");
      a1.add("ZMahnaz");
      a1.add("Ayan");
      Collections.reverse(a1); // not sort data ---just run from last to first
      Collections.emptySet();
      
        System.out.println(a1);
        System.out.println(  Collections.emptySet());
    }
    
        
    public  static void printsData(Collection coll)
    {
        
        Iterator iterator = coll.iterator();
    while(iterator.hasNext())
    {
      Object object = iterator.next();
        System.out.println(object.toString());

      //do something to object here...
    }
    
    
  }
    
        
    
    
}
