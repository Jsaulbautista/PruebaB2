import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class login {
    static JFrame tran = new JFrame();
    private JPasswordField contraField;
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
                numero = numero + "1";  //Listener para el botón de cada tecla del keypad
                contraField.setText(numero); //Se modifica el textfield de estamanera
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "2"; //se repite la misma acción que en el primero con todas las teclas
                contraField.setText(numero);


            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "3";
                contraField.setText(numero);

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "4";
                contraField.setText(numero);

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "5";
                contraField.setText(numero);

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "6";
                contraField.setText(numero);

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "7";
                contraField.setText(numero);

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "8";
                contraField.setText(numero);

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "9";
                contraField.setText(numero);

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "0";
                contraField.setText(numero);

            }
        });


        ENTERButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String contrasena = "1111";  //Contraseña quemada, valor que debe ingresarse para ingresar
                try {
                    if (contrasena.equals(numero)) {
                        tran.setContentPane(new Transaccion().ElegirTransaccion);
                        tran.setSize(700,500);
                        tran.setVisible(true);
                        tran.setLocationRelativeTo(null); //Se abre el menú si ingresa clave correcta
                        Main.inicio.dispose(); //Se cierra la primera pantalla
                    } else {
                        JFrame emergente = new JFrame("Error de autenticación"); //JDialog para contraseñ aincorrecta
                        Object[] options = {"OK"};
                        JOptionPane pane = new JOptionPane("Intentar otra vez", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
                        JDialog dialog = pane.createDialog(emergente, "Usuario incorrecto");
                        dialog.setVisible(true);
                    }
                    numero = "";
                    contraField.setText(numero); //Valores reiniciados al salir
                } catch (Exception ex) {
                    JFrame emergente = new JFrame("Error"); //Caso de error
                    JOptionPane.showMessageDialog(emergente, "Error en el inicio de sesión");
                    ex.printStackTrace();
                }

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
