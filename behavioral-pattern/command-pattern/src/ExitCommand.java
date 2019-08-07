import javax.swing.*;

public class ExitCommand extends JButton implements MyCommand {

    public ExitCommand(String text) {
        super(text);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
