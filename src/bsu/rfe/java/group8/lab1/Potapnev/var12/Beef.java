package bsu.rfe.java.group8.lab1.Potapnev.var12;

public class Beef extends Food {

	private String preparedness;
    public Beef(String preparedness)
    {
        super("Beef");
        this.preparedness = preparedness;
    }
    public void consume () {
        System.out.println(this + " with calories " + calculateCalories() + " eaten");
    }
    public boolean equals(Object arg0)
    {
        if (super.equals(arg0)) { 
            if (!(arg0 instanceof Apple)) return false; 
            return preparedness.equals(((Apple)arg0).name); 
        } else
            return false;
    }
    public double calculateCalories()
    {
        if(preparedness.equals("With Blood"))
        {
            return 20;
        }
        else
        if(preparedness.equals("Normal"))
        {
            return 28;
        }
        else
        {
            return 78;
        }
    }
    public String toString() {
        return super.toString() + " readiness '" + preparedness.toUpperCase() + "'";
    }
}
