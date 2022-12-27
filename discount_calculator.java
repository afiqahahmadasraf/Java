import java.util.Scanner;

  public class Lab2Question7{
       public static void main (String [] args){
          
           //declare variables
           int packages;
           
           //Scanner
           Scanner input = new Scanner(System.in);
           
           //Input
           System.out.print("Enter number of packages purchased: ");
           packages = input.nextInt();
           
           //condition
           
           if (packages < 10)
           {
               System.out.print("No discounts available. Total: $" +(packages*99));
               System.exit(0);
           }
           if (packages > 99)
            {
                System.out.println("Discount: $"+(packages*99*0.5)+ " Total: $"+ (packages*99));
                       
            }
           if (packages >= 10 && packages <= 19)
           {
               System.out.println("Discount: $"+ (packages*99*0.2) + " Total: $" + (packages*99));
           }
           else if (packages >= 20 && packages <= 49)
           {
               System.out.println("Discount: $"+ (packages*99*0.3) + " Total: $" + (packages*99));
           }
           else
           {
              System.out.println("Discount: $"+ (packages*99*0.4) + " Total: $" + (packages*99)); 
           }
          
       }
  }


        