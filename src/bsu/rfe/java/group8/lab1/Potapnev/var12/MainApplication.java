package bsu.rfe.java.group8.lab1.Potapnev.var12;

import java.util.Arrays;

public class MainApplication 
{
    public static void main(String[] args) throws Exception 
	{

        Food[] breakfast = new Food[20];

        int howManyCalories = 0;
        int howManyBigApples = 0;
        int howManyMiddleApples = 0;
        int howManyLittleApples = 0;
        int howManyCheeses = 0;
        int howManyColbasy = 0;
        int howManyBeefsWithBlood = 0;
        int howManyNormalBeefs = 0;
        int howManyGrillBeefs = 0;
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Colbasa"))
            {
                breakfast[itemsSoFar] = new Colbasa();
                howManyColbasy++;
            }
            else if (parts[0].equals("Apple"))
            {

                breakfast[itemsSoFar] = new Apple(parts[1]);
                if (parts[1].equals("Big"))
                {
                    howManyBigApples++;
                }
                else if (parts[1].equals("Average"))
                {
                    howManyMiddleApples++;
                }
                else if (parts[1].equals("Little"))
                {
                    howManyLittleApples++;
                }
            }
            if (parts[0].equals("Beef"))
            {
                breakfast[itemsSoFar] = new Beef(parts[1]);
                if (parts[1].equals("With Blood"))
                {
                    howManyBeefsWithBlood++;
                }
                else if (parts[1].equals("Normal"))
                {
                    howManyNormalBeefs++;
                }
                else if (parts[1].equals("Fried"))
                {
                    howManyGrillBeefs++;
                }
            }
            itemsSoFar++;
        }
        Arrays.sort(breakfast, new FoodComparator());
        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;
        for (String arg : args)
        {
            if (arg.startsWith("-"))
            {
                if (arg.equals("-calories"))
                {
                    for (Food item : breakfast)
                        if (item != null)
                            howManyCalories += item.calculateCalories();
                        else
                            break;
                    System.out.println("Calories in your breakfast: " + howManyCalories);
                }
                else if (arg.equals("-sort")) {
                    Arrays.sort(breakfast, new FoodComparator());
                    System.out.println();
                }
            }
        }
        if (howManyLittleApples != 0) {
            System.out.println("Little apples eaten: " + howManyLittleApples);
        }
        if (howManyMiddleApples != 0) {
            System.out.println("Average apples eaten: " + howManyMiddleApples);
        }
        if (howManyBigApples != 0) {
            System.out.println("Big apples eaten: " + howManyBigApples);
        }
        if (howManyBeefsWithBlood != 0) {
            System.out.println("Pieces of meat eaten with blood: " + howManyBeefsWithBlood);
        }
        if (howManyGrillBeefs != 0) {
            System.out.println("Pieces of meat eaten with roasting: " + howManyGrillBeefs);
        }
        if (howManyNormalBeefs != 0) {
            System.out.println("Eaten pieces of meat with the norm: " + howManyNormalBeefs);
        }
        if (howManyColbasy != 0) {
            System.out.println("Colbasa slices eaten: " + howManyColbasy);
        }
        System.out.println("Good luck!");
    }
}
