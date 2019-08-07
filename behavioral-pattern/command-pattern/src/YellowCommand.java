import javax.swing.*;
import java.awt.*;

public class YellowCommand extends JButton implements MyCommand {

    private JPanel panel;

    public YellowCommand(String text, JPanel panel) {
        super(text);
        this.panel = panel;
    }

    @Override
    public void execute() {
        this.panel.setBackground(Color.YELLOW);
    }
}
