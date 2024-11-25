import java.util.Scanner;

public class Customer {
    static String[] customers = new String[5];

    public static void main(String[] args) {

        inputCustomerData();
        displayCustomerData();

    }
    public static void inputCustomerData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < customers.length; i++) {
            String firstName, lastName;

            do {
                System.out.print("Enter first name of customer # " + (i + 1) + ": ");
                firstName = sc.nextLine().trim();
                if(firstName.isEmpty()) {
                    System.out.println("First name cannot be empty! Please try again.");
                }
            } while (firstName.isEmpty());

            do {
                System.out.print("Enter last name of customer # " + (i + 1) + ": ");
                lastName = sc.nextLine().trim();
                if (lastName.isEmpty()) {
                    System.out.println("last name cannot be empty!Please try again.");
                }
            }while (lastName.isEmpty());

            customers[i] = firstName +" "+lastName;
            System.out.println("Customer #"+ (i+1) +" name is saved as: "+ customers[i]);
        }
    }

    public static void displayCustomerData(){
        for (int i = 0; i < customers.length; i++){
            System.out.println("Customer number " + (i+1)+" saved in the array is: "+customers[i]);
        }
    }
}


