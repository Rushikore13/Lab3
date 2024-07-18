package demo.rk;
import java.util.Scanner;
class ShowRoom {
    // Instance variables
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    // Default constructor
    public ShowRoom() {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    // Method to input customer details
    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        name = scanner.nextLine();

        System.out.print("Enter mobile number: ");
        mobno = scanner.nextLong();

        System.out.print("Enter cost of items purchased: ");
        cost = scanner.nextDouble();
        scanner.close();
    }

    // Method to calculate the discount
    void calculate() {
        if (cost <= 10000) {
            dis = 5;
        } else if (cost > 10000 && cost <= 20000) {
            dis = 10;
        } else if (cost > 20000 && cost <= 35000) {
            dis = 15;
        } else {
            dis = 20;
        }

        // Calculate amount after discount
        amount = cost - (cost * dis / 100);
    }

    // Method to display customer details
    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Amount to be paid after discount: " + amount);
    }

class Bussines {

	public static void main(String[] args) {
		ShowRoom showroom = new ShowRoom();

        showroom.input();
        showroom.calculate();
        showroom.display();

	}

  }
}
