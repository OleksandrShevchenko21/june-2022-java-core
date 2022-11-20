package homework2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Workstation extends Laptop{
    private Size size;

    public Workstation(CPU cpu, Motherboard motherboard, Ram ram, Touchpad touchpad, Size size) {
        super(cpu, motherboard, ram, touchpad);
        this.size = size;
    }
}
