package library;
public class Magazine extends LibraryItem implements Reservable{
    public Magazine(String id,String title,String author){super(id,title,author);}
    public int getLoanDuration(){return 7;}
    private boolean reserved;
    public void reserveItem(){reserved=true;}
    public boolean checkAvailability(){return !reserved;}
}