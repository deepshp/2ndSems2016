/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListImpliExp;

/**
 *
 * @author shk123
 */
 // Constructs and prints the list [3, 7, 12] by setting each
 // field of each node.

 public class Construct1Main 
 {
        public static void main(String[] args) {
        ListNode list = new ListNode();
        list.data = 3;
        list.next = new ListNode();
        list.next.data = 7;
        list.next.next = new ListNode();
        list.next.next.data = 12;
        list.next.next.next = null;
        System.out.println(list.data + " " + list.next.data + " "
        + list.next.next.data);
        }
 }
