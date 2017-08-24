/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesprac;

/**
 *
 * @author tomz123
 */

    interface Shape
{
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape
{
    public double calculateArea()
    {
        return 0.0;
    }
    public double calculatePerimeter()
    {
        return 0.0;
    }
}

class InterfaceImplementedDemoTest
{
  public static void main(String[] args)
  {
  }
}

