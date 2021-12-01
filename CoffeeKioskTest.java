public class CoffeeKioskTest {
    
    public static void main(String[] args) {
        CoffeeKiosk testKiosk = new CoffeeKiosk();

        
    // Item item1 = new Item("banana", 2.00);
    testKiosk.addMenuItem("Banana", 2.00);
    testKiosk.addMenuItem("Coffee", 1.50);
    testKiosk.addMenuItem("latte", 4.50);
    testKiosk.addMenuItem("Cappuccino", 3.00);
    testKiosk.addMenuItem("Muffin", 4.00);
    testKiosk.newOrder();
    
    }        
}
