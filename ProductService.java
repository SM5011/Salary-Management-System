
//import java.util.HashSet;
import java.util.*;

public class ProductService {

    HashSet<Product> prdtset = new HashSet<Product>();

    Product prdt1 = new Product(10001, "Desktop", 50000, "rgb");
    Product prdt2 = new Product(10002, "Motherboard", 35000, "rgb");
    Product prdt3 = new Product(10003, "RAM", 8000, "8GB");
    Product prdt4 = new Product(10004, "SSD", 50000, "128GB");

    Scanner in = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    double prize;
    String Details;

    public ProductService() {
        prdtset.add(prdt1);
        prdtset.add(prdt2);
        prdtset.add(prdt3);
        prdtset.add(prdt4);
    }

    // view all products

    public void viewallprdt() {
        for (Product prdt : prdtset) {
            System.out.println(prdt);
        }
    }

    // view a product
    public void viewprdt() {
        System.out.println("Enter Product id :");
        id = in.nextInt();

        for (Product prdt : prdtset) {
            if (prdt.getId() == id) {
                System.out.println(prdt);
                found = true;
            }
            if (!found) {
                System.out.println("Product with this id is not present");
            }
        }

    }

    // add product
    public void addprdt() {
        System.out.println("Enter product id :");
        id = in.nextInt();
        System.out.println("Enter product name :");
        name = in.nextLine();
        System.out.println("Enter product prize :");
        prize = in.nextDouble();
        System.out.println("Enter product details :");
        Details = in.nextLine();

        Product prdt = new Product(id, name, prize, Details);
        prdtset.add(prdt);
        System.out.println("Your product is added successfully..");
        System.out.println(prdt);

    }

    //delete product
    public void deleteprdt(){
        System.out.println("Enter Product id :");
        id = in.nextInt();
        //String deletepdt = null;

        for (Product prdt : prdtset) {
            if (prdt.getId() == id) {
                prdt = null;
                System.out.println("Your product is deleted successfully..");
                found = true;
            }
            
        }
        if (!found) {
            System.out.println("Product with this id is not present");
        }

    }
}
