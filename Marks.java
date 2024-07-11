/* QUESTION 5 (LAB 4)
 * SITI KHADIJAH ( 9 NOVEMBER 2021)
 */
import java.util.Scanner; //java statement
 
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Marks { //class declaration
    private static final DecimalFormat df = new DecimalFormat("0.000");// java decimal format
                                                                       //Take one integer and two decimal
    public static void main (String [] args){
        Scanner s= new java.util.Scanner (System.in); //scanner object
                                                      //to read the input by user
                                                      // s is the shortcut of scanner
        
        //output statement
        System.out.println("***********************  MARKS EVALUATION APPLICATION FOR CSC3100 COURSE  ********************** ");
        
        System.out.println(" ");
        
        //prompt the user to enter the mark for matric
        System.out.print("  Please enter the mark for matric: ");
        //assign input statement to a variable
        int matric = s.nextInt(); // declare matric number as a integer
        
        //prompt the user to enter first test
        System.out.print("            First Test: ");
        double test1 = s.nextDouble(); // first test as a test1
                                       // declare test1 as a double
         
            
            double ptest1 = (test1/40) * 15; //to calculate percentage first test mark 
        
        System.out.print("            Second Test: ");
        double test2 = s.nextDouble();
              //to calculate second test mark
            
              double ptest2 = (test2/50)*20;//to calculate percentage second test mark
         
              //prompt the user to enter assignment1
         System.out.print("            Assignment 1: ");
         double assg1 = s.nextDouble();
        
         //prompt the user to enter assignment2
         System.out.print("            Assignment 2: ");
         double assg2 = s.nextDouble();
         
         //prompt the user to enter assignment3
         System.out.print("            Assignment 3: ");
         double assg3 = s.nextDouble(); 
        
               //to calculate all the assignments mark
               double assg = ((assg1 + assg2 + assg3)) ;
               double passg = (assg/90)*35 ; //to calculate percentage all the assignments mark
               
         //prompt the user to enter the final exam score
         System.out.print("            Final Examination: ");
         double exam = s.nextDouble();
            
              
              double pexam = (exam/80)*30;  // to calculate percentage final exam mark
        
              //to calculate the total mark
        double total_mark = ptest1 + ptest2 + passg + pexam ; 
        
        String grade; // declare grade as string 
             
        // to check the grade base on total mark
         if (total_mark>100){
            grade = "INVALID";}
         else if(total_mark>=80)
           grade= "A";
         else if(total_mark>=75){
            grade= "A-" ;}
         else if(total_mark>=70){
            grade= "B+";}
         else if(total_mark>=65){
            grade= "B";}
         else if(total_mark>=60){
            grade= "B-";}
         else if(total_mark>=55){
            grade= "C+";}
         else if(total_mark>=50){
            grade= "C";}
         else if(total_mark>=47){
            grade= "C-";}
         else if(total_mark>=44){
            grade= "D+";}
         else if(total_mark>=40){
            grade= "D";}
         else {
            grade="F";}
        
        
        df.setRoundingMode(RoundingMode.UP);
        //output statement
        System.out.println("******************************* *********************************** ******************************* ");
        
        System.out.println(" ");
        System.out.println("MATRIC  FIRST TEST      SECOND TEST     ASG1    ASG2    ASG3    ASG-TOTAL     FINAL EXAMINATION");
        System.out.print(matric + "\t" + df.format(ptest1)+"%   " +"\t"+ df.format(ptest2)+"%   " +"\t" +assg1 +"\t" +assg2 +"\t" +assg3 +"\t" );
        System.out.print(df.format(passg)+"%    " +"\t" +df.format(pexam)+"%    ");
        System.out.println(" ");
        System.out.printf( " \n                      " +matric +" TOTAL MARK IS : %.2f ",total_mark );
        System.out.print("% ");
        System.out.println( " \n                            YOUR GRADE IS :" +grade );
        System.out.println("\n ******************************* *********************************** ******************************* ");
        
        
        
        
        
    }
}
