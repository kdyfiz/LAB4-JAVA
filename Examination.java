/* QUESTION 5 (LAB 4)
 * SITI KHADIJAH ( 9 NOVEMBER 2021)
 */
import java.util.Scanner; //java statement

// java program to illustrate the setRoundingMode() method 
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Examination { //class declaration
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
            double p_test1=0;
            if (test1>-1 && test1<41){
            //to calculate first test mark 
             p_test1 = (test1/40) * 15; //to calculate percentage first test mark  ; 
          }
            else { //output if test 1 mark not in range
            System.out.println("                 YOU INPUT THE WRONG MARK !");
             
          }
           
        
        System.out.print("            Second Test: ");
        double test2 = s.nextDouble();
              double p_test2 =0;
             if (test2>-1 && test2<51){
              //to calculate second test mark
               p_test2 = (test2/50)*20;//to calculate percentage second test mark;
          }
            else {  //output if test 2 mark not in range
            System.out.println("                 YOU INPUT THE WRONG MARK !");
          }
             
         //prompt the user to enter assignment1
         System.out.print("            Assignment 1: ");
         double assg1 = s.nextDouble();
          
         //prompt the user to enter assignment2
         System.out.print("            Assignment 2: ");
         double assg2 = s.nextDouble();
          
         //prompt the user to enter assignment3
         System.out.print("            Assignment 3: ");
         double assg3 = s.nextDouble(); 
            
               double assg = assg1 + assg2 + assg3 ;
               double p_assg =0;
                if (assg>-1 && assg<91){
                     //to calculate all the assignments mark
                     p_assg = (assg)*35 ; //to calculate percentage all the assignments mark
                  }
                else { //output if total assignment mark not in range
                     System.out.println("                 YOU INPUT THE WRONG MARK !");}
               
         //prompt the user to enter the final exam score
         System.out.print("            Final Examination: ");
         double exam = s.nextDouble();
             double p_exam =0;
            if (exam>-1 && exam<81){
                 // to calculate final exam mark
                  p_exam = (exam)*30;}  // to calculate percentage final exam mark
                else { //output if exam mark not in range
                System.out.println("                 YOU INPUT THE WRONG MARK !");}
             
          
          
          double pexam = (exam)*30;  // to calculate percentage final exam mark
          double total_mark = p_test1 + p_test2 + p_assg + p_exam ; //to calculate the total mark
        
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
          
        
        // Set the rounding mode as UP
        df.setRoundingMode(RoundingMode.UP);
        //output statement to display the result 
        System.out.println("******************************* *********************************** ******************************* ");
        
        System.out.println(" ");
        System.out.println("MATRIC  FIRST TEST      SECOND TEST     ASG1    ASG2    ASG3    ASG-TOTAL     FINAL EXAMINATION");
        System.out.print(matric + "\t" + df.format(test1)+"(15%)" +"\t"+ df.format(test2)+"(20%)" +"\t" +assg1 +"\t" +assg2 +"\t" +assg3 +"\t" );
        System.out.print(df.format(assg)+"(35%)" +"\t" +df.format(exam)+"(30%)");
        System.out.println(" ");
        System.out.printf( " \n                      " +matric +" TOTAL MARK IS : %.2f ",total_mark );
        System.out.print("% ");
        System.out.println( " \n                            YOUR GRADE IS :" +grade );
        System.out.println("\n ******************************* *********************************** ******************************* ");
        
        
        
        
        
    }
}
