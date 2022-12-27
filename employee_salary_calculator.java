        import javax.swing.JOptionPane; //standard library for dialogbox

        public class Question2 {
            public static void main (String [] args) {
                
               //declaration of variable
               String emp_Name;
               String Input;
               double hours;
               double payrate;
               int totalDaysWorked;
               double monthlySalary;
               
               emp_Name = JOptionPane.showInputDialog ("Enter the the employee name: ");
               Input = JOptionPane.showInputDialog ("Enter the number of hours worked per day: ");
               //convert the input to double
               hours = Double.parseDouble(Input);
               
               Input = JOptionPane.showInputDialog ("Enter the pay rate per day: ");
               //convert the input to double
               payrate = Double.parseDouble(Input);
               
               Input = JOptionPane.showInputDialog ("Enter the total number of days worked: ");
               //convert the input to double
               totalDaysWorked = Integer.parseInt(Input);
               
               //formula (process)
               monthlySalary = (hours*payrate) * totalDaysWorked;
               
               //Output
               JOptionPane.showMessageDialog (null, "The monthly salary of " + emp_Name + String.format (" is RM %.2f", monthlySalary));
                
                System.exit(0); //clear the cache
            
            }
        }