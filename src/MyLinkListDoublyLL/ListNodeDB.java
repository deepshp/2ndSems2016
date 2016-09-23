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
public class ListNodeDB 
{
    
    public int data; 
    public ListNodeDB next;
    public ListNodeDB prev;
    
    
  
    
    public ListNodeDB(int data,ListNodeDB next,ListNodeDB prev)
    {
      this.data=data;
      this.next=next;
      this.prev=prev;
    }
    
    
}
