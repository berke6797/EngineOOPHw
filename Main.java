package week06.lesson01.EngineOOPHW;

import week06.lesson01.EngineOOPHW.EngineProperties.Engine;
import week06.lesson01.EngineOOPHW.EngineProperties.Fueltype;
import week06.lesson01.EngineOOPHW.motorlandvehicles.Car;
import week06.lesson01.EngineOOPHW.motorwatervehicles.Sail;
import week06.lesson01.EngineOOPHW.motorwatervehicles.Yacht;

public class Main {
    public static void main(String[] args) {

        Engine carEngine= new Engine(200,0, Fueltype.Electricity);
        Engine sailEngine= new Engine(82,1200,Fueltype.Gasoline);
        Engine yacthEngine= new Engine(3000,3000,Fueltype.Diesel);
        Car car1= new Car("Mercedes",2018,carEngine,"05 AAL 444",6,5);
        Yacht yacht1= new Yacht("Abacus",2022,yacthEngine,3,50000,10,1231,"Wooden",5,5,"Mercury");
        Sail sail1= new Sail("Bertram",2002,sailEngine,2,10000,20000,123123,"Carbon Fiber",2,"Quadrilateral");
        System.out.println("==================================================================================================================================");
        System.out.println(car1);
        carEngine.setEnginePower(230);
        System.out.println("Revizyona uğradıktan sonra aracın özellikleri : "+car1);
        System.out.println("==================================================================================================================================");
        System.out.println(yacht1);
        System.out.println("====================================================================================================================================");
        System.out.println(sail1);




    }
}
