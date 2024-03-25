package facade.system;

public class Tuner {
    String description;
    Amplifier amplifier;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public String toString() {
        return description;
    }
}
