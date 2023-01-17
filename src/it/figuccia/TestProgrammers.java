package it.figuccia;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        programmer1.name = "John";
        programmer1.age = 25;
        programmer1.wearsGlasses = true;
        programmer1.drinkCoffee();
        programmer1.printDetails();

        Programmer programmer2 = new Programmer();
        programmer2.name = "Jane";
        programmer2.age = 30;
        programmer2.wearsGlasses = false;
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
