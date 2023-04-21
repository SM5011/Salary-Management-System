import java.util.HashSet;
import java.util.Scanner;

public class MenagerService {

    HashSet<Menager> mngset = new HashSet<Menager>();

    Menager mng = new Menager(100, " tarokh", 40, "catlin", 4500);

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String address;
    double salary;

    public MenagerService() {
        mngset.add(mng);
    }

    public void viewmngdetails() {
        System.out.println(mng);
    }

    public void updatemng() {
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age :");
        age = sc.nextInt();
        System.out.println("Enter new Salary");
        salary = sc.nextDouble();
        mng.setName(name);
        mng.setAge(age);
        mng.setSalary(salary);
        System.out.println("Updated Details of employee are: ");
        System.out.println(mng);
    }

}
