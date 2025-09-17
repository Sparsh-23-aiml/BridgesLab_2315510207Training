package library;
public abstract class LibraryItem{
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId,String title,String author){
        setItemId(itemId);
        setTitle(title);
        setAuthor(author);
    }
    public String getItemId(){return itemId;}
    public void setItemId(String itemId){if(itemId==null||itemId.isEmpty()) throw new IllegalArgumentException("Invalid");this.itemId=itemId;}
    public String getTitle(){return title;}
    public void setTitle(String title){if(title==null||title.isEmpty()) throw new IllegalArgumentException("Invalid");this.title=title;}
    public String getAuthor(){return author;}
    public void setAuthor(String author){if(author==null||author.isEmpty()) throw new IllegalArgumentException("Invalid");this.author=author;}
    public abstract int getLoanDuration();
    public String getItemDetails(){return itemId+":"+title+":"+author;}
}