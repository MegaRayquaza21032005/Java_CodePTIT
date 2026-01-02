package model.product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends Product{
    private String author;
    private String genre;
    private String publishDate;

    public void show(){
        System.out.println();
    }
}
