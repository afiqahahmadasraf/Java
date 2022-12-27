import java.util.Scanner;

  public class Lab2Question6{
       public static void main (String [] args){
          
           //declare variables
           int score;
           char grade;
           
           //Scanner
           Scanner input = new Scanner(System.in);
           
           //Input
           System.out.print("Enter test score: ");
           score = input.nextInt();
           
           //condition
           if (score >= 90)
           {
               grade ='A';
           }
           else if (score >= 80)
           {
               grade = 'B';
           }
           else if (score >= 70)
           {
               grade = 'C';
           }
           else if (score >= 60)
           {
               grade = 'D';
           }
           else
           {
               grade = 'F';
           }
          
           //Output
           System.out.println("The grade is "+grade);
       }
  }


        