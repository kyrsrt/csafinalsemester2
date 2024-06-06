public class Truck extends Car{
    //declaring instantiation variables
    private String truckBedSize;
    private int towingCapacity;
    private boolean has4WD;
    //end of declaring instantiation variables


    //start of constructors
    public Truck()
    {
        brand = "";
        model = "";
        color = "";
        year = 0;
        engineType = "";
        horsepower = 0;
        weight = 0;
        seatNumber = 0;
        price = 0;
        truckBedSize = "";
        towingCapacity = 0;
        has4WD = false;
    }


    public Truck(String carBrand, String carModel, String carColor, int carYear, String carEngineType, int carHorsepower, int carWeight, int carSeatNumber, int carPrice, String truckBedSize2, int truckTowingCapacity, boolean truckHas4WD)
    {
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        engineType = carEngineType;
        horsepower = carHorsepower;
        weight = carWeight;
        seatNumber = carSeatNumber;
        price = carPrice;
        truckBedSize = truckBedSize2;
        towingCapacity = truckTowingCapacity;
        has4WD = truckHas4WD;
        cars++;
    }
    //end of constructors


    //start of getters
    public String getTruckBedSize(){ return truckBedSize; }


    public int getTowingCapacity(){ return towingCapacity; }


    public boolean getHas4WD(){ return has4WD; }


    public String getBasicInfo() //lists the basic info of a car
    {
        return "The basic information of the Truck is that it is a " + color + " " + year + " " + brand + " " + model + ", it costs $" + price + ".";
    }


    public String getSpecificInfo() //lists more specific info of a car
    {
        return "The specific information of the " + brand + " " + model + " is that it comes with a " + engineType + " that produces " + horsepower + " horsepower. It weighs " + weight + " pounds and has " + seatNumber + " seats." + " It costs $" + price + ". The towing capacity of the truck is " + towingCapacity + " pounds, the truck bed size is " + truckBedSize + ", and truck has 4WD: " + has4WD + "." ;
    }


    public String toString()
    {
        return "The information of the car is that it is a " + color + " " + year + " " + brand + " " + model + " it comes with a " + engineType + " that produces " + horsepower + " horsepower. It weighs " + weight + " pounds and has " + seatNumber + " seats." + " It costs $" + price + ". The towing capacity of the truck is " + towingCapacity + " pounds, the truck bed size is " + truckBedSize + ", and truck has 4WD: " + has4WD + "." ;
    }
    //end of getters
}
