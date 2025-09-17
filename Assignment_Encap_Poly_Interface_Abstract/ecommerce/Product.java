package ecommerce;
public abstract class Product{
    private String productId;
    private String name;
    private double price;
    public Product(String productId,String name,double price){
        setProductId(productId);
        setName(name);
        setPrice(price);
    }
    public String getProductId(){return productId;}
    public void setProductId(String productId){if(productId==null||productId.isEmpty()) throw new IllegalArgumentException("Invalid");this.productId=productId;}
    public String getName(){return name;}
    public void setName(String name){if(name==null||name.isEmpty()) throw new IllegalArgumentException("Invalid");this.name=name;}
    public double getPrice(){return price;}
    public void setPrice(double price){if(price<0) throw new IllegalArgumentException("Invalid");this.price=price;}
    public abstract double calculateDiscount();
}