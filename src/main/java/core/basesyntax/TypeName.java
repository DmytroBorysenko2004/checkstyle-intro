package core.basesyntax;

import java.time.LocalDate;

public class TypeName {
    private String memberName;
    private int abbreviationAsWordInName;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayHello(String abbreviationAsWordInName) {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird!"
                + " Your task is to fix the checkstyle in this file."
                + " Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(abbreviationAsWordInName);
    }

    private void initializeVariables() {
        memberName = "Hello mates!";
        System.out.println(memberName);
        abbreviationAsWordInName = LocalDate.now().getYear();
        System.out.println("It is " + abbreviationAsWordInName + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
