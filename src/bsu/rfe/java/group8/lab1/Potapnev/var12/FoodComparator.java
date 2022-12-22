package bsu.rfe.java.group8.lab1.Potapnev.var12;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {

    public int compare(Food arg0, Food arg1)
    {
        if (arg0 == null || ((Food)arg0).calculateCalories() < ((Food)arg1).calculateCalories())
        {
            return 1;
        }
        if (arg1 == null || ((Food)arg0).calculateCalories() > ((Food)arg1).calculateCalories())
        {
            return -1;
        }
        else return 0;
    }
}
