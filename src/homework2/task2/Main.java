package homework2.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        PC pc = new PC(
                new CPU("i3",23,10,"intel"),
                new Motherboard("32","intel"),
                new Ram(24,"amd","afs")
        );

        Laptop laptop = new Laptop(
                new CPU("i5",15500,12,"intel"),
                new Motherboard("22","intel"),
                new Ram(24,"amd","afs"),
                new Touchpad("amd","67x")
        );

        Ultrabook ultrabook = new Ultrabook(
                new CPU("i5",15500,12,"intel"),
                new Motherboard("22","intel"),
                new Ram(24,"amd","afs"),
                new Touchpad("amd","67x"),
                2.2
        );
        Workstation workstation = new Workstation(
                new CPU("i5",15500,12,"intel"),
                new Motherboard("22","intel"),
                new Ram(24,"amd","afs"),
                new Touchpad("amd","67x"),
                new Size(200,200,400)
        );
        List<PC> list= Arrays.asList(pc,laptop,ultrabook, workstation);

        System.out.println(list);

    }
}
