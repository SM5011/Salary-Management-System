import java.util.*;

public class Lone {
    double ammount;
    int year;
    double intarest_rate;
    double intarest_ammount;
    double pay_per_month;
    //int ir;

    public void Lone(){
        Scanner ac = new Scanner(System.in);

        System.out.println("Enter the ammount :");
        ammount = ac.nextDouble();
        System.out.println("Enter the year :");
        year = ac.nextInt();
        
        intarest_rate = 8;

        for(int i = 1;i<=(year-1);i++){
            intarest_rate += 2;
        }

         System.out.println("Intarest rate :"+intarest_rate);

         intarest_ammount = ammount*intarest_rate/100;
         pay_per_month = (ammount + intarest_ammount)/(year*12);

         System.out.println("pay per month :"+pay_per_month);    
    }
}
