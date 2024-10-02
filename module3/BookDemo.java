package module3;
 class Author{
    String firstName,lastName;

    public Author(String firstName,String lastName){
    	 this.firstName = lastName;
    	 this.lastName = lastName;
    }

    public void setFirstName(String first){
        this.firstName = first;
    }

    public void setLastName(String last){
        this.lastName = last;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String toString(){
        String name = getFirstName() + getLastName();
        return name;
    }

}

class Book{
    String title;
    Author author;
    double price;

    public Book(String t,Author auth,double p){
        title = t;
        author = auth;
        price = p;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public Author getAuthor(){
        return this.author;
    }

    public String toString(){
       String book  = "Title: "+getTitle()+"\nAuthor: "+getAuthor() +"\nPrice: "+ this.price;
       return  book;
    }
}

public class BookDemo{
    public static void main(String[] args) {
        Author author = new Author("Russel" , " Winderand");
        Book b = new Book("Developing Java Software" ,author, 79.95);
        System.out.println(b.toString());
    }
}