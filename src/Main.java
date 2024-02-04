import javax.swing.*;

public class Main {
    static JFrame inicio = new JFrame("Iniciar Sesión"); //JFrame static para modificar fácilmente
    public static void main(String[] args) {

        inicio.setContentPane(new login().loginPanel); //JFrame que se muestra al ejecutar
        inicio.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        inicio.setSize(700,500);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);

    }
}