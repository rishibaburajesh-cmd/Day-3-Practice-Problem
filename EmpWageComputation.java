import java.util.Random;

public class EmpWageComputation {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 8;
        
        Random rn = new Random();
        System.out.println("Welcome to Employee Wage Computation");
        int employeeCheck = rn.nextInt(3);

        int dailyWage = 0;
        int employeeHours = 0;
        if(employeeCheck == 1) {
            System.out.println("Full Time Employee");
            employeeHours = fullDayHour;
        } else if (employeeCheck == 2) {
            System.out.println("Part Time Employee");
            employeeHours = partTimeHour;
        } else {
            System.out.println("Employee is Apsent");
        }

        dailyWage = employeeHours * wagePerHour;

        System.out.println("Daily Employee Wage: " + dailyWage);
    }    
}