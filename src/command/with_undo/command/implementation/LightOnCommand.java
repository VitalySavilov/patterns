package command.with_undo.command.implementation;

import command.with_undo.command.Command;
import command.with_undo.receiver.Light;

public class LightOnCommand implements Command {
    Light light;
    int level;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.on();
    }

    public void undo() {
        light.dim(level);
    }
}
