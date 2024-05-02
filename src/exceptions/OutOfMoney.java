package exceptions;

public class OutOfMoney extends Exception{
    public OutOfMoney(){
        super("La cuenta no tiene los fondos suficientes");
    }
}
