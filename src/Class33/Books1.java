package Class33;

import java.util.Objects;

public class Books1 {
    public static void main(String[] args) {

    }
}
class Book2{
    static int lastId;
    int id;
    String title;
    String author;
    int year;
    String genre;
    public Book2(String title, String author, int year, String genre){
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        id++;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public int getYear(){
        return year;
    }
    @Override
    public int hashCode(){
        return Objects.hash(title.toLowerCase(), author.toLowerCase(), genre.toLowerCase(), year);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Book2 book = (Book2) obj;
        return title.equalsIgnoreCase(book.title) &&
                author.equalsIgnoreCase(book.author) &&
                genre.equalsIgnoreCase(book.genre) &&
                year == book.year;
    }
}