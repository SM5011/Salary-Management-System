import java.util.*;

public class Profit {
    double revenue;
    double salary;
    double rent;
    double utilities;
    double net_profit;

    public void Profit(){
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter revenue :");
        revenue =  ac.nextDouble();
        System.out.println("Enter salary :");
        salary =  ac.nextDouble();
        System.out.println("Enter rent :");
        rent =  ac.nextDouble();
        System.out.println("Enter utilities :");
        utilities =  ac.nextDouble();
        
        net_profit = revenue - (salary + rent + utilities);

        System.out.println("net profit :"+net_profit);
    }
}
