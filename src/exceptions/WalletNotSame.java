package exceptions;
/**
 * Se define la excepción de cuando las carteras ingresadas para la transacción son las mismas
 * @author Estefania Sora
 * @version 05/05/2024
 */
public class WalletNotSame extends Exception{
    public WalletNotSame(){
        super("Las wallet no pueden ser las mismas");
    }
}
