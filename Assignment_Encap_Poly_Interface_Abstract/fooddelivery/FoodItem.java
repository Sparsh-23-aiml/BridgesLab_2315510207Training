package food;
public abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName,double price,int quantity){
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }
    public String getItemName(){return itemName;}
    public void setItemName(String itemName){if(itemName==null||itemName.isEmpty()) throw new IllegalArgumentException("Invalid");this.itemName=itemName;}
    public double getPrice(){return price;}
    public void setPrice(double price){if(price<0) throw new IllegalArgumentException("Invalid");this.price=price;}
    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){if(quantity<0) throw new IllegalArgumentException("Invalid");this.quantity=quantity;}
    public abstract double calculateTotalPrice();
    public String getItemDetails(){return itemName+":"+calculateTotalPrice();}
}