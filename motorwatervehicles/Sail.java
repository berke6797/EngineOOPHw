package week06.lesson01.EngineOOPHW.motorwatervehicles;

import week06.lesson01.EngineOOPHW.EngineProperties.Engine;

public class Sail extends MotorWaterVehicles{
    String type;

    public Sail(String brand, int year, Engine engine, int numberOfEngine, int weight, int height, int registry, String hullMaterial, int numberOfCabin,String type) {
        super(brand, year, engine, numberOfEngine, weight, height, registry, hullMaterial, numberOfCabin);
    this.type=type;
    }

    @Override
    public String toString() {
        return "Sail{}";
    }
}
