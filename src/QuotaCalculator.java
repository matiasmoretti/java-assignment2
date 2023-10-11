import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) throws Exception {
        
        double payment = 50000.00;
        int bonus = 3000;
        int quota = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("How many sales the employee made?");
        int sales = input.nextInt();

        if (sales >= quota) {
            System.out.println("The final payment for this employee after the bonus is " + (payment+bonus) + "."); 
        } else {
            System.out.println("This employee was unable to make a quota and they were "+ (quota-sales) + " sales short");
        }

        input.close();
    }
}
