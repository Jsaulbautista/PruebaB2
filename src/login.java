import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JPasswordField contraField;
    private JButton iniciarSesionBoton;
    private JLabel inicio;
    private JLabel usuariolbl;
    private JLabel contralbl;
    private JLabel usuarioDatoQ;
    public JPanel loginPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a7Button;
    private JButton a0Button;
    private JButton a8Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton ENTERButton;
    private JTextField pantalla;
    public String numero = "";

    public login() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "1";
                contraField.setText(numero);
                pantalla.setText(numero);

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "2";
                contraField.setText(numero);
                pantalla.setText(numero);

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "3";
                contraField.setText(numero);
                pantalla.setText(numero);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "4";
                contraField.setText(numero);
                pantalla.setText(numero);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "5";
                contraField.setText(numero);
                pantalla.setText(numero);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "6";
                contraField.setText(numero);
                pantalla.setText(numero);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "7";
                contraField.setText(numero);
                pantalla.setText(numero);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "8";
                contraField.setText(numero);
                pantalla.setText(numero);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "9";
                contraField.setText(numero);
                pantalla.setText(numero);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "0";
                contraField.setText(numero);
                pantalla.setText(numero);
            }
        });
    }
}


// otra forma?
/*
numero = numero + "2";
                contraField.setText(numero);
                pantalla.setText(numero);
*/
