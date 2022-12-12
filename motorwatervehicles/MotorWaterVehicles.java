package week06.lesson01.EngineOOPHW.motorwatervehicles;

import week06.lesson01.EngineOOPHW.EngineProperties.Engine;
import week06.lesson01.EngineOOPHW.EngineProperties.MotorVehicle;

public abstract class MotorWaterVehicles extends MotorVehicle {
    private int numberOfEngine;
    private int weight;
    private int height;
    private int registry;
    private String hullMaterial;
    private int numberOfCabin;

    public MotorWaterVehicles(String brand, int year, Engine engine, int numberOfEngine, int weight, int height, int registry, String hullMaterial, int numberOfCabin) {
        super(brand, year, engine);
        this.numberOfEngine = numberOfEngine;
        this.numberOfCabin = numberOfCabin;
        this.height = height;
        this.weight = weight;
        this.registry = registry;
        this.hullMaterial = hullMaterial;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public void setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRegistry() {
        return registry;
    }

    public void setRegistry(int registry) {
        this.registry = registry;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public int getNumberOfCabin() {
        return numberOfCabin;
    }

    public void setNumberOfCabin(int numberOfCabin) {
        this.numberOfCabin = numberOfCabin;
    }

    @Override
    public String toString() {
        return "MotorWaterVehicles{" +
                "numberOfEngine=" + numberOfEngine +
                ", weight=" + weight +
                ", height=" + height +
                ", registry=" + registry +
                ", hullMaterial='" + hullMaterial + '\'' +
                ", numberOfCabin=" + numberOfCabin +
                '}';
    }
}
