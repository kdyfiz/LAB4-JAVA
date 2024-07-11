/* QUESTION 1 (LAB 4)
 * SITI KHADIJAH ( 8 NOVEMBER 2021)
 */

import java.util.Scanner; //java statement
public class Discount { //class declaration
    public static void main (String [] args){
        
        Scanner s= new java.util.Scanner (System.in); //scanner object
                                                      //to read the input by user
                                                      // s is the shortcut of scanner
        
         //prompt the user to enter the quantity                                             
        System.out.print("PLEASE ENTER THE QUANTITY: ");
        int quantity =s.nextInt();
        
        //declare and initializing PRICE
        final double PRICE =45.2; // make PRICE as constant 
                                  //declare PRICE as double 
                                  //initialize PRICE as 45.2
        
        //declare discount and newprice as double 
        double discount, newprice; 
        
        // check how much the quantity
        // to determine the discount 
         if (quantity > 99){
            discount=0.15*PRICE *quantity; }
            
         else if (quantity > 49){
            discount=0.1*PRICE *quantity; }
            
         else if (quantity > 29){
            discount=0.05*PRICE *quantity; }
            
         else if (quantity > 9){
            discount=0.03*PRICE *quantity; }
            
         else {
            discount=0; }   
        
        //compute newprice    
         newprice =PRICE*quantity-discount;
        
        //output statement to display result 
        System.out.println("The quantity is: " +quantity);
        System.out.printf("The discount is RM : %.2f" ,discount  );
        System.out.printf("The price after discount is RM: %.2f" ,newprice);
        
        
    }
}
