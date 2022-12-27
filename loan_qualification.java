
        import javax.swing.JOptionPane; //standard library for dialogbox

        public class Lab2Question5 {
            public static void main (String [] args) {
                
               //declaration of variable
               double salary;
               String Input;
               double yearsOnJob;
               
               //Input
               Input = JOptionPane.showInputDialog ("Enter your annual salary: RM ");
               //convert the input to double
               salary = Double.parseDouble(Input);
               
                Input = JOptionPane.showInputDialog ("Enter the number of years that you have worked on your current job: ");
               //convert the input to double
               yearsOnJob = Double.parseDouble(Input);
               
               //checking condition
               if (salary >= 30000)
                       if (yearsOnJob >= 2 )
                       {
                       JOptionPane.showMessageDialog (null, "You qualify for the loan");
                       }
                       else
                       {
                       JOptionPane.showMessageDialog (null, "You must work at your current job for at least two years to qualify");
                       }
                       else
                       {
                       JOptionPane.showMessageDialog (null, "You must at least earn RM30,000 per year to qualify");
                       }
               
               System.exit(0); //clear the cache
            
            }
        }
