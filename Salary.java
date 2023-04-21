import java.util.*;

public class Salary {
    int working_day;
    int total_hours;
    int overtime;
    double payperhr;
    double incremet;
    double bonus;
    double salary;
    // int minimum_working_hours_perday;

    public void Salary() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter total working days in mounth :");
        working_day = in.nextInt();
        System.out.println("Enter total hours in mounth :");
        total_hours = in.nextInt();
        System.out.println("Enter the ammount per hours :");
        payperhr = in.nextDouble();
        System.out.println("Enter increment for over time :  %");
        incremet = in.nextDouble();
        System.out.println("Enter bonus :");
        bonus = in.nextDouble();

        overtime = total_hours - (working_day * 7);
        double increment1 =payperhr + (payperhr*incremet/100);
        double payment_for_overtime = overtime*increment1;
        salary = (total_hours - overtime) * payperhr + payment_for_overtime + bonus;

        System.out.println("Over time :" + overtime
                        +"\nPayment_for_overtime"+payment_for_overtime
                        +"\nBonus :"+bonus
                        +"\nTotal Salary :" + salary);
    }

}
