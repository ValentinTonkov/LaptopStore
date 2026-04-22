public class Laptop {
    private String brand;
    private String model;
    private int price;
    private double diagonal;
    private ComputerSpecs specs;

    public Laptop(String brand, String model, int price, double diagonal, ComputerSpecs specs){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.diagonal = diagonal;
        this.specs = specs;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public ComputerSpecs getSpecs() {
        return specs;
    }


}
