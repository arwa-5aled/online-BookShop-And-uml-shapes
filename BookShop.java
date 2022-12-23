/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshop;

/**
 *
 * @author EL RWAD
 */
public class BookShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       product [] array = new product[4];
       array[0]=new book();
       array[1]=new book();
       array[2]=new ChildrenBook();
       array[3]=new Cartoon();
       double sum =0;
       for (int i = 0; i <4; i++){
           sum=sum +array[i].price();
       }
       System.out.println ("the avrg of prices = "+(sum));
    }
    
}
