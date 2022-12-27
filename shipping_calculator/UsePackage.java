package ch10lb_gharion_merchant;

public class UsePackage {

    // Test the packages
    public void run() {
        // Test 3 package objects
        Package packA = new Package(9, 'A');
        Package packT = new Package(1, 'T');
        Package packM = new Package(17, 'M');

        System.out.println("Package A");
        packA.display();
        System.out.println();

        System.out.println("Package T");
        packT.display();
        System.out.println();

        System.out.println("Package M");
        packM.display();
        System.out.println();

        // Test 3 insured package objects
        Package insPackA = new InsuredPackage(9, 'A');
        Package insPackT = new InsuredPackage(1, 'T');
        Package insPackM = new InsuredPackage(17, 'M');

        System.out.println("Insured Package A");
        insPackA.display();
        System.out.println();

        System.out.println("Insured Package T");
        insPackT.display();
        System.out.println();

        System.out.println("Insured Package M");
        insPackM.display();
        System.out.println();
    }
}
