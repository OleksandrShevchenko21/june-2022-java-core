package homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Drum implements MusicalInstrument {
    private SizeOfDrum sizeOfDrum;

    @Override
    public void play() {
        System.out.println("Играет барабан диаметром " + this.sizeOfDrum.getDiameter() + "мм и высотой " + this.sizeOfDrum.getHeight()+"мм");
    }
}
