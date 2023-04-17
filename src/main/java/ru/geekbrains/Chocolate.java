package ru.geekbrains;

public class Chocolate extends Product{
    private int weight;
    private int calories;


    public Chocolate(String name, double price,int inputWeight, int inputCalories) {
        super(name, price);
        this.weight = inputWeight;
        this.calories = inputCalories;
    }

    @Override
    String displayInfo() {
        return String.format("Бренд - %s, Название - %s, Цена - %f, Вес - %d, Калории - %d",
                brand, name, price, weight, calories);

    }
}
