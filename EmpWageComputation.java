import java.util.Random;
public class EmpWageComputation {
    public static void main(String[] args) {
        Random rn = new Random();
        System.out.println("Welcome to Employee");
        System.out.println("Wage Computation");
        boolean employeeStatus = rn.nextBoolean();
        System.out.println((employeeStatus) ? "Present" : "Apsent");
    }    
}
