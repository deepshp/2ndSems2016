/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author shk123
 */
public class MapExp 
{
    public static void main(String[] args) {
        
        //mapLoop();
       // addKeysTwoTime();
        //mapLoop2();
        reversingaMap();
    }
     public static void  putAll()
    {
   

    }
    public static void mapLoop()
    {
        
       Map<String, String> map = new HashMap<>();
         Map<String, String> map2 = new HashMap<>();
     
       
	map.put("1", "Jan");
	map.put("2", "Feb");
	map.put("3", "Mar");
	
	//loop a MapExp
	for (Map.Entry<String, String> entry : map.entrySet()) {
		System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	}
    }
    public static void mapLoop2()
    { 
                Map<String, Integer> ages = new TreeMap<String, Integer>();
            ages.put("Marty", 19);
            ages.put("Geneva", 2);  // ages.keySet() returns Set<String>
            ages.put("Vicki", 57);
            for (String name : ages.keySet()) {           // Geneva -> 2
                int age1 = ages.get(name);                  // Marty -> 19
                System.out.println(name + " -> " + age1);  // Vicki -> 57
            }
    }

     public static void mapLoopOnlyKeys()
    {
        
       Map<String, String> map = new HashMap<>();
     
       
	map.put("1", "Jan");
	map.put("2", "Feb");
	map.put("3", "Mar");
        
        Map.Entry<String, String> entry = (Map.Entry<String, String>) map.entrySet();
	
	//loop a MapExp
	/*
        for (String entryKeys : entry.getKey() ) {
		System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	}
*/
    }
        public static void addKeysTwoTime()
    {
     Map<Double, String> taGpa = new HashMap<Double, String>();
        taGpa.put(3.6, "Jared");
        taGpa.put(4.0, "Alyssa");
        taGpa.put(2.9, "Steve");
        taGpa.put(3.6, "Stef");
        taGpa.put(2.9, "Rob");

        System.out.println("Who got a 3.6? " + 
                   taGpa.get(3.6)); 

    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
           public static void reversingaMap()
    {
                Map<Double, String> taGpa = new HashMap<Double, String>();
            taGpa.put(3.6, "Jared");
            taGpa.put(4.0, "Alyssa");
            taGpa.put(2.9, "Steve");
            taGpa.put(3.6, "Stef");
            taGpa.put(2.9, "Rob");

            System.out.println("Who got a 3.6? " + 
                               taGpa.get(3.6));   
    }
}
