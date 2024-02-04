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
                numero = numero + "1";   //Numero de cada tecla
                RETIROTextField.setText("$"+numero+".00"); //Así se verá en el textfield


            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "2";
                RETIROTextField.setText("$"+numero+".00");


            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "3";
                RETIROTextField.setText("$"+numero+".00");

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "4";
                RETIROTextField.setText("$"+numero+".00");

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "5";
                RETIROTextField.setText("$"+numero+".00");

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "6";
                RETIROTextField.setText("$"+numero+".00");

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "7";
                RETIROTextField.setText("$"+numero+".00");

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "8";
                RETIROTextField.setText("$"+numero+".00");

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "9";
                RETIROTextField.setText("$"+numero+".00");

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = numero + "0";
                RETIROTextField.setText("$"+numero+".00");

            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.tran.setVisible(true);//aquí se podrá regresar al menú
                Transaccion.retiro.dispose();

            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float val = Float.parseFloat(numero);
                if (Dinero.retirarMonto(val)) {  // se restará el valor del saldo si se ingresa correctamente
                    RETIROTextField.setText("$");
                    numero="";
                }else{
                    RETIROTextField.setText("$");
                    numero="";
                }
            }
        });
        RETIROTextField.setEditable(false); //entrada por teclado bloqueada
    }
}


