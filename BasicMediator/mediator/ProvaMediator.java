package mediator;

import javax.swing.*;

// Esempio di utilizzo del pattern Mediator con widgets
public class ProvaMediator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField nomeTextField = new JTextField(20);
        JTextField cognomeTextField = new JTextField(20);
        JButton salvaButton = new JButton("Salva");
        salvaButton.setEnabled(false);

        frame.add(new JLabel("Nome:"));
        frame.add(nomeTextField);
        frame.add(new JLabel("Cognome:"));
        frame.add(cognomeTextField);
        frame.add(salvaButton);



        frame.pack();
        frame.setVisible(true);
    }

}