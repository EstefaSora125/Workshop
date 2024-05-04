package exceptions;

public class WalletNotSame extends Exception{
    public WalletNotSame(){
        super("Las wallet no pueden ser las mismas");
    }
}
