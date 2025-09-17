package food;
public class NonVegItem extends FoodItem implements Discountable{
    private double extraCharge;
    private double discount;
    public NonVegItem(String name,double price,int quantity,double extraCharge,double discount){
        super(name,price,quantity);
        setExtraCharge(extraCharge);
        setDiscount(discount);
    }
    public double getExtraCharge(){return extraCharge;}
    public void setExtraCharge(double extraCharge){if(extraCharge<0) throw new IllegalArgumentException("Invalid");this.extraCharge=extraCharge;}
    public double getDiscount(){return discount;}
    public void setDiscount(double discount){if(discount<0) throw new IllegalArgumentException("Invalid");this.discount=discount;}
    public double calculateTotalPrice(){return getPrice()*getQuantity()+extraCharge-discount;}
    public void applyDiscount(double amount){setDiscount(amount);}
    public String getDiscountDetails(){return "NonVeg Discount";}
}