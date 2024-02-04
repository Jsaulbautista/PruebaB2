import javax.swing.*;

public class Dinero {  //Desde esta clase se modificará la cuenta
    private static float saldo = 0; //se declara incialmente en 0

    public static float getSaldo() {   //Retornará el valor que necesitamos para el reporte
        return saldo;
    }
    public static void actualizarSaldo(float monto) {  //metodo para deposito donde se aumentará
        saldo += monto;
    }
    public static boolean retirarMonto(float monto) { //Esto será para los retiros
        if (saldo < monto) {    //se creó un if porque era necesaria una validacion, hay números que no deberpian ingresarse
            JFrame salIns = new JFrame("Saldo insuficiente");  //Si el valor que se ingresó es menor al saldo actual, Jdialog de error
            JOptionPane.showMessageDialog(salIns, "Saldo insuficiente");
            return false;
        } else {
            saldo -= monto; //Si es un valor correcto, modificará el valor del saldo
            return true;
        }
    }
}
