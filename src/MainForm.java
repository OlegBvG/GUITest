import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MainForm {
    private JPanel mainPanel;
    private JButton expandButton;
    private JTextField familieTextField;
    private JTextField nameTextField;
    private JTextField surnameTextField;
    private JTextArea fioTextArea;
    private JPanel expandPanel;
    private JPanel collapsePanel;

    public MainForm()
    {
        expandButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] fio;
                final int  FAMILIE = 0;
                final int  NAME = 1;
                final int  SURNAME = 2;



                if (expandButton.getText() == "Collapse"){
                    if (familieTextField.getText().trim().length() > 0 && nameTextField.getText().trim().length() > 0) {
                        expandButton.setText("Expand");
                        expandPanel.setVisible(false);
                        collapsePanel.setVisible(true);
                        fioTextArea.setText(collapseText());
                    } else JOptionPane.showMessageDialog( null, "Введите корректные данные" );
                }

                else {
                    fio = fioTextArea.getText().trim().split("\\s+");
                    if (fio.length > 1) {
                        expandButton.setText("Collapse");
                        expandPanel.setVisible(true);
                        collapsePanel.setVisible(false);
                        familieTextField.setText(fio[FAMILIE]);
                        nameTextField.setText(fio[NAME]);
                        surnameTextField.setText("");

                        if (fio.length > 2) surnameTextField.setText(fio[SURNAME]);

                    } else JOptionPane.showMessageDialog( null, "Введите корректные данные" );
                }


            }
        });

    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private String collapseText(){
        return familieTextField.getText() + " " + nameTextField.getText() + " " +  surnameTextField.getText();
    }
}
