package StructuralDesignPatterns.Facade;

//the individual component
public class SurroundSoundSystem {
    public void on() {
        System.out.println("Surround Sound System is ON");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }

    public void off() {
        System.out.println("Surround Sound System is OFF");
    }
}
