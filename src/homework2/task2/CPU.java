package homework2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CPU {
    private String model;
    private int clock;
    private int generation;
    private String producer;
}
