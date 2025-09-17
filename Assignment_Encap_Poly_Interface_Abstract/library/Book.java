package library;
public class Book extends LibraryItem implements Reservable{
    public Book(String id,String title,String author){super(id,title,author);}
    public int getLoanDuration(){return 21;}
    private boolean reserved;
    public void reserveItem(){reserved=true;}
    public boolean checkAvailability(){return !reserved;}
}