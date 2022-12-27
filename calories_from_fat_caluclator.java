import java.util.Scanner;

  public class Lab2Question8{
       public static void main (String [] args){
          
           //declare variables
           double calories;
           double fatGrams;
           double caloriesFromFat;
           double percentage;
           
           //Scanner
           Scanner input = new Scanner(System.in);
           
           //Input
           System.out.print("Enter number of calories: ");
           calories = input.nextDouble();
           System.out.print("Enter grams of fat: ");
           fatGrams = input.nextDouble ();
           
           //formula (process)
           caloriesFromFat = fatGrams * 9;
           percentage = caloriesFromFat / calories;
          
           //condition
           if (caloriesFromFat > calories){
               System.out.println("Invalid input");
               
           }else{
               
              if (caloriesFromFat < (30/100) * calories){
               System.out.println("The food is low in fat");   
           }
            System.out.printf("The percentage of calories that come from fat is %.2f%%", percentage);
               }
           }  
       }
  


        