/*Create a class called Invoice that a hardware store might use to represent an invoice
for an item sold at the store. An Invoice should include four pieces of information as
instance variables—a part number (type String), a part description (type String), a
quantity of the item being purchased (type int) and a price per item (double). Your class
should have a constructor that initializes the four instance variables. Provide a set and
a get method for each instance variable. In addition, provide a method named
getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by
the price per item), then returns the amount as a double value. If the quantity is not
positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrates class Invoice’s
capabilities.*/
class Invoice {
    private String partNumber;
    private String description;
    private int quantity;
    private double price;
    
    public Invoice(String partNumber, String description, int quantity, double price) {
        setPartNumber(partNumber);
        setDescription(description);
        setQuantity(quantity); 
        setPrice(price); 
    }
    
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    public String getPartNumber() {
        return this.partNumber;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public double getInvoiceAmount() {
        return this.quantity * this.price;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("100", "Sexy Item", 200, 50.3);
        
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price: " + invoice1.getPrice());
        System.out.println("Invoice Amount: " + invoice1.getInvoiceAmount());
    }
}
