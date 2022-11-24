package homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trumpet implements MusicalInstrument {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + this.diameter + "мм");

    }
}
