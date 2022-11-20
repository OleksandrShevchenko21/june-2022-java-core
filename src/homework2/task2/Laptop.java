package homework2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Laptop extends PC {
    private Touchpad touchpad;

    public Laptop(CPU cpu, Motherboard motherboard, Ram ram, Touchpad touchpad) {
        super(cpu, motherboard, ram);

        this.touchpad = touchpad;
    }
}
