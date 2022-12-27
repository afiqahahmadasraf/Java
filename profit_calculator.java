
        import javax.swing.JOptionPane; //standard library for dialogbox

        public class Lab2Question3 {
            public static void main (String [] args) {
                
               //declaration of variable
               double profit;
               String Input;
               double retailPrice;
               
               //Input
               Input = JOptionPane.showInputDialog ("Enter the retail price of a circuit board: ");
               //convert the input to double
               retailPrice = Double.parseDouble(Input);
               
               //formula (process)
               profit = retailPrice*0.4;
               
               //Output
               JOptionPane.showMessageDialog (null, "The profit earned" + String.format (" is RM %.2f", profit));
               
               System.exit(0); //clear the cache
            
            }
        }
