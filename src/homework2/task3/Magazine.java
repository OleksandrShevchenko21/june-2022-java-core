package homework2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine extends Book {
    private String color;

    public Magazine(Size size, int pages, String color) {
        super(size, pages);
        this.color = color;
    }
}
