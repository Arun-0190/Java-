//in this we'll see how to use the methods with return type other than void and how to use return in the methods
class Vehicle{
    int passenger;               //number of passengers
    int fuelcap;                //fuel capacity in gallons
    int mpg;                    //fuel consumption in miles per gallon

    //Returning the range
    int Range(){

        //return the range
        return mpg*fuelcap;
    }

}

class ReturnMethod {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle car = new Vehicle();

        int range1, range2;

        //assign values to the fields in minivan
        minivan.passenger = 8;
        minivan.fuelcap = 16;
        minivan.mpg = 23;

        //for car
        car.passenger = 4;
        car.fuelcap = 14;
        car.mpg = 18;

        //get the ranges
        range1 = minivan.Range();
        range2 = car.Range();

        System.out.println("Minivan can carry "+minivan.passenger+" people with range of "+range1+" Miles");
        System.out.println("Car can carry "+car.passenger+" people with range of "+range2+" Miles");

        //We can use it directly too
        Vehicle bike = new Vehicle();

        bike.passenger = 2;
        bike.fuelcap = 10;
        bike.mpg = 25;
        //using the return of method directly
        System.out.println("Bike can carry "+bike.passenger+" people with range of "+bike.Range()+" Miles");
    }

}
