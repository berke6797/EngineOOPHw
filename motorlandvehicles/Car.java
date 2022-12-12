package week06.lesson01.EngineOOPHW.motorlandvehicles;

import week06.lesson01.EngineOOPHW.EngineProperties.Engine;

public class Car extends MotorLandVehicle{
  private  int numberOfDoors;


    public Car(String brand, int year, Engine engine, String licensePlate, int numberOfWheels, int numberOfDoors) {
        super(brand, year, engine, licensePlate, numberOfWheels);
        this.numberOfDoors= numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", licensePlate='" + licensePlate + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
