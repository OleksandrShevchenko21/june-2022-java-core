package homework2.task4;



import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        User user = new User(
                21,
                "Vasya",
                "Vasylonko",
                "g@.mail.com",
                30,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10),
                        new Skill("c++", 10)),
                new Car("toyota",2022, 3000)
        );
        System.out.println(user);
    }
}
