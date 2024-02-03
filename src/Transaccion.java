import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaccion {
    static JFrame saldo = new JFrame("Saldo");
    static JFrame retiro = new JFrame("Retiro");
    static JFrame deposito = new JFrame("Deposito");
    private JRadioButton verSaldoRadioButton;
    public JPanel ElegirTransaccion;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;
    private JPanel opciones;

    public Transaccion() {
        verSaldoRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                saldo.setContentPane(new Saldo().saldoPanel);
                saldo.setVisible(true);
                saldo.setSize(700,500);
                saldo.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                login.tran.dispose();
            }
        });

        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                retiro.setContentPane(new Retiro().retiroPanel);
                retiro.setVisible(true);
                retiro.setSize(700,500);
                retiro.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                login.tran.dispose();
            }
        });

        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                deposito.setContentPane(new Deposito().depositoPanel);
                deposito.setVisible(true);
                deposito.setSize(700,500);
                deposito.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                login.tran.dispose();
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.inicio.setVisible(true);
                login.tran.dispose();
            }
        });
    }
}
