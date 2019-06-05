package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta débito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaDebito extends Pago {

    String codigo, banco, numeroCuenta;
    
    @Override
    public void registrarPago() {
                //Aqui vendria la logica para grabar en la base de datos
        System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("125478221", "Angela Maria", "Benavides", "F", "angela@gmail.com");
        this.setCliente(cliente);

        this.setValor(45600122); // Cualquier valor de una logica de negocio que aun no se tiene
        this.setCodigo("1254578");
        this.setBanco("Caja social");
        this.setNumeroCuenta("45362");

        System.out.println("Pago con tarjeta debito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Banco: " + this.getBanco());
        System.out.println("Número cuenta: " + this.getNumeroCuenta());
        System.out.println("Valor: " + this.getValor());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    

}
