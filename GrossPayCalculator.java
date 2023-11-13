import java.util.Scanner;

import javax.net.ssl.SNIHostName;
public class GrossPayCalculator {

    public static void main(String[] args) {
        GrossPayCalculator demo = new GrossPayCalculator();

        Scanner scanner = new Scanner(System.in); 

        demo.getEmployeeName();

        System.out.println("Gross Pay Calculator");

        System.out.print("Press F for Full Time or P for Part Time: ");
        String sTime = scanner.nextLine();
        
        if (sTime.equalsIgnoreCase("P")) {
            System.out.println("--- Part Time Employee --- ");

            partTimeEmployee();

        } 
        else if (sTime.equalsIgnoreCase("F")) {
            System.out.println("--- Full Time Employee --- ");

            fullTimeEmployee();
            
        }
        else {
            demo.showInvalidMessage();
        }

    }
    public static String getEmployeeName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String sName = scanner.nextLine();
        return sName; 
    }
    public static void partTimeEmployee() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rate per hour: ");
        double ratePerHour = scanner.nextDouble();
           
        System.out.print("Enter no. of hours worked: ");
        int workHours= scanner.nextInt();
            
        System.out.print("Enter no. of overtime: ");
        int otHours = scanner.nextInt();

        System.out.println("---------------------------------");   

        double dBasicPay = ratePerHour * workHours;
        double dOvertimePay = otHours * (ratePerHour * 1.25);
        System.out.println("Basic Pay: " + dBasicPay);
        System.out.println("Overtime Pay: " + dOvertimePay);
        
        System.out.println("---------------------------------");

        double dSalary = dBasicPay + dOvertimePay;
        System.out.print("Gross Pay: " + dSalary);

    }
    public static void fullTimeEmployee() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter basic pay: ");
        double dPay = scanner.nextDouble();

        System.out.println("---------------------------------");
            
        System.out.println("Basic Pay: " + dPay);

        System.out.println("---------------------------------");

        System.out.print("Gross Pay: " + dPay);

    }
    public void showInvalidMessage() {
        System.out.println("Invalid letter: ERROR");
    }
    
}