package bsu.rfe.java.group8.lab1.Potapnev.var12;

public class Colbasa extends Food {

	public Colbasa() {
		super("Colbasa");
		// TODO Auto-generated constructor stub
	}

    public double calculateCalories()
    {
        return 1000;
    }
    
    public void consume() {
        System.out.println(this + " with calories " + calculateCalories() + " eaten");
    }
}
