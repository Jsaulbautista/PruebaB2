import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Saldo { //En este JFrame se reflejará el saldo actual de la} ceuenta con depositos y retiros

    private JButton menúButton;
    public JPanel saldoPanel;
    private JLabel saldoL;

    public Saldo() {
        menúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //Regresa al menú
                login.tran.setVisible(true);
                Transaccion.saldo.dispose();
            }
        });
        double saldo = Dinero.getSaldo();
        DecimalFormat df = new DecimalFormat("#0.00");
        saldoL.setText("$" + df.format(saldo)); //Definí un formato como quería que viera la cantidad y modifica el label
    }
}
