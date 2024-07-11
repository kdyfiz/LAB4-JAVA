/* QUESTION 4 (LAB 4)
 * SITI KHADIJAH ( 12 NOVEMBER 2021)
 */
import java.util.Scanner; //java statement
public class Day // class declaration
{
 public static void main (String [] args){ //main methode 
        
        Scanner s= new Scanner (System.in);//scanner object
                                           //to read the input by user
                                           // s is the shortcut of scanner
        
        System.out.println("   NUMBER          DAY");
        System.out.println("     0            SUNDAY");
        System.out.println("     1            MONDAY");
        System.out.println("     2            TUESDAY");
        System.out.println("     3            WEDNESDAY");
        System.out.println("     4            THURSDAY");
        System.out.println("     5            FRIDAY");
        System.out.println("     6            SATURDAY");
                                           
        //prompt the user to enter number base on the day                                             
        System.out.print("PLEASE ENTER NUMBER BASE ON DAY: ");
        int day =s.nextInt(); // declare day as integer  
        
        // to display the output base on day 
        if ( day==0  && day==6){
           System.out.println ("       Weekend");} // output if day=0 and day=6
          
        else if (day>=1 && day <=5 ){
           System.out.println ("       Weekday");}// output if day= 1-5
           
        else {
           System.out.println ("       Unknown DAY");} // output if day out of the range 
          
                                        }
                                    }
