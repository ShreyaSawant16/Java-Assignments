package oopconcepts;

interface RemoteControl {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV ON");
    }

    public void turnOff() {
        System.out.println("TV OFF");
    }
}

class AirConditioner implements RemoteControl {
    public void turnOn() {
        System.out.println("AC ON");
    }

    public void turnOff() {
        System.out.println("AC OFF");
    }
}

public class RemoteControlInterface {
    public static void main(String[] args) {
        RemoteControl r1 = new TV();
        RemoteControl r2 = new AirConditioner();

        r1.turnOn();
        r1.turnOff();

        r2.turnOn();
        r2.turnOff();
    }
}