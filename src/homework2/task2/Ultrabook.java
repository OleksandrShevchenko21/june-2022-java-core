package homework2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ultrabook extends Laptop {
    private double weight;

    public Ultrabook(CPU cpu, Motherboard motherboard, Ram ram, Touchpad touchpad, double weight) {
        super(cpu, motherboard, ram, touchpad);
        this.weight = weight;
    }
}
