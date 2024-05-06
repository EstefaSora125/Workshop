package exceptions;

/**
 * Se define la excepción de cuando las cuentas no existen
 * @author Estefania Sora
 * @version 05/05/2024
 */
public class WalletNoExist extends Exception{
    public WalletNoExist(){
        super("La información de las cuentas no es consistente");
    }
}
