package homework2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book extends Papyrus {
    private int pages;

    public Book(Size size, int pages) {
        super(size);
        this.pages = pages;
    }
}
