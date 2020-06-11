import javax.swing.*;

public class Main
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);

        MainForm mainForm = new MainForm();
        frame.add(mainForm.getMainPanel());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
