package homework3.task1;

import java.util.ArrayList;
import java.util.List;

//а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.

public class Main {
    public static void main(String[] args) {


    List<Printable> readingMatter = new ArrayList<>();

    readingMatter.add(new Book(23,"Shantaram","Robert"));
    readingMatter.add(new Magazine(21,"Discovery","green"));

    for (Printable printable : readingMatter){
        printable.print();
    }

    }

}
