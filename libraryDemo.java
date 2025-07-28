// Abstract Class
abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title : " + getTitle());
        System.out.println("Author: " + getAuthor());
    }

    // Abstract Method
    public abstract void getType();

}


class Book extends LibraryResource{
public Book(String title,String author){
super(title,author);
}

public void getType(){
System.out.println("Type: Book"+"\n");
}
}

class Magazine extends LibraryResource{
public Magazine(String title,String author){
super(title,author);
}

public void getType(){
System.out.println("Type: Magazine"+"\n");
}
}


class DVD extends LibraryResource{
public DVD(String title,String author){
super(title,author);
}

public void getType(){
System.out.println("Type: DVD"+"\n");
}
}

public class libraryDemo{
public static void main(String[] args){
LibraryResource r1= new Book("The god of small things","Arundhati Roy");
LibraryResource r2= new Magazine("Forbes","Steve Forbes");
LibraryResource r3= new DVD("Abcd","XYZ");

System.out.println("-----------------");
r1.displayDetails();
r1.getType();
System.out.println("-----------------");

r2.displayDetails();
r2.getType();
System.out.println("-----------------");

r3.displayDetails();
r3.getType();
System.out.println("-----------------");
}
}
