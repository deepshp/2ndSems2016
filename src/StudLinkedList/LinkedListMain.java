/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudLinkedList;

/**
 *
 * @author shk123
 */
public class LinkedListMain
{
     public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(8);
        list.add(23);
        list.add(19);
        list.add(7);
        list.add(45);
        list.add(98);
        list.add(102);
        list.add(4);

        System.out.println(list);

        list.rotate();
System.out.println(list);
         list.remove(7);

        System.out.println(list);
    }
    
}
