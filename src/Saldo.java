import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo {
    private JTextField textField1;
    private JButton menúButton;
    public JPanel saldoPanel;

    public Saldo() {
        menúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.tran.setVisible(true);
                Transaccion.saldo.dispose();
            }
        });
    }
}
