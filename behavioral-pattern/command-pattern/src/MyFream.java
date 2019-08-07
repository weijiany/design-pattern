import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFream extends JFrame implements ActionListener {

    private JPanel panel;
    private YellowCommand btnYellow;
    private RedCommand btnRed;
    private ExitCommand btnExit;

    public MyFream() {
        super("命令模式");
        panel = new JPanel();
        this.add(panel);
        btnYellow = new YellowCommand("黄色", panel);
        btnRed = new RedCommand("红色", panel);
        btnExit = new ExitCommand("退出");

        panel.add(btnYellow);
        panel.add(btnRed);
        panel.add(btnExit);

        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
        btnExit.addActionListener(this);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyCommand command = (MyCommand) e.getSource();
        command.execute();
    }

    public static void main(String[] args) {
        new MyFream();
    }
}
