import java.util.HashSet;
import java.util.Scanner;

public class CustomerService {

    HashSet<Customer> cstmrset = new HashSet<Customer>();

    Customer cstmr1 = new Customer(1001, "Shohan", "Male", "Uttra");
    Customer cstmr2 = new Customer(1002, "Rabbi", "male", "Badda");
    Customer cstmr3 = new Customer(1003, "Prapty", "female", "Mirpur");
    Customer cstmr4 = new Customer(1001, "Shovon", "male", "Dhanmondi");

    Scanner in = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    String gender;
    String location;

    public CustomerService() {
        cstmrset.add(cstmr1);
        cstmrset.add(cstmr2);
        cstmrset.add(cstmr3);
        cstmrset.add(cstmr4);
    }

    // view all customer--
    public void viewallcstmr() {
        for (Customer cstmr : cstmrset) {
            System.out.println(cstmr);
        }
    }

    public void updatecstmr(){
       
        System.out.println("Enter id numder : ");
        id = in.nextInt();

        for(Customer cstmr : cstmrset){
            if(cstmr.getId() == id){

                System.out.println("Enter location :");
                location = in.next();

                cstmr.setLocation(location);
                System.out.println("Updated Details of Coutomer are: ");
                System.out.println(cstmr);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Coutomer is not present");
        } else {
            System.out.println("Coutomer details updated successfully !!");
        }


        
    }

}
