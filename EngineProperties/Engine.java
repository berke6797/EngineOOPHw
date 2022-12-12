package week06.lesson01.EngineOOPHW.EngineProperties;

public class Engine {
    private int enginePower;
    private int engineVolume;
    private Fueltype fuelType;

    public Engine(int enginePower, int engineVolume, Fueltype fuelType) {
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Fueltype getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fueltype fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", engineVolume=" + engineVolume +
                ", fuelType=" + fuelType +
                '}';
    }
}
