package ru.geekbrains;

/**
 * Продукт
 */
public class Product {

    protected String name;
    protected String brand;
    protected double price;


    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price <= 0){
            throw new RuntimeException("Цена указана некорректно.");
        }
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3)
            this.name = "Продукт";
        else
            this.name = name;
    }


    public Product(){
        this("Продукт");
    }

    public Product(String name){
        this(name, 1);
    }

    public Product(String name, double price){
        this("Noname", name, price);

    }

    public Product(String brand, String name, double price){
        if (brand.length() == 0)
            this.brand = "Бренд не указан";
        else
            this.brand = brand;
        if (name.length() == 0)
            this.name = "Имя не указано";
        else
            this.name = name;
        if (price <= 0)
            this.price = 1;
        else
            this.price = price;
    }

    /**
     * Получить информацию по продукту
     * @return Информация по продукту
     */
    String displayInfo(){
        return String.format("Бренд - %s, Название - %s, Цена - %f", brand, name, price);
    }

}
