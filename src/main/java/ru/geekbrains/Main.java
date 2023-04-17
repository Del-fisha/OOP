package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        BottleOfWater bottleOfWater1 = new BottleOfWater("AquaMinerale", 100, 2);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("Parmalat", 100, 2, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product snikers = new Chocolate("Snikers",79,50,420);
        System.out.println(snikers.displayInfo());

        Product snikers2 = new Chocolate("Snikers",79,50,420);
        System.out.println(snikers.displayInfo());


        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(snikers);



        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);
        BottleOfWaterVendingMachine milk = new BottleOfWaterVendingMachine(products);

        BottleOfWater bottleOfWaterAM =  machine.getBottleOfWater("AquaMinerale", 2);
        if (bottleOfWaterAM != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterAM.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        BottleOfWater bottleOfWaterRes =  machine.getBottleOfWater("Вода3", 3);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        BottleOfMilk getMilk =  milk.getBottleOfMilk("Parmalat", 2);
        if (getMilk != null){
            System.out.println("Вы купили: ");
            System.out.println(getMilk.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

    }


}