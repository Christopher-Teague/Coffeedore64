import java.util.*;


public class CoffeeKiosk {
    
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(String itemName, double itemPrice) {
        Item newItem = new Item(itemName, itemPrice);
        menu.add(newItem);
        newItem.setIndex(menu.size() -1); 
    }

    public void displayMenu() {
        for (Item i : this.menu){
            System.out.println(i.getIndex() + " " + i.getItemName() + " -- $" + i.getItemPrice());
        }
    }

    // public Item getByIndex(int index) {
    //     for (Item item : menu) {
    //         if (item.getIndex() == index ) {
    //             return item;
    //         }
    //     }
    //     return null;
    // }


    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newOrder = new Order(name);
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // newOrder.addItem();
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // int idx = Integer.parseInt(itemNumber);
            // newOrder.addItem(this.getByIndex(idx));
            for (Item item : menu) {
                //     // if itemNumber == item.getIndex()) {
                if ((Integer.parseInt(itemNumber)) == item.getIndex()) {   
                    newOrder.addItem(item);
                }        
            }
                        
        System.out.println("Please enter a menu item index or q to quit:");
        itemNumber = System.console().readLine();
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        newOrder.display();
    }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
}
