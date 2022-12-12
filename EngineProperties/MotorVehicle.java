package week06.lesson01.EngineOOPHW.EngineProperties;

import week06.lesson01.EngineOOPHW.EngineProperties.Engine;

public class MotorVehicle {
    String brand;
    int year;
    Engine engine;

    public MotorVehicle(String brand, int year, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "MotorVehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
