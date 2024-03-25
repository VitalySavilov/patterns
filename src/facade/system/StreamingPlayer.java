package facade.system;

public class StreamingPlayer {
    String description;
    int currentChapter;
    Amplifier amplifier;
    String movie;

    public StreamingPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void play(String movie) {
        this.movie = movie;
        currentChapter = 0;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void stop() {
        currentChapter = 0;
        System.out.println(description + " stopped \"" + movie + "\"");
    }

    public String toString() {
        return description;
    }
}
