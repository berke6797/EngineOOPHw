package week06.lesson01.EngineOOPHW.motorwatervehicles;

import week06.lesson01.EngineOOPHW.EngineProperties.Engine;

public class Yacht extends MotorWaterVehicles{
    int numberOfBeds;
    String engineBrand;

    public Yacht(String brand, int year, Engine engine, int numberOfEngine, int weight, int height, int registry, String hullMaterial, int numberOfCabin, int numberOfBeds, String engineBrand) {
        super(brand, year, engine, numberOfEngine, weight, height, registry, hullMaterial, numberOfCabin);
        this.numberOfBeds = numberOfBeds;
        this.engineBrand = engineBrand;
    }


    @Override
    public String toString() {
        return "Yacht{" +
                "numberOfBeds=" + numberOfBeds +
                ", engineBrand='" + engineBrand + '\'' +
                '}';
    }
}
