import java.util.Scanner;

public class Main {

    public static void menu() {

        System.out.println("----ABC Company Limited----"
                + "\n1. Manager Details"
                + "\n2. Employee Details"
                + "\n3. Customers Details"
                + "\n4. Products Details"
                + "\n5. Salary"
                + "\n6. Profit"
                + "\n7. Lone Details"
                + "\n8. Exits");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        menu();
        System.out.println("Enter your choice :");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Manager Details ::"
                        + "\n1. Know about Manager."
                        + "\n2. Update Manager Details.");

                System.out.println("Enter your choice : ");
                int c1 = in.nextInt();

                MenagerService mngser = new MenagerService();
                switch (c1) {
                    case 1:
                        mngser.viewmngdetails();
                        break;

                    case 2:
                        mngser.updatemng();
                        break;

                    default:
                        System.out.println("Enter valid number.");
                        break;

                }

                break;

            case 2:
                System.out.println("Employee Details :::"
                        + "\n1. View employee"
                        + "\n2. View All-employee"
                        + "\n3. Add-employee"
                        + "\n4. Delete-employee"
                        + "\n5. Update-employee");

                System.out.println("Enter your choice : ");
                int c2 = in.nextInt();
                EmployeeService empser = new EmployeeService();
                switch (c2) {
                    case 1:
                        empser.viewEmp();
                        break;

                    case 2:
                        empser.viewAllEmps();
                        break;

                    case 3:
                        empser.addEmp();
                        break;

                    case 4:
                        empser.deleteEmp();
                        break;

                    case 5:
                        empser.updateEmployee();
                        break;

                    default:
                        System.out.println("Enter valid number.");
                        break;
                }

                break;

            case 3:
                System.out.println("Customers Details ::"
                        + "\n1. View all customers"
                        + "\n3. Update details");

                System.out.println("Enter your choice : ");
                int c3 = in.nextInt();
                CustomerService cstmrser = new CustomerService();
                switch (c3) {
                    case 1:
                        cstmrser.viewallcstmr();
                        break;
                    case 2:
                        cstmrser.updatecstmr();
                        break;

                }
                break;

            case 4:
                System.out.println("Products Details ::"
                        + "\n1. View all products"
                        + "\n2. View a product"
                        + "\n3. Add products"
                        + "\n4. Remove products"
                        + "\n5. Update product details");

                System.out.println("Enter your choice : ");
                int c4 = in.nextInt();
                ProductService prdtser = new ProductService();
                switch (c4) {
                    case 1:
                        prdtser.viewallprdt();
                        break;
                    case 2:
                        prdtser.viewprdt();
                        break;
                    case 3:
                        prdtser.addprdt();
                        break;
                    case 4:
                        prdtser.deleteprdt();
                        break;
                }
                break;

            case 5:
                System.out.println("Salary details ::");
                Salary salser = new Salary();
                salser.Salary();
                break;

            case 6:
                System.out.println("Profit details::");
                Profit pftser = new Profit();
                pftser.Profit();
                break;

            case 7:
                System.out.println("Lone Details ::");
                Lone lnser = new Lone();
                lnser.Lone();
                break;

            case 8:
                System.out.println("Thank you for using this applicaton");
                System.exit(0);
                break;

            default:
                System.out.println("Please enter valid number..");
                break;
        }

    }

}