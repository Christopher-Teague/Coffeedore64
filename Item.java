
public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    private int index;
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price){
        this.index = 0;
        this.name = name;
        this.price = price;
    }
    
    // GETTERS & SETTERS  - for name and price
    
    // Name G & S
    public String getItemName() {
        return this.name;
    }
    
    public void setItemName(String itemName) {
        this.name = itemName;
    }
    
    // Price G & S
    public double getItemPrice() {
        return this.price;
    }

    public void setItemPrice(double itemPrice) {
        this.price = itemPrice;
    }

    // Index G & S
    public int getIndex() {
        return this.index;
    }

    public void setIndex(int newIndex) {
        index = newIndex;
    } 

}