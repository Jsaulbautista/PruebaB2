import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito {
    private JTextField depositoField;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton MENUButton;
    private JButton a0Button;
    private JButton ENTERButton;
    public JPanel depositoPanel;
    public String numero = "";

    public Deposito() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "1";
                depositoField.setText("$"+numero+".00"); //Se define el valor para cada tecla y cómo se verá en el textfield
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "2";
                depositoField.setText("$"+numero+".00");


            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "3";
                depositoField.setText("$"+numero+".00");

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "4";
                depositoField.setText("$"+numero+".00");

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "5";
                depositoField.setText("$"+numero+".00");

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "6";
                depositoField.setText("$"+numero+".00");

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "7";
                depositoField.setText("$"+numero+".00");

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "8";
                depositoField.setText("$"+numero+".00");

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "9";
                depositoField.setText("$"+numero+".00");

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "0";
                depositoField.setText("$"+numero+".00");

            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //Aquí regresará al menú y cerrará esta pantalla
                login.tran.setVisible(true);
                Transaccion.deposito.dispose();
            }
        });
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //Al pulsar enter se actualziará el valor del saldo
                Dinero.actualizarSaldo(Float.parseFloat(numero));
                depositoField.setText("$");
                numero="";
            }
        });
        depositoField.setEditable(false); //Se bloqueó la edición por teclado
    }
}
