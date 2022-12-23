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
public class Cylinder extends Circle {
   private double Height=1.0;
   
   public void Cylinder(double height ){
       
   }
   public void Cylinder (double height, double Raduis){
       
   }
      public void Cylinder (double height, double Raduis,String color){
       
   }
      public double Getreduis(){
          
        return raduis;
    }
    public void setRaduis(double Raduis){
        this.raduis=Raduis;
    }
    public String GetColor(){
        return color;
    }
    public void SetColor(String Color ){
        this.color = Color;
    }
    public double Getheight(){
        return Height;
    }
    public void setheight(double height){
        this.Height=height;
    }
      public double Getvolume(){
          double a = GetArea()*Getheight();
        return a;
    }
   
}
