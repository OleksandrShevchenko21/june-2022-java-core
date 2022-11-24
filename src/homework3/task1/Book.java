package homework3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book extends readStaff implements Printable {

//    private int pages;
//    private String title;
private String author;

    public Book(int pages, String title,String author) {
        super(pages, title);
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println(super.getTitle());
        System.out.println(super.toString());
        System.out.println(this);
    }
}
