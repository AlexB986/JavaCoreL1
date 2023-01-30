package sky.JavaCorel;

public class Auto {
    public String brand;
    public String model;
    public Float engineValue;
    public String color;
    public int year;
    public String country;

    {

    }

    public Auto(String brand, String model, Float engineValue, String color, int year, String country) {
        this.brand = brand;
        this.model = model = "default";

        if (engineValue <= 0) {
            this.engineValue = engineValue = 1.5f;
        }
        this.engineValue = engineValue;
        this.color = color = "white";
        this.year = (year <= 0) ? 2000 : year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
