package sky;

import sky.JavaCorel.Auto;

public class ObjectAuto {
    public static void main(String[] args) {
        Auto auto = new Auto("BMW", null, 3.0f, "black", 2021, "germany");
        Auto auto1 = new Auto("Lada", "Granta", 1.7f, "", 2015, "Russian");
        Auto auto2 = new Auto("Kia", "Sportage", -1f, "red", 2018, "South Korea");
        Auto auto3 = new Auto("Hyundai ", "Avante", 2.6f, "orange", 0, "South Korea");

        System.out.println(auto.toString());
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
    }
}
