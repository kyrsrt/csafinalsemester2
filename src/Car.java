public class Car {
    //declaring instantiation variables
    static int cars = 0;
    public String brand;
    public String model;
    public String color;
    public int year;
    public String engineType;
    public int horsepower;
    public int weight;
    public int seatNumber;
    public int price;
    public Tire tire;
    //end of declaring instantiation variables


    //start of constructors
    public Car()
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
    }


    public Car(String carBrand, String carModel, String carColor, int carYear, String carEngineType, int carHorsepower, int carWeight, int carSeatNumber, int carPrice, boolean carIsSportsCar)
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
        tire = new Tire("rubber", 20, false);
        cars++;
    }
    //end of constructors


    //start of getters
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }


    public String getColor()
    {
        return color;
    }


    public int getYear()
    {
        return year;
    }


    public String getEngineType()
    {
        return engineType;
    }


    public int getHorsepower()
    {
        return horsepower;
    }


    public int getWeight()
    {
        return weight;
    }


    public int getSeatNumber()
    {
        return seatNumber;
    }


    public int getPrice()
    {
        return price;
    }


    public static String carCount()
    {
        return "There are " + cars + " cars.";
    }


    public String getBasicInfo() //lists the basic info of a car
    {
        return "The basic information of the car is that it is a " + color + " " + year + " " + brand + " " + model + ", it costs $" + price + ".";
    }


    public String getSpecificInfo() //lists more specific info of a car
    {
        return "The specific information of the " + brand + " " + model + " is that it comes with a " + engineType + " that produces " + horsepower + " horsepower. It weighs " + weight + " pounds and has " + seatNumber + " seats." + " It costs $" + price + ".";
    }

    public Car getUnorganizedInfo(Car car1)
    {
        return car1;
    } // returns an object!!!!11!!!!!

    public String toString()
    {
        return "The information of the car is that it is a ".concat(color + " " + year + " " + brand + " " + model + " it comes with a " + engineType + " that produces " + horsepower + " horsepower. It weighs " + weight + " pounds and has " + seatNumber + " seats." + " It costs $" + price + ".");
    }
    //end of getters


    public static String findLightest(Car carOne, Car carTwo, Car carThree, Car carFour)
    {
        int count = 0;
        int label = 0; // temporary variable to track which car is lightest
        while(count < cars)
        {
            if((carOne.getWeight() < carTwo.getWeight()) && (carOne.getWeight() < carThree.getWeight()) && (carOne.getWeight() < carFour.getWeight()))
            {
                label = 1;
                count = cars;
            }
            else if(carTwo.getWeight() < carThree.getWeight() && carTwo.getWeight() < carFour.getWeight())
            {
                label = 2;
                count = cars;
            }
            else if(carThree.getWeight() < carFour.getWeight())
            {
                label = 3;
                count = cars;
            }


        }
        if(label == 1)
        {
            return "The lightest car is the " + carOne.getModel() + " which weighs " + carOne.getWeight() + ".";
        }
        else if(label == 2)
        {
            return "The lightest car is the " + carTwo.getModel() + " which weighs " + carTwo.getWeight() + ".";
        }
        return "The lightest car is the " + carFour.getModel() + " which weighs " + carFour.getWeight() + " pounds.";
    }
    public static String findLightest(Car carOne, Car carTwo)
    {
        int label = 0; // temporary variable to track which car is lightest
        for(int i = 0; i < cars; i++) //new loop
        {
            if((carOne.getWeight() < carTwo.getWeight()))
            {
                label = 1;
                i = cars;
            }
            else
            {
                label = 2;
                i = cars;
            }
        }
        if(label == 1)
        {
            return "The lightest car is the " + carOne.getModel() + " which weighs " + carOne.getWeight() + ".";
        }
        else
        {
            return "The lightest car is the " + carTwo.getModel() + " which weighs " + carTwo.getWeight() + ".";
        }
    }


    public static String compareType(Car car1, Car car2)
    {
        if(car1.getClass().equals(car2.getClass()))
        {
            return "The " + car1.getModel() + " and " + car2.getModel() + " are the same car type.";
        }
        else
        {
            return "The " + car1.getModel().substring(0, car1.getModel().length()) + " and " + car2.getModel() + " are not the same car type.";
        }
    }

    public static String findCheapest(Car car1, Car car2, Car car3)
    {
            if(car1.getPrice() < car2.getPrice() && car1.getPrice() < car3.getPrice())
            {
                return "The " + car1.getBrand() + " " + car1.getModel() + " is the cheapest car from the " + car2.getBrand() + " " + car2.getModel() + " and the "  + car3.getBrand() + " " + car3.getModel();
            }
            else if(car2.getPrice() < car1.getPrice() && car2.getPrice() < car3.getPrice())
            {
                return "The " + car2.getBrand() + " " + car2.getModel() + " is the cheapest car from the " + car1.getBrand() + " " + car1.getModel() + " and the "  + car3.getBrand() + " " + car3.getModel();
            }
            else
            {
                return "The " + car3.getBrand() + " " + car3.getModel() + " is the cheapest car from the " + car2.getBrand() + " " + car2.getModel() + " and the "  + car1.getBrand() + " " + car1.getModel();
            }
    }


}


