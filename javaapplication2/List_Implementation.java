package javaapplication2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class List_Implementation {
    public static void main(String[] args) {
        
        ArrayList<String> arrList =new ArrayList<>();
        arrList.add("yashin");
        arrList.add("Qamar");
        arrList.add("Anshul");
        arrList.add("yashin");
        arrList.add("Nehal");
        arrList.add("Vivek");
        
        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("yashin");
        linkList.add("Qamar");
        linkList.add("Anshul");
        linkList.add("yashin");
        linkList.add("Nehal");
        linkList.add("Vivek");
        
        Vector<String> vec = new Vector<>();
        vec.add("yashin");
        vec.add("Qamar");
        vec.add("Anshul");
        vec.add("yashin");
        vec.add("Nehal");
        vec.add("Vivek");
        
        System.out.println(arrList.equals(linkList));
        System.out.println(linkList.equals(vec));
        System.out.println(vec.equals(arrList));
        
    }
    
}
