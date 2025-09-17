package ecommerce;
public class Electronics extends Product implements Taxable{
    private double discountRate;
    public Electronics(String id,String name,double price,double discountRate){
        super(id,name,price);
        setDiscountRate(discountRate);
    }
    public double getDiscountRate(){return discountRate;}
    public void setDiscountRate(double discountRate){if(discountRate<0) throw new IllegalArgumentException("Invalid");this.discountRate=discountRate;}
    public double calculateDiscount(){return getPrice()*discountRate;}
    public double calculateTax(){return getPrice()*0.18;}
    public String getTaxDetails(){return "GST 18%";}
}