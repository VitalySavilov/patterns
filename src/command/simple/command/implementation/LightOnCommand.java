package command.simple.command.implementation;

import command.simple.command.Command;
import command.simple.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
