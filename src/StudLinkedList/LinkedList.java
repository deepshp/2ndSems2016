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
public class LinkedList {
    private ListNode front;

    public LinkedList() {
        front = null;
    }

    public void add(int value) {

        if(front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void add(int index, int value) {
        if(index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    public int size() {
        int count = 0;
        ListNode current = front;
        while(current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public void remove(int index) {
        if(index == 0) 
        {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    public int get(int index) {
        return nodeAt(index).data;
    }

    private ListNode nodeAt(int index) {
        ListNode current = front;

        for(int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while(current != null) {
            if(current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public void rotate() {
        ListNode temp = front;
        front = front.next;
        nodeAt(size() - 1).next = temp;
        temp.next = null;
    }

    public String toString()
    {
        if(front == null)
        {
            return "";
        } 
        else 
        {
                    String result = "" + front.data;
                    ListNode current = front.next;
            while(current != null) 
            {
                result += " " + current.data;
                current = current.next;
            }

            return result;
        }
    }
}
