package week06.lesson01.EngineOOPHW.motorlandvehicles;


import week06.lesson01.EngineOOPHW.EngineProperties.Engine;
import week06.lesson01.EngineOOPHW.EngineProperties.MotorVehicle;

public  abstract class MotorLandVehicle extends MotorVehicle {
  public  String licensePlate;
  public    int numberOfWheels;

  public MotorLandVehicle(String brand, int year, Engine engine, String licensePlate, int numberOfWheels) {
    super(brand, year, engine);
    this.licensePlate=licensePlate;
    this.numberOfWheels=numberOfWheels;
  }

  @Override
  public String toString() {
    return "MotorLandVehicle{" +
            "licensePlate='" + licensePlate + '\'' +
            ", numberOfWheels=" + numberOfWheels +
            '}';
  }
}
