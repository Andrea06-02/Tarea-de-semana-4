import java.util.ArrayList;
import java.util.Queue;

public class Order {
    private int Order_number;
    private ArrayList<Plate> List_food;
    int Total_price;
    public Order(int Order_number) {
        this.Order_number = Order_number;
        List_food = new ArrayList<>();
        Total_price = 0;
    }
    public boolean Confirm_plate(int Quantity,double Price) {
        return Quantity > 0 && Price > 0;
    }
    public void List_plate(Plate Plat) {
        if (Confirm_plate(Plat.getQuantity(), Plat.getPrice())) {
            List_food.add(Plat);
            this.Total_price += (Plat.getPrice() * Plat.getQuantity());
        }
        else{
            System.out.println("Please enter a valid amount");
        }
    }
    public void List_plate(String Name_plate, double Price, int Quantity) {
        if(Confirm_plate(Quantity, Price)) {
            List_food.add(new Plate(Name_plate, Price, Quantity));
            this.Total_price += Price*Quantity;
        }
        else{
            System.out.println("Please enter a valid amount");
        }
    }
    public String Traverse_list(){
        StringBuilder Sb = new StringBuilder();
        int Index = 0;
        Sb.append("Number of order ").append(this.Order_number).append(" ").append("\n");
        Sb.append("Details  \n");
        for (Plate Plat : List_food) {
            Index++;
            Sb.append(Index).append(Plat.getName_plate()).append(" ").append("\n");
        }
        Sb.append("------------------ \n");
        Sb.append("Total price of order ").append(this.Total_price).append(" ").append("\n");
        return Sb.toString();
    }
}
