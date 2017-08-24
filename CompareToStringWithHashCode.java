/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesprac;

import java.util.*;
import java.io.*;
import java.lang.Object;

/**
 *
 * @author tomz123
 */
class CompareToStringWithHashCode
{

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here    
        Object myObject = new Object();
        System.out.println(myObject.toString());
        System.out.println(myObject.hashCode());
 
        String myString = "hello";
        System.out.println(myString.toString());
        System.out.println(myString.hashCode());
 
        Object[] myObjectArray = new Object[3];
        System.out.println(myObjectArray.toString());
        System.out.println(myObjectArray.hashCode());
 
        String[] myStringArray = new String[3];
        System.out.println(myStringArray.toString());
        System.out.println(myStringArray.hashCode());
 
        int[] myIntArray = new int[3];
        System.out.println(myIntArray.toString());
        System.out.println(myIntArray.hashCode());
 
        double[] myDoubleArray = new double[3];
        System.out.println(myDoubleArray.toString());
        System.out.println(myDoubleArray.hashCode());
 
        boolean[] myBooleanArray = new boolean[3];
        System.out.println(myBooleanArray.toString());
        System.out.println(myBooleanArray.hashCode());
    }
}
