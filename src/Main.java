import javax.swing.*;

public class Main {
    static JFrame inicio = new JFrame("Iniciar Sesión");
    public static void main(String[] args) {
        inicio.setContentPane(new login().loginPanel);
        inicio.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        inicio.setVisible(true);
        inicio.setSize(700,500);
    }
}