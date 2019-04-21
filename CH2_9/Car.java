import com.sun.scenario.effect.Effect;

/* 
 * Implement a class Car that models a car traveling along the x-axis,
 * consuming gas as it moves. Provide methods to drive by a given number of
 * miles, to add a given number of gallons to the gas tank, and to get the current
 * distance from the origin and fuel level. Specify the fuel efficiency (in
 * miles/gallons) in the constructor. Should this be an immutable class? Why or
 * why not?
 */

// This should be a mutable class becuase the fuel and distance are always changing.

public class Car {

    private double fuel;
    private double distance;
    private double efficiency;

    public Car(double fuel, double distance, double efficiency) {
        this.fuel = fuel;
        this.distance = distance;
        this.efficiency = efficiency;
    }

    public double getFuel() {
        return this.fuel;
    }

    public double getDistance() {
        return this.distance;
    }

    public double getEfficiency() {
        return this.efficiency;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public void fillTank(double amount) {
        this.fuel = this.fuel + amount;
    }

    public void drive(double miles) {
        double neededFuel = miles / this.efficiency;
        if (neededFuel <= this.fuel) {
            this.distance += miles;
            this.fuel -= neededFuel;
        } else {
            System.out.printf("Not enough fuel to drive %.2f miles\n", miles);
        }
    }

    public static void main(String args[]) {
        Car car = new Car(10, 0, 20);
        car.drive(300);
        car.drive(200);
        car.fillTank(10);
        System.out.printf("fuel: %.2f, distance: %.2f, eff: %.2f", car.getFuel(), car.getDistance(), car.getEfficiency());
    }
}
