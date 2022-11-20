package homework2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class PC {

    private CPU cpu;
    private Motherboard motherboard;
    private Ram ram;

}
