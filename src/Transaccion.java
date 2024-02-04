import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaccion {
    static JFrame saldo = new JFrame("Saldo");
    static JFrame retiro = new JFrame("Retiro");
    static JFrame deposito = new JFrame("Deposito");
    private JRadioButton verSaldoRadioButton;
    public JPanel ElegirTransaccion;
    private JRadioButton retiroRadioButton; //Declaracion diferentes opciones del menú
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;
    private JPanel opciones;
    public ButtonGroup buttonGroup;

    public Transaccion() {
        buttonGroup = new ButtonGroup(); //se creó un group button que se usará en la selección
        verSaldoRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                saldo.setContentPane(new Saldo().saldoPanel);  //Este abre la pantalla de visualizar el saldo
                saldo.setUndecorated(true); //A las 3 pantallas vamos a palicarle para impedir cerrar o maximizar
                saldo.setVisible(true);
                saldo.setSize(700,500);
                saldo.setLocationRelativeTo(null);

                clearSelection();
                login.tran.dispose();
            }
        });

        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                retiro.setContentPane(new Retiro().retiroPanel); //Aqui abrimos la pantalla de retiro, y cerramos el menú
                retiro.setUndecorated(true);
                retiro.setVisible(true);
                retiro.setSize(700,500);
                retiro.setLocationRelativeTo(null);

                clearSelection();
                login.tran.dispose();
            }
        });

        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                deposito.setContentPane(new Deposito().depositoPanel); //Pantalla de depositos, se cierra menú
                deposito.setUndecorated(true);
                deposito.setVisible(true);
                deposito.setSize(700,500);
                deposito.setLocationRelativeTo(null);

                clearSelection(); //Después de elegir, se limpia el menú
                login.tran.dispose();

            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.tran.dispose();
                JFrame gracias = new JFrame("Error de autenticación"); //JDialog para contraseñ aincorrecta
                Object[] options = {"OK"};
                JOptionPane pane = new JOptionPane("Muchas gracias", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
                JDialog dialog = pane.createDialog(gracias, "Muchas gracias");
                dialog.setVisible(true);
            }
        });
        buttonGroup.add(verSaldoRadioButton); //Se añade todos los botones al group
        buttonGroup.add(retiroRadioButton);
        buttonGroup.add(depositoRadioButton);
        buttonGroup.add(salirRadioButton);
    }
    private void clearSelection() { //se crea este método para utilizarlo después de la selección de una opción
        buttonGroup.clearSelection(); //La utilizaremos, y desmaracará todos los radioButtons
    }
}
