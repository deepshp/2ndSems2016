/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLinkListDoublyLL;

import MyLinkList.*;

/**
 *
 * @author shk123
 */
public class MainClientClassDB 
{
    public static void main(String[] args) 
    {
        System.out.println(" Developement of Linked List");
         LinkedIntListDB lst=new LinkedIntListDB();
        /*
        LinkedIntListDB lst=new LinkedIntListDB();
        System.out.println(lst.add(0));
        System.out.println(lst.add(1));
        System.out.println(lst.add(2));
        System.out.println(lst.add(3));

        */
        /*
         System.out.println(lst.addKeepPreviousNodeAdd(0));
             System.out.println(lst.addKeepPreviousNodeAdd(1));
                 System.out.println(lst.addKeepPreviousNodeAdd(2));
                     System.out.println(lst.addKeepPreviousNodeAdd(3));
          */           
        //addKeepPreviousNodeAdd(0)int val)
    //{
        
        System.out.println("-------------Print data of List--------");
        /*
        System.out.println(lst.getFront().data);
          System.out.println(lst.getFront().next.data);
            System.out.println(lst.getFront().next.next.data);
              System.out.println(lst.getFront().next.next.next.data);
                System.out.println(lst.getFront().next.next.next);
*/
        
        lst.printAllNodes();
        System.out.println("------------printAllNodesFromLastToFirst()--------------");      
        
        lst.romoveNode(2);
        
        lst.printAllNodesFromLastToFirst();
        
        
        
        
        
    }
    
}
