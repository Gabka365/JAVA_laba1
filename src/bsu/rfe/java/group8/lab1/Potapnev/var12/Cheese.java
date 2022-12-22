package bsu.rfe.java.group8.lab1.Potapnev.var12;

public class Cheese extends Food {

    public Cheese() {
        super("Cheese");
    }
    public double calculateCalories()
    {
        return 1000;
    }
    public void consume() {
        System.out.println(this + " with calories " + calculateCalories() + " eaten");
    }
}
