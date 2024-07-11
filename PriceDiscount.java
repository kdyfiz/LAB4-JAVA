/* QUESTION 2 (LAB 4)
 * SITI KHADIJAH ( 8 NOVEMBER 2021)
 */
import java.util.Scanner; //java statement
public class PriceDiscount { //class declaration
    
    public static void main (String [] args){
        
        Scanner s= new java.util.Scanner (System.in); //scanner object
                                                      //to read the input by user
                                                      // s is the shortcut of scanner
        
         //prompt the user to enter the unit                                             
        System.out.print("PLEASE ENTER THE TOTAL UNIT: ");
        int unit =s.nextInt(); //declare the unit (total unit) as integer
        
         //prompt the user to enter the price
        System.out.print("PLEASE ENTER THE PRICE ");
        double price =s.nextDouble();//declare the price as double
        
        double discount; //declare discount as double
        
        // check how much the unit
        // check how much the price
        // determine the discount base on the price and the unit
        if  ( unit >999){
          if (price  > 100){
           discount =   0.43*price;}
          else if (price > 10){
              discount = 0.32*price;}
          else {
              discount = 0.21*price;}}

        else if  ( unit >499){
          if (price  > 100)
            discount =   0.32*price;
          else if (price > 10)
            discount = 0.23*price;
          else 
            discount = 0.14*price;}

        else if  ( unit >99){
          if (price  > 100)
            discount =   0.09*price;
         else if (price > 10)
            discount = 0.07*price;
          else 
            discount = 0.05*price;}

        else  {
         if (price  > 100)
            discount =   0.05*price;
         else if (price > 10)
            discount = 0.02*price;
         else 
            discount = 0*price;}

       ////compute newprice 
       
       double new_price = price * unit - discount ;
       
       //output statement to display result
       System.out.println("    PRICE      TOTAL UNIT      DISCOUNT      TOTAL PRICE");
       System.out.printf("    RM %.2f       %d          RM %.2f        RM %.2f",price,unit,discount,new_price);
     }
}