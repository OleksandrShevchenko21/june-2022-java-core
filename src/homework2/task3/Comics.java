package homework2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comics extends Book{
    private boolean pictures;

    public Comics(Size size, int pages, boolean pictures) {
        super(size, pages);
        this.pictures = pictures;
    }
}
