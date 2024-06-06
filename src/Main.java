import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //creation of objects
        Car carOne = new Car("Honda", "NSX Type R", "White", 1992, "3.0 L V6", 270, 2712, 2, 69000, true);
        Car carTwo = new Car("Toyota", "MR2", "Blue", 1995, "2.2 L I4", 130, 2657, 2, 24655, true);
        Car carThree = new Car("Honda", "Accord", "Black", 2002, "2.3 L I4", 150, 2943, 5, 20850, false);
        Car carFour = new Car("Toyota", "Camry", "Silver", 2021, "2.5 L I4", 202, 3310, 5, 25045, false);


        Car carFive = new Truck("Chevrolet", "Silverado", "Silver", 2023, "V8", 401, 6105, 5, 41500, "Big", 14500,true);
        Car carSix = new EV("Tesla", "Model S", "Black", 2024, "Motor", 670, 4561, 5, 72990, "Dual Motor", 359, true);
        Car carSeven = new Motorcycle("Yamaha", "R6", "Blue", 2019, "I4", 116, 419, 1, 12699, "Sport Bike", 165, false);
        //end of creation of objects
        //start of demonstration of methods working
        System.out.println(Car.carCount());
        System.out.println(Car.findLightest(carOne, carTwo, carThree, carFour));
        System.out.println(Car.findLightest(carOne, carFour));
        ArrayList<Car> carList = new ArrayList<Car>();
        //populating arraylist
        carList.add(carOne);
        carList.add(carTwo);
        carList.add(carThree);
        carList.add(carFour);
        carList.add(carFive);
        carList.add(carSix);
        carList.add(carSeven);


        for(int i = 0; i < carList.size(); i++) //for loop to print out information from array list
        {
            System.out.println(carList.get(i).getBasicInfo());
            System.out.println(carList.get(i).getSpecificInfo());
            System.out.println(carList.get(i).toString());
            System.out.println();
        }

        //another demonstration of methods working
        System.out.println(Car.compareType(carOne, carTwo));
        System.out.println(Car.compareType(carTwo, carFive));
        System.out.println(Car.findCheapest(carOne, carSeven, carThree));
        System.out.println(Car.findCheapest(carTwo, carFive, carSix));
        System.out.println();
        System.out.println("(un)organized info!!!!1! " + carOne.getUnorganizedInfo(carOne));
    }
}
