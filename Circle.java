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
public class Circle {
     double raduis = 1.0;
     String color= "red";
    
    public void Circle(double raduis){
        
    }
    public void Circle(double raduis,String color){
        
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
    public double GetArea()
    {
        return 3.14*raduis*raduis;
    }
    
    
}
