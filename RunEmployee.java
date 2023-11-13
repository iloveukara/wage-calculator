import java.util.Scanner; 
public class RunEmployee {
    public static void main(String[] args) {
        // main method contains the whole expected physical output 
        // as well as the if-else statements and the setters to store the variables
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();
        PartTimeEmployee eme = new PartTimeEmployee();
        FullTimeEmployee eem = new FullTimeEmployee();
        // this part of instanciations, i made an object for each class that 
        // that needs to call their methods
        // i did thid becuz the the main class' object RunEmployee doesnt work for each class

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        emp.setName(name); // storing the variable for name

        System.out.println("Enter F(full time) or P(part time): ");
        String sTime = scanner.nextLine(); 

        // if - else for P and F
        if (sTime.equalsIgnoreCase("P")) {

            System.out.println("Enter rate per hour and no. of hours worked seperated by space ");
            System.out.println("Example : 107.50 13");
            double ratePerHour = scanner.nextDouble();
            int hoursWorked = scanner.nextInt();
            eme.setWage(ratePerHour, hoursWorked); // stores the variable 

        } 
        else if (sTime.equalsIgnoreCase("F")) {

            System.out.println("Enter monthly salaray ");
            double monthlySalary = scanner.nextDouble();
            eem.setMonthlySalary(monthlySalary); // stores the variable
            
        }
        else {
            System.out.println("invalid message");
        }


        System.out.println("Name: " + emp.getName());
        // prints the variable stored for the setName


        if (sTime.equalsIgnoreCase("P")) {

            System.out.println("Wage: " + eme.getWage());
            // prints the variable stored set in setWage

        } 
        else if (sTime.equalsIgnoreCase("F")) {

            System.out.println("Wage: " + eem.getMonthlySalary());
            // prints the variable stored in seMonthlySalary
            
        }


    }

    public static class Employee {
        private String name; 
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getName() {
            return this.name; 
        }
    }
    public static class FullTimeEmployee {
        private double monthlySalary;

        public void setMonthlySalary(double monthlySalary) {
            this.monthlySalary = monthlySalary;
        }

        public double getMonthlySalary() {
            return this.monthlySalary;
        }

    }
    public static class PartTimeEmployee {
        private double ratePerHour;
        private int hoursWorked;
        private double wage;

        public void setWage(double ratePerHour, int hoursWorked) {
            this.ratePerHour = ratePerHour;
            this.hoursWorked = hoursWorked;
        }

        public double getWage() {
            double wage = this.ratePerHour * this.hoursWorked;
            return wage;
            //returns the product of ratePerHour and hoursWorked
        }
    }
}
