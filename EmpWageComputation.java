import java.util.Random;

public class EmpWageComputation {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 8;
        
        Random rn = new Random();
        int fixedRole = rn.nextInt(2) + 1;
        System.out.println("Welcome to Employee Wage Computation");

        int dailyWage = 0;
        int employeeHours = 0;

        for (int i = 1; i <= 20; i++) {
            boolean employeeCheck = rn.nextBoolean();
            if (employeeCheck) {
                switch (fixedRole) {
                    case 1:
                        employeeHours = fullDayHour;
                        break;
                
                    default:
                        employeeHours = partTimeHour;
                        break;
                }
            } else {
                employeeHours = 0;
            }
            dailyWage += employeeHours * wagePerHour;
        }

        System.out.println("Daily Employee Wage: " + dailyWage);
    }    
}