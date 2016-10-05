/**
 *
 * @author jonathan morelos - matricula: 16481128
 */
// ITNL Sistemas Computacionales
// Creando un atm (Automatic Teller Machine) //Modo secuencial
package atm;
import java.util.Scanner;

public class Atm {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables y datos de la cuenta
        double saldo = 4373.78;
        int rNumCuenta = 16481128;
        int rNip = 1901;
        //Objeto para leer input
        Scanner entrada = new Scanner(System.in);
        //Mensaje de bienvenida
        System.out.print("Bienvenido \n");
        System.out.print("Ingrese su numero de cuenta: \n");
        //leer informacion de la cuenta
        int numCuenta=entrada.nextInt();
        int nip=entrada.nextInt();
        //validar informacion de la cuenta
        if (numCuenta == rNumCuenta && nip == rNip) {
            System.out.println("Menu principal \n");
            //variable para tener trabajando el Do While
            boolean e = true;
            //Menu para realizar las 4 funcionalidades de un atm
            do {
                System.out.println("1 => Ver mi saldo \n");
                System.out.println("2 => Retirar efectivo \n");
                System.out.println("3 => Depositar fondos \n");
                System.out.println("4 => Salir \n");
                //leer la opcion
                int nPresiona=entrada.nextInt();
                //Opciones del atm
                switch(nPresiona){
                    case 1:
                        System.out.println("Saldo actual: ");
                        System.out.print(saldo + "\n");

                    break;
                    case 2:
                        System.out.print("Retirar efectivo \n" + ""
                                + "Cuanto desea retirar ? \n");
                        int retiro=entrada.nextInt();
                        System.out.println("Saldo actual: ");
                        System.out.println(saldo-retiro);

                    break;
                    case 3:
                        System.out.print("Depositar fondos \n" + ""
                                + "Cuanto desea agregar ? \n");
                        int deposito=entrada.nextInt();
                        System.out.println("Saldo actual: ");
                        System.out.println(saldo+deposito);
                    break;
                    case 4:
                        System.out.print("Salir " + "\n");
                        e=false;

                    break;
                }
            } while (e == true);

        }else{
            System.out.println("Esa informacion no es correcta !! \n");
        }

    }

}
