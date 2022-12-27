  
        import javax.swing.JOptionPane; //standard library for dialogbox

        public class Lab2Question4 {
            public static void main (String [] args) {
                
               //declaration of variable
               double mealCharge;
               String Input;
               double tax;
               double tip;
               double total;
               
               //Input
               Input = JOptionPane.showInputDialog ("Enter the cost of the meal: ");
               //convert the input to double
               mealCharge = Double.parseDouble(Input);
               
               //formula (process)
               tax = 0.0675*mealCharge;
               tip = 0.2*(mealCharge+tax);
               total = mealCharge+tax+tip;
              
               //Output
               JOptionPane.showMessageDialog (null, "Meal cost"+ String.format (" is RM %.2f", mealCharge));
               JOptionPane.showMessageDialog (null, "Tax amount"+ String.format (" is RM %.2f", tax));
               JOptionPane.showMessageDialog (null, "Tip amount"+ String.format (" is RM %.2f", tip));
               JOptionPane.showMessageDialog (null, "Final total"+ String.format (" is RM %.2f", total));
               
               System.exit(0); //clear the cache
            
            }
        }
