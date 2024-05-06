package exceptions;

/**
 * Se define la excepción de cuando la cartera no cuenta con fondos suficientes
 * @author Estefania Sora
 * @version 05/05/2024
 */
public class OutOfMoney extends Exception{
    public OutOfMoney(){
        super("La cuenta no tiene los fondos suficientes");
    }
}
