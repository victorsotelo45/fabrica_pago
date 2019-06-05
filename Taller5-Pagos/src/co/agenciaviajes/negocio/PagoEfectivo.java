package co.agenciaviajes.negocio;

import java.util.Scanner;

/**
 * Pago en efectivo
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoEfectivo extends Pago {

    @Override
    public void registrarPago() {
        Scanner aux = new Scanner(System.in);
        String id, nombre, apellido, genero, email;
        System.out.println("Ingrese desde el teclado el");
        System.out.print("id: ");
        id=aux.next();
        System.out.print("Nombre: ");
        nombre = aux.next();
        System.out.print("Apellidos: ");
        apellido = aux.next();
        System.out.print("Genero: ");
        genero = aux.next();
        System.out.print("Email: ");
        email = aux.next();
        cliente = new Cliente(id,nombre,apellido,genero,email);
        System.out.println("Ingrese valor en efectivo");
        valor = aux.nextInt();
        System.out.println("------------------------------------------------------");
        System.out.println("Pago en efectivo registrado en el sistema con exito");
        System.out.println("Cliente: "+cliente.toString());
        System.out.println("Valon: "+valor);
    }


}
