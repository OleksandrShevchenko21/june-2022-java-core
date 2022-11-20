package lesson1;


import lombok.*;

@Getter
@Setter


@ToString

public class Car {
    private int d;
    private String model;

    public Car(int d, String model) {
        this.d = d;
        this.model = model;
    }


}