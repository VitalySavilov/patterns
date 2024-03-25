package command.macro_command.command.implementation;

import command.macro_command.command.Command;
import command.macro_command.receiver.TV;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
