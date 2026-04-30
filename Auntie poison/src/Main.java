import java.util.Scanner;

void main() {
Scanner Sc = new Scanner(System.in);
Order Or = new Order(437259);
int Option;
do {
    System.out.println("What would you like to do? ");
    System.out.println("1. Register a dish");
    System.out.println("2. Place an order");
    System.out.println("3. Exit");
    Option = Sc.nextInt();
    Sc.nextLine();
    switch (Option) {
        case 1:
            System.out.print("Enter the name of the dish ");
            String Name = Sc.nextLine();
            System.out.print("Enter the price of the dish ");
            double Price = Sc.nextDouble();
            System.out.print("Enter the quantity of the dish ");
            int Quantity = Sc.nextInt();
            Or.List_plate(Name, Price, Quantity);
            break;
        case 2:
            System.out.print(Or.Traverse_list());
            break;
        case 3:
            System.out.print("Exit ");
            break;
        default:
            System.out.println("Invalid option");
    }
} while (Option != 3);

}
