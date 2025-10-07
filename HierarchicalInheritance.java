class Vehicle {
private String modelName;

public Vehicle(String modelName) {
this.modelName = modelName;
}
public void displayInfo() {
System.out.println("Model is " +modelName);
}
}
class Car extends Vehicle {
private int doors;

public Car(String modelName, int doors) {
super(modelName);
this.doors = doors;
}
public void showDetails() {
displayInfo();
System.out.println("Doors :"+ doors);
}
}
class Bike extends Vehicle {
private Boolean isGearless;

public Bike(String modelName, Boolean isGearless) {
super(modelName);
this.isGearless = isGearless;
}
public void showDetails() {
displayInfo();
System.out.println("Gearless: "  + (isGearless ? "yes" : "No"));
}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
Car car = new Car("Polo", 4);
Bike bike = new Bike("Splender", true);
car.showDetails();
bike.showDetails();
}
}
