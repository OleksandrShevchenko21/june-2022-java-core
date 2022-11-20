package homework2.task3;

import homework2.task2.PC;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Papyrus papyrus = new Papyrus(
                new Size(100,50)
        );

        Book book = new Book(
                new Size(80,50),
                25
        );
        Magazine magazine = new Magazine(
                new Size(200,100),
                23,
                "yellow"
        );
        Comics comics = new Comics(
                new Size(55, 60),
                33,
                true
        );

        List<Papyrus>list=Arrays.asList(papyrus,book,magazine,comics);

        System.out.println(list);

    }
}
