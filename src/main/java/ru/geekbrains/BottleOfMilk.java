package ru.geekbrains;

public class BottleOfMilk extends Product {

    private int volume;
    private int fat;

    public int getVolume() {
        return volume;
    }

    public BottleOfMilk(String name, double price, int volume, int fat){
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        return String.format("Бренд - %s, Название - %s, Цена - %f, Объем: %d", brand, name, price, volume);

    }
}
