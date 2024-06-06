public class EV extends Car {
    //declaring instantiation variables
    private String motorType;
    private int chargeRange;
    private boolean fastCharging;
    //end of declaring instantiation variables


    //start of constructors
    public EV() {
        brand = "";
        model = "";
        color = "";
        year = 0;
        engineType = "";
        horsepower = 0;
        weight = 0;
        seatNumber = 0;
        price = 0;
        motorType = "";
        chargeRange = 0;
        fastCharging = false;
    }


    public EV(String carBrand, String carModel, String carColor, int carYear, String carEngineType, int carHorsepower, int carWeight, int carSeatNumber, int carPrice, String EVMotorType, int EVChargeRange, boolean EVFastCharging) {
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
        motorType = EVMotorType;
        chargeRange = EVChargeRange;
        fastCharging = EVFastCharging;
        cars++;
    }
    //end of constructors


    //start of getters
    public String getMotorType() {
        return motorType;
    }


    public int getChargeRange() {
        return chargeRange;
    }


    public boolean getFastCharging() {
        return fastCharging;
    }


    public String getBasicInfo() //lists the basic info of a car
    {
        return "The basic information of the EV is that it is a " + color + " " + year + " " + brand + " " + model + ", it costs $" + price + ".";
    }


    public String getSpecificInfo() //lists more specific info of a car
    {
        return "The specific information of the " + brand + " " + model + " is that it comes with a " + engineType + " that produces " + horsepower + " horsepower. It weighs " + weight + " pounds and has " + seatNumber + " seats." + " It costs $" + price + ". The motor type is a " + motorType + ". The cars charging range is " + chargeRange + ". Car charges fast: " + fastCharging + ".";
    }


    public String toString() {
        return "The information of the car is that it is a " + color + " " + year + " " + brand + " " + model + " it comes with a " + engineType + " that produces " + horsepower + " horsepower. It weighs " + weight + " pounds and has " + seatNumber + " seats." + " It costs $" + price + ". The motor type is a " + motorType + ". The cars charging range is " + chargeRange + ". Car charges fast: " + fastCharging + ".";
    }
    //end of getters
}
