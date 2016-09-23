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
public class LinkedIntListDB 
{
    private ListNodeDB front;
    private ListNodeDB last;
    private ListNodeDB tempNode;
    private int lenOfNode=0; // count
    
    private ListNode head;
    
    // created for remove
         ListNodeDB   currentNode;
         ListNodeDB prev;
         ListNodeDB next;
         
         
    public LinkedIntListDB()
    {
      
        front=null;
        
    }
    
    
         //public boolean addKeepPreviousNodeAdd(int val)
      public boolean add(int val)            
    {
        
        if (front==null)
        {
            front=new ListNodeDB(val, front,null);
            last=front;// here front and last will be  same 
            lenOfNode++;
            return true;
        }
        else
             {
                    tempNode= new ListNodeDB(val,null,last);
                    last.next = tempNode;
                    last=tempNode;
                    lenOfNode++;
                    return false;
             } 
       
    
    
    
    }
    public boolean romoveNode(int val)
    {
        // find a node which you want to remove
        // check previous and next node
        //make connection in between previous and next node
        
        // what happen if you are removing first and last node becuase both need one null pointer
        
            currentNode=front;
            int count=1;
          
             //while (currentNode.next != null) // system will not print last one becuause it takes next address
             
                if (lenOfNode==1)
                {
                    // if we have only ONE node then we don't have prev and next
                    // 
                     front=null;
                      lenOfNode--;
                     return true;
                     
                     
                }
                else
                {

                    while (currentNode != null) 
                    {
                        if (currentNode.data==val)
                        { 
                                if (count==1) // remove first node
                                 {
                                      // if count is ==0 ,we need to set next node 
                                     
                                      //currentNode=front;
                                    //prev=currentNode.prev;
                                    next= currentNode.next;
                                    front=next;
                                    front.prev=null;
                                    lenOfNode--;
                                     return true;


                                 }   
                                else if(count==lenOfNode)// remove last node
                                {
                                    prev=currentNode.prev;
                                   // next= currentNode.next;
                                    last=prev;
                                    last.next=null;
                                    lenOfNode--;
                                     return true;
                                
                                }
                                else
                                {
                                      if (currentNode.data==val)
                                       {
                                          //currentNode=front;
                                          prev=currentNode.prev;
                                          next= currentNode.next;
                                          prev.next= currentNode.next;
                                          next.prev=prev;
                                          lenOfNode--;
                                           return true;
                                       }
                                        currentNode=currentNode.next;
                                    count++;
                                }    
                                 
                       }
                           
                    }
                }    
        return false;
    }     
    
    
    public boolean remove(int val)
	// post: removes the element at the specified position in this list.
	{
		// if the index is out of range, exit
           /*
                int counter=0;
           if(lenOfNode==0)
            return false;
           if(lenOfNode==1)
           {
            head=null;
            return true;
           }
           ListNode preAdd=head;
            ListNode nextAdd=head;
           ListNode tempAdd=head;
           for(int i = 0; i < lenOfNode; i++)
           {
               
               if (head.data==val)                   
               {
                    if(lenOfNode==2)//this work only when we have only two object
                    {
                        if(i==0)
                        {
                            tempAdd=head.next;

                        }
                        else
                        {
                            tempAdd=head.next;
                        }
                        head=null;
                        tempAdd.next=null;
                        tempAdd.prev=null;
                        head=tempAdd;  

                        return true;
                    }
                    if(i==0)//only that when we want remove first element
                    {
                    preAdd=head.prev;
                    nextAdd=head.next;
                    }
                    
                    //Change object of last node//this is checking if we are deleting last node,then it will update last node..values
                    if(lastNodeAdd.getWord().equalsIgnoreCase(head.getWord()))
                       lastNodeAdd=lastNodeAdd.getPrevAdd();
                head=head.getPrevAdd();//getting previous add of current node
                head.setNextAdd(nextAdd);//setting previous node and change add of next node
                head=head.getNextAdd();//this time ..it will provide us next add
                head.setPrevAdd(preAdd);//setting previous address of next node
                
                lenOfNode--;
                return true;
               }
               
               head=head.getNextAdd();
               preAdd=head.getPrevAdd();
               nextAdd=head.getNextAdd();
               
           
           }
		
              /*if(index < 1 || index > lenOfNode)
			return false;
		
		 ListNodeWord current = head;
		for(int i = 1; i < index; i++)
		{
			if(current.getNextAdd() == null)
				return false;
			
			current = current.getNextAdd();
		}
		current.setNextAdd(current.getNextAdd().getNextAdd());
		lenOfNode--; // decrement the number of elements variable
                * 
                */
		

            return false;
                
                
	}
	      
    
    
         
    public  ListNodeDB getFront()
    {
      return front;
    }
    public  ListNodeDB getLast()
    {
      return last;
    }
    public  void  printAllNodes()
    {
        ListNodeDB   currentNode=front;
             //while (currentNode.next != null) // system will not print last one becuause it takes next address
            while (currentNode != null) 
            {
                    
                System.out.println(currentNode.data);
                currentNode=currentNode.next;
                    
            }
    
    }
    public  void  printAllNodesFromLastToFirst()
    {
        ListNodeDB   currentNode=last;
             //while (currentNode.next != null) // system will not print last one becuause it takes next address
            while (currentNode != null) 
            {
                    
                System.out.println(currentNode.data);
                currentNode=currentNode.prev;
                    
            }
    
    }
    
}
