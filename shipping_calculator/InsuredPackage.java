package ch10lb_gharion_merchant;

public class InsuredPackage extends Package {

    private double additionalCost;

    // Create an insured package object
    public InsuredPackage(double weight, char shippingMethod) {
        super(weight, shippingMethod);
    }

    // Calcualte the cost of the insured package which adds up the insurance cost
    @Override
    public void calculateCost() {
        super.calculateCost();
        
        // Identify the additional cost
        if (shippingCost >= 3.01) {
            additionalCost = 5.55;
        } else if (shippingCost >= 1.01) {
            additionalCost = 3.95;
        } else if (shippingCost >= 0) {
            additionalCost = 2.45;
        }

        shippingCost += additionalCost;
    }

    // Display the totals
    @Override
    public void display() {
        System.out.println("Additional Cost: $" + additionalCost);
        super.display();
    }
}
