package Chapter6;

public class NoCommand implements Command {
    @Override
    public void execute() {
        return;
    }

    @Override
    public void undo() {

    }
}
