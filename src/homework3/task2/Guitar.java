package homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Guitar implements MusicalInstrument {
    private int numOfStrings;

    @Override
    public void play() {
        System.out.println("Играет гитара c " + this.numOfStrings + " струнами");
    }
}
