import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro {
    private JTextField RETIROTextField;
    private JButton a9Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton enterButton;
    private JButton a0Button;
    private JButton MENUButton;
    public JPanel retiroPanel;

    public String numero = "";


    public Retiro() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "1";
                RETIROTextField.setText(numero);


            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "2";
                RETIROTextField.setText(numero);


            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "3";
                RETIROTextField.setText(numero);

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "4";
                RETIROTextField.setText(numero);

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "5";
                RETIROTextField.setText(numero);

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "6";
                RETIROTextField.setText(numero);

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "7";
                RETIROTextField.setText(numero);

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "8";
                RETIROTextField.setText(numero);

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "9";
                RETIROTextField.setText(numero);

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "0";
                RETIROTextField.setText(numero);

            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.tran.setVisible(true);
                Transaccion.retiro.dispose();

            }
        });
    }
}


