/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerorder;

/**
 *
 * 
 */
public class CustomerOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Order order;
        
        int ordNum = 1234;
        double ordAmount = 580.00;
        double discountPer = .1;
        order = new Order(ordNum, ordAmount, discountPer);
        double finalAmount = order.finalOrderTotal();
     
     System.out.printf("So, your order amount = $%,.2f\n", finalAmount);


        
    }
    
}
