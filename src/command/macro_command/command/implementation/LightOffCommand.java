package command.macro_command.command.implementation;

import command.macro_command.command.Command;
import command.macro_command.receiver.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
