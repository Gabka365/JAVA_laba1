package bsu.rfe.java.group8.lab1.Potapnev.var12;

public class Apple extends Food {

	private String size;
    public Apple(String size)
    {
        super("Apple");
        this.size = size;
    }
    public void consume()
    {
        System.out.println(this + " with calories " + calculateCalories() + " eaten");
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0))
        { 
            if (!(arg0 instanceof Apple)) return false; 
            return size.equals(((Apple)arg0).size); 
        }
        else
            return false;
    }
    public double calculateCalories()
    {
        if(size.equals("Big"))
        {
            return 40;
        }
        else
        if(size.equals("Average"))
        {
            return 20;
        }
        else
        {
            return 10;
        }
    }

    public String toString() {
        return super.toString() + " of size '" + size.toUpperCase() + "'";
    }
}
