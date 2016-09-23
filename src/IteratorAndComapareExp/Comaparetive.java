/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorAndComapareExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author shk123
 */
public class Comaparetive 
{
    public static ArrayList<persons> arr=new ArrayList<>();
    public static void main(String[] args) 
    {
           addData();
           sortAarryByName();

    }
    public static void addData()
    {
         persons personObj= new persons("jkk", "--");
       for(int i=10; i>1;i--)
       {
           arr.add(new persons(i+"jkk", "--"));
         //  arr
           //System.out.println("IteratorAndComapareExp.Comaparetive.addData()");
       }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName());
        }
    }       
     public static void sortAarryByName()
    {
       // arr.sort(Comparator.comparing(persons::getName));
       Collections.sort((List<String>) Comparator.comparing(persons::getName));
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName());
        }
    }
    
    
}
