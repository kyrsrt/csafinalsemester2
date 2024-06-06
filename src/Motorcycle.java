public class Motorcycle extends Car {
    //declaring instantiation variables
    private String bikeType;
    private int topSpeed;
    private boolean isOffroad;
    //end of declaring instantiation variables


    //start of constructors
    public Motorcycle() {
        brand = "";
        model = "";
        color = "";
        year = 0;
        engineType = "";
        horsepower = 0;
        weight = 0;
        seatNumber = 0;
        price = 0;
        bikeType = "";
        topSpeed = 0;
        isOffroad = false;
    }


    public Motorcycle(String carBrand, String carModel, String carColor, int carYear, String carEngineType, int carHorsepower, int carWeight, int carSeatNumber, int carPrice, String motorBikeType, int motorTopSpeed, boolean motorIsOffroad) {
//        brand = carBrand;
//        model = carModel;
//        color = carColor;
//        year = carYear;
//        engineType = carEngineType;
//        horsepower = carHorsepower;
//        weight = carWeight;
//        seatNumber = carSeatNumber;
//        price = carPrice;
        super(carBrand, carModel, carColor, carYear, carEngineType, carHorsepower, carWeight, carSeatNumber, carPrice, false);
        bikeType = motorBikeType;
        topSpeed = motorTopSpeed;
        isOffroad = motorIsOffroad;
        cars++;
    }
    //end of constructors


    //start of getters
    public String getBikeType() {
        return bikeType;
    }


    public int getTopSpeed() {
        return topSpeed;
    }


    public boolean getIsOffroad() {
        return isOffroad;
    }


    public String getBasicInfo() //lists the basic info of a car
    {
        return "The basic information of the motorcycle is that it is a " + color + " " + year + " " + brand + " " + model + ", it costs $" + price + ".";
    }


    public String getSpecificInfo() //lists more specific info of a car
    {
        return "The specific information of the " + brand + " " + model + " is that it comes with a " + engineType + " that produces " + horsepower + " horsepower. It weighs " + weight + " pounds and has " + seatNumber + " seats." + " It costs $" + price + ". The bike type is a " + bikeType + ". The top speed is " + topSpeed + ". " + " Bike Offroad: " + isOffroad + ".";
    }


    public String toString() {
        return "The information of the motorcycle is that it is a " + color + " " + year + " " + brand + " " + model + " it comes with a " + engineType + " that produces " + horsepower + " horsepower. It weighs " + weight + " pounds and has " + seatNumber + " seats." + " It costs $" + price + ". The bike type is a " + bikeType + ". The top speed is " + topSpeed + ". " + " Bike Offroad: " + isOffroad + ".";
    }
    //end of getters
}
