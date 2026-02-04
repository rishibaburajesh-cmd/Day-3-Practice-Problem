import java.util.Random;

public class EmpWageComputation {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        
        Random rn = new Random();
        System.out.println("Welcome to Employee Wage Computation");
        boolean isPresent = rn.nextBoolean();

        int dailyWage = (isPresent) ? wagePerHour * fullDayHour : 0;

        System.out.println("Daily Employee Wage: " + dailyWage);
    }    
}