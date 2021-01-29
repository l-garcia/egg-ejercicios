package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class CuentaService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

   Cuenta cuenta = new Cuenta();
   double saldoAct,retirar;

    public void actualizarSaldo() {
        saldoAct = cuenta.getSaldo() * (cuenta.getInteres() / 365);
        cuenta.setSaldo(saldoAct);
    }
    public void ingresar(Cuenta cuenta){
        System.out.println("ingrese un monto");  

        cuenta.setSaldo(cuenta.getSaldo()+sc.nextDouble());
     
    }
    public void retirar(Cuenta cuenta){
        System.out.println("cuanto dinero desea retirar?");
        retirar=sc.nextDouble();
        if (retirar<=cuenta.getSaldo()) {
           retirar= cuenta.getSaldo()- retirar;
            cuenta.setSaldo(retirar);
        }else System.out.println("saldo insuficiente!!");
    }
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Su saldo es: "+cuenta.getSaldo());
    }
    public void consultarDatos(Cuenta cuenta){
        System.out.println("numero de cuenta: " +cuenta.getNumeroCuenta());
        System.out.println("numero de DNI: "+cuenta.getDni());
        System.out.println("intereses anuales: " + cuenta.getInteres());
        System.out.println("saldo en cuenta: "+cuenta.getSaldo());
    }
}
