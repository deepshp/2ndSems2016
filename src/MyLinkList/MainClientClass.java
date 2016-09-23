/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLinkList;

/**
 *
 * @author shk123
 */
public class MainClientClass 
{
    public static void main(String[] args) 
    {
        System.out.println(" Developement of Linked List");
         LinkedIntList lst=new LinkedIntList();
        /*
        LinkedIntList lst=new LinkedIntList();
        System.out.println(lst.add(0));
        System.out.println(lst.add(1));
        System.out.println(lst.add(2));
        System.out.println(lst.add(3));

        */
         System.out.println(lst.addKeepLastNodeAdd(0));
             System.out.println(lst.addKeepLastNodeAdd(1));
                 System.out.println(lst.addKeepLastNodeAdd(2));
                     System.out.println(lst.addKeepLastNodeAdd(3));
                     
        //addKeepLastNodeAdd(int val)
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
        
        
        
    }
    
}
