import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*
    * Да се направи програма за магазин за лаптопи.
    * Създайте клас ComputerSpecs с полета за:
    * - процесор
    * - размер RAM памет
    * - размер памет (постоянна)
    * - тип постоянна памет (SSD, HardDisk)
    * - OS (Linux, Windows, MacOS, None .. )
    * Добавете конструктор с параметри, задащ стойност на полетата и get методи
    * Създайте клас Laptop с полета за:
    * - марка
    * - модел
    * - цена
    * - диагонал
    * - поле от тип ComputerSpecs
    * Добавете конструктор с параметри, задаващ стойност на полетата и  get методи
    *
    * В главната програма създайте 5 обекта Laptop
    * и ги добавете в списък
    * */

    Laptop laptop1 = new Laptop(
            "Lenovo",
            "ThinkPad X1 Carbon Gen 12",
            4299,
            14.0,
            new ComputerSpecs("Intel Core Ultra 7 155U", 32, 1000, "SSD", "Windows 11 Pro")
    );

    Laptop laptop2 = new Laptop(
            "Apple",
            "MacBook Air 13 M3",
            2699,
            13.6,
            new ComputerSpecs("Apple M3", 16, 512, "SSD", "macOS")
    );

    Laptop laptop3 = new Laptop(
            "Dell",
            "XPS 14 9440",
            3899,
            14.5,
            new ComputerSpecs("Intel Core Ultra 7 155H", 32, 1000, "SSD", "Windows 11 Home")
    );

    Laptop laptop4 = new Laptop(
            "ASUS",
            "ROG Zephyrus G14",
            4599,
            14.0,
            new ComputerSpecs("AMD Ryzen 9 8945HS", 32, 1000, "SSD", "Windows 11 Home")
    );

    Laptop laptop5 = new Laptop(
            "HP",
            "Spectre x360 14",
            399,
            14.0,
            new ComputerSpecs("Intel Core Ultra 7 155H", 16, 1000, "SSD", "Windows 11 Home")
    );

    ArrayList<Laptop> laptops = new ArrayList<>();
    laptops.add(laptop1);
    laptops.add(laptop2);
    laptops.add(laptop3);
    laptops.add(laptop4);
    laptops.add(laptop5);

    for (Laptop l : laptops) {
        if (l.getPrice() > 1000){
            //System.out.println(l.getBrand() + " " + l.getModel() + " " + l.getSpecs().getProcessor() + " " + l.getSpecs().getRam() + " GB, " + l.getPrice() + " euro");
            System.out.println(l.getBrand() + " " + l.getModel() + " " + l.getSpecs().toString() + " " + l.getPrice() + " euro");
        }
    }


}}
