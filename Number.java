/* QUESTION 6 (LAB 4)
 * SITI KHADIJAH ( 9 NOVEMBER 2021)
 */
import java.util.Scanner; //java statement
public class Number // class declaration
{
 public static void main (String [] args){ //main methode 
        
        Scanner s= new Scanner (System.in);//scanner object
                                           //to read the input by user
                                           // s is the shortcut of scanner
        
        //output to prompt the user to enter the number        
        System.out.print("Enter number: ");
        int num =s.nextInt(); // declare number (num) as integer 
        
        String result; //declare result as string
        
           // to check if number%3 will get 0 or not 
           if (num % 3 == 0) 
             result = "Divisible by 3 :" +num; // result if number%3 get 0
           else
             result = "NOT Divisible by 3 : " +num; // result if number%3 did not get 0
             
             
        //(num % 3 == 0)  ? result = "Divisible by 3 :" +num : result = "NOT Divisible by 3 : " +num;
        
        result = (num % 3 == 0)  ? "Divisible by 3 :" +num : "NOT Divisible by 3 : " +num;
        
        
             // output statement and print the result 
             System.out.println(result);
        
        
        
        
    }
}