package homework3.task2;
//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play()
//        Гитара содержит переменные класса количествоСтрун,
//        Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента,
//        который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MusicalInstrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(7));
        instruments.add(new Drum(new SizeOfDrum(450, 1000)));
        instruments.add(new Trumpet(100));

        for (MusicalInstrument instrument : instruments){
            instrument.play();
        }

    }
}
