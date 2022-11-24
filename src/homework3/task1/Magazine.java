package homework3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine extends readStaff implements Printable{

    private String color;

//    private int pages;
//    private String title;


    public Magazine(int pages, String title, String color) {
        super(pages, title);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(super.getTitle());
        System.out.println(super.toString());
        System.out.println(this);
    }
}
