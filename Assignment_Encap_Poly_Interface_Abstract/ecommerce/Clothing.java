package ecommerce;
public class Clothing extends Product implements Taxable{
    private double discount;
    public Clothing(String id,String name,double price,double discount){
        super(id,name,price);
        setDiscount(discount);
    }
    public double getDiscount(){return discount;}
    public void setDiscount(double discount){if(discount<0) throw new IllegalArgumentException("Invalid");this.discount=discount;}
    public double calculateDiscount(){return discount;}
    public double calculateTax(){return getPrice()*0.05;}
    public String getTaxDetails(){return "GST 5%";}
}