package command.simple.receiver;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " garage Door is Up");
    }

    public void down() {
        System.out.println(location + " garage Door is Down");
    }

}
