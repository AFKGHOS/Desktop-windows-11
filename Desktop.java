import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   public class Desktopp {
    public static void main(String[] args) {
        JFrame Frame = new JFrame("Desktop Windows 11");
        Frame.setSize(1000, 2000);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JButton button = new JButton("Start PC");
        button.setBounds(20, 20, 200, 30);
        
        button.addActionListener(e -> {
            JFrame containerFrame = new JFrame("Parola");
            containerFrame.setSize(200, 300);

            JTextField textField = new JTextField("Parola");
            textField.setBounds(10, 10, 200, 30);

            JButton okButton = new JButton("Save as");
            okButton.setBounds(10, 10, 200, 30);

        containerFrame.add(textField);
        containerFrame.setLayout(null);
        containerFrame.setVisible(true);

        containerFrame.add(okButton);
        containerFrame.setLayout(null);
        containerFrame.setVisible(true);
        });

    Frame.add(button);
    Frame.setLayout(null);
    Frame.setVisible(true);

    }
   }
