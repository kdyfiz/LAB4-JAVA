/* QUESTION 3 (LAB 4)
 * SITI KHADIJAH ( 9 NOVEMBER 2021)
 */
import java.util.Scanner; //java statement

public class Menu { //class declaration
    public static void main (String [] args){
        Scanner s= new java.util.Scanner (System.in); //scanner object
                                                      //to read the input by user
                                                      // s is the shortcut of scanner 
        
        System.out.println("          CODE   MENU             PRICE");
        System.out.println("           1     Steak            RM 29.50");
        System.out.println("           2     Grill chicken    RM 19.50");
        System.out.println("           3     Pasta            RM 15.00");
        System.out.println("           4     Drinks           RM 4.90");
        System.out.println(" ");
        System.out.println("            PLEASE ENTER ' 0 ' TO QUIT ");
        System.out.println(" ");
        
        System.out.print(" Please Enter The Code of The Menu : ");
        int code = s.nextInt();
        
        System.out.print(" Please Enter The Quantity : ");
        int quantity = s.nextInt();
        
        System.out.println(" ");
        
        String menu;
        double price;
        double totalprice;
            // switch statement to check price of the menu code 
            // calculate the total price 
            // display the result
           switch (code) {

          case 0:
            System.out.println("          YOU ARE QUIT  THE APPLICATION ");
            break;
      
          case 1:
            price= 29.5 ;
            totalprice= price * quantity;
            menu= "Steak";
            System.out.println("     MENU     PRICE     QUANTITY    TOTAL PRICE ");
            System.out.printf( "     Steak    %.2f       %d         %.2f " , price, quantity, totalprice);
            break;

          case 2:
            price= 19.5 ;
            menu= "Grill Chicken";
            totalprice= price * quantity;
            System.out.println("     MENU             PRICE      QUANTITY   TOTAL PRICE ");
            System.out.printf( "     Grill Chicken    %.2f       %d         %.2f " , price, quantity, totalprice);
            break;

          case 3:
            price= 15 ;
            menu = "Pasta";
            totalprice= price * quantity;
            System.out.println("     MENU      PRICE     QUANTITY    TOTAL PRICE ");
            System.out.printf( "     Pasta     %.2f       %d         %.2f " , price, quantity, totalprice);
            break;

          case 4:
            price= 4.9 ;
            menu = "Drinks";
            totalprice= price * quantity;
            System.out.println("     MENU      PRICE     QUANTITY    TOTAL PRICE ");
            System.out.printf( "     Drinks    %.2f       %d         %.2f " , price, quantity, totalprice);
            break;
            
          default:
            System.out.println("     Uknown");
            break;
        }
      
            


        
        
                                                    }
                                                }