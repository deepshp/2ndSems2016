/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorAndComapareExp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author shk123
 */
public class IteratorExp 
{
    public static void main(String[] args) {
        
        Set<Integer> setObj= new TreeSet<>();
        setObj.add(3);
        setObj.add(7);
        setObj.add(6);
        setObj.add(9);
        
       // List<Integer> lstObj=new ArrayList<>(); 
       
       //Collections.sort((List<Integer>) setObj);
        
        Iterator itList=setObj.iterator();
       
          System.out.println("---Set for each -------");
               System.out.println("Before remove"+setObj);
        while (itList.hasNext())
        {
            int val=(int) itList.next();
            //if(val==4)
            if  (val==2)
                itList.remove();
             // System.out.println("--"+itList.next());          
            
        }
        
        System.out.println("After remove"+setObj);
     /* 
        for (int val:setObj)
        {
            if (val==4)
                setObj.remove(val);
        
            
            //System.out.println("set--"+val);
            
            
        }
       */ 
        
    }
    
    
    
}
