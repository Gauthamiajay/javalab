interface RemoteControl {
    void control();
}

abstract class Appliance {
    void powerOn() {
        System.out.println("Appliance is on.");
    }
}

class TV extends Appliance implements RemoteControl {
    public void control() {
        System.out.println("Remote controlling TV.");
    }
}

class InterfaceVsAbstractDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.powerOn();
        tv.control();
    }
}