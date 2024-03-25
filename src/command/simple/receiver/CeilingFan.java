package command.simple.receiver;

public class CeilingFan {
    String location;
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        System.out.println(location + " ceiling fan is on high");

    }

    public void off() {
        level = 0;
        System.out.println(location + " ceiling fan is off");
    }

}
