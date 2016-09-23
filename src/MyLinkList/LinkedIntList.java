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
public class LinkedIntList 
{
    private ListNode front;
    private ListNode last;
    private ListNode tempNode;
    
    public LinkedIntList()
    {
      
        front=null;
        
    }
    
    public boolean add(int val)
    {
        
        if (front==null)
        {
            front=new ListNode(val, front);
            return true;
        }
        else
             {
                    ListNode current = front;
                    // find last one 
                    
                    while (current.next != null) 
                    {
                    
                        current = current.next;
                    
                    }
                    // setting null express end of List
                    current.next = new ListNode(val,null);
                    
                    return false;
             } 
       
        
       // return false;
    
    
    }
       public boolean addKeepLastNodeAdd(int val)
    {
        
        if (front==null)
        {
            front=new ListNode(val, front);
            last=front;
            return true;
        }
        else
             {
                    tempNode= new ListNode(val,null);
                    last.next = tempNode;
                    last=tempNode;
                    
                    return false;
             } 
       
        
       // return false;
    
    
    }
   
    public  ListNode getFront()
    {
      return front;
    }
    public  ListNode getLast()
    {
      return last;
    }
    public  void  printAllNodes()
    {
        ListNode   currentNode=front;
             //while (currentNode.next != null) // system will not print last one becuause it takes next address
            while (currentNode != null) 
            {
                    
                System.out.println(currentNode.data);
                currentNode=currentNode.next;
                    
            }
    
    }
    
}
