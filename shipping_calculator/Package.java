package ch10lb_gharion_merchant;

public class Package {

    private double weight;
    private char shippingMethod;
    protected double shippingCost;

    // Create a package object
    public Package(double weight, char shippingMethod) {
        this.weight = weight;
        this.shippingMethod = shippingMethod;

        calculateCost();
    }
    
    // Calculate the shipping cost
    public void calculateCost() {
        switch (shippingMethod) {
            case 'A':
                if (weight >= 17) {
                    shippingCost = 4.50;
                } else if (weight >= 9) {
                    shippingCost = 3.00;
                } else if (weight >= 1) {
                    shippingCost = 2.00;
                }

                break;

            case 'T':
                if (weight >= 17) {
                    shippingCost = 3.25;
                } else if (weight >= 9) {
                    shippingCost = 2.35;
                } else if (weight >= 1) {
                    shippingCost = 1.50;
                }
                
                break;

            case 'M':
                if (weight >= 17) {
                    shippingCost = 2.15;
                } else if (weight >= 9) {
                    shippingCost = 1.50;
                } else if (weight >= 1) {
                    shippingCost = 0.50;
                }
                
                break;
        }
    }
    
    // Display the chipping cost
    public void display() {
        System.out.println("Weight: " + weight);
        System.out.println("Shipping Method: " + shippingMethod);
        System.out.println("Shipping Cost: $" + shippingCost);
    }
}
