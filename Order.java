import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<>();
    }
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    public void addItem(Item item) {
        items.add(item);
    }
    
    public String getStatusMessage() {
        if (ready){
            return "Your Order is Ready";
        } else {
            return "Thank you for waiting, Your order will be ready soon.";
        }
    }
    public double getOrderTotal() {
        double sum = 0.00;
        for (Item i : this.items ) {
            sum += i.getItemPrice();
        }
        return sum;
    }

    public void display() {
        System.out.println("-------------");
        System.out.println("Customer Name: " + this.getName());
        for (Item i : this.items) {
            System.out.println(i.getItemName() + " - $" + i.getItemPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
        System.out.println("-------------");
    }

    
    // GETTERS & SETTERS
    
    //Name G & S
    public String getName() {
        return this.name;
    }

    public void setName(String setName) {
        this.name = setName;
    }
    
    //Items G & S
    public ArrayList<Item> getItems() {
        return this.items;
    }

    
    public void setItems(ArrayList<Item> setItems) {
            this.items = setItems;
        }
        
    // Ready Setter
    public void setReady() {
        this.ready = true;
    }

}