/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author EL RWAD
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circle c1 = new Circle ();
       Cylinder CY1 = new Cylinder();
       c1.Circle(5.0, "Green");
       System .out .println("the color is "+ c1.GetColor());
       c1.SetColor("Yellow");
       System .out .println("the New color is "+ c1.GetColor());
        System .out .println("Circle Area = "+  c1.GetArea());
       c1.setRaduis(2.5);
       System .out .println("the New raduis is "+c1.Getreduis());    
       System .out .println( c1.toString());
       System .out .println("Circle New Area = "+  c1.GetArea());
       /*---------------------------------------------*/
       CY1.Cylinder(2.0, 5.5, "red");
       System .out .println("the color of cylinder is "+ CY1.GetColor());
       CY1.SetColor("Yellow");
       System .out .println("the New color of cylinder is "+ CY1.GetColor());
       CY1.setRaduis(2.5);
       System .out .println("the New raduis of cylinder is "+CY1.Getreduis()); 
       System .out .println("Cylinder Volume = "+  CY1.Getvolume());
         CY1.setheight(3.5);
       System .out .println("the New height is "+CY1.Getheight());    
        System .out .println( CY1.toString());
       System .out .println("Cylinder New Volume = "+  CY1.Getvolume());
       
       
       
       
         
       
    }
    
}
