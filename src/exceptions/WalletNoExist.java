package exceptions;

public class WalletNoExist extends Exception{
    public WalletNoExist(){
        super("La información de las cuentas no es consistente");
    }
}
