// Abstract class - Abstraction
abstract class Appliance {
    private int powerRating; // Encapsulation

    public Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    // Getter and Setter - Encapsulation
    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    // Abstract methods - Abstraction
    public abstract void turnOn();
    public abstract void turnOff();
}

// Fan class - Inheritance
class Fan extends Appliance {
    public Fan(int powerRating) {
        super(powerRating);
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is turned ON. Power: " + getPowerRating() + "W");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

// Light class - Inheritance
class Light extends Appliance {
    public Light(int powerRating) {
        super(powerRating);
    }

    @Override
    public void turnOn() {
        System.out.println("Light is turned ON. Power: " + getPowerRating() + "W");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}

// AC class - Inheritance
class AC extends Appliance {
    public AC(int powerRating) {
        super(powerRating);
    }

    @Override
    public void turnOn() {
        System.out.println("AC is turned ON. Power: " + getPowerRating() + "W");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Fan fan = new Fan(75);
        Light light = new Light(20);
        AC ac = new AC(1500);

        fan.turnOn();
        fan.turnOff();

        System.out.println();

        light.turnOn();
        light.turnOff();

        System.out.println();

        ac.turnOn();
        ac.turnOff();
    }
}
