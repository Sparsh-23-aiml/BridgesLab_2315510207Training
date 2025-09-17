package food;
public class VegItem extends FoodItem implements Discountable{
    private double discount;
    public VegItem(String name,double price,int quantity,double discount){
        super(name,price,quantity);
        setDiscount(discount);
    }
    public double getDiscount(){return discount;}
    public void setDiscount(double discount){if(discount<0) throw new IllegalArgumentException("Invalid");this.discount=discount;}
    public double calculateTotalPrice(){return getPrice()*getQuantity()-discount;}
    public void applyDiscount(double amount){setDiscount(amount);}
    public String getDiscountDetails(){return "Veg Discount";}
}