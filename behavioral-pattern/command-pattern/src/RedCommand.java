import javax.swing.*;
import java.awt.*;

public class RedCommand extends JButton implements MyCommand {

    private JPanel panel;

    public RedCommand(String text, JPanel panel) {
        super(text);
        this.panel = panel;
    }

    @Override
    public void execute() {
        this.panel.setBackground(Color.RED);
    }
}
