package command.with_undo.command;

public interface Command {
    void execute();

    void undo();
}
