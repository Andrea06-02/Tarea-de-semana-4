public class Plate {
    private String Name_plate;
    private double Price;
    private int Quantity;
    public Plate(String Name_plate, double Price, int Quantity) {
        this.Name_plate = Name_plate;
        this.Price = Price;
        this.Quantity = Quantity;
    }
    public String getName_plate() {
        return Name_plate;
    }
    public double getPrice() {
        return Price;
    }
    public int getQuantity() {
        return Quantity;
    }
    @Override
    public String toString() {
        return Name_plate + " " + Price + " " + Quantity;
    }
}
