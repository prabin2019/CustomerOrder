/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerorder;

/**
 *
 * @author b331-u13
 */
public class Order {
    
     private int orderNum;
     private double orderAmount; 
     private double orderDiscount; 
     public Order(int orderNumber, double orderAmt,double orderDisc) 
{ 
     orderNum = orderNumber;
     //this is a comment
     orderAmount = orderAmt;
     var name = "ram";
     orderDiscount = orderDisc;
} 

public double finalOrderTotal() 
{ 
     return orderAmount - orderAmount * orderDiscount;
} 
    
}
